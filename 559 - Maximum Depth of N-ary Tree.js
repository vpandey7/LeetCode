/**
 * // Definition for a Node.
 * function Node(val,children) {
 *    this.val = val;
 *    this.children = children;
 * };
 */
/**
 * @param {Node} root
 * @return {number}
 */
var maxDepth = function (root) {
    var depth = 0;
    if (root == null)
        return depth;
    for (var child of root.children) {
        depth = Math.max(depth, maxDepth(child));
    }
    return depth + 1;
};