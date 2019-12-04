/**
 * // Definition for a Node.
 * function Node(val, children) {
 *    this.val = val;
 *    this.children = children;
 * };
 */
/**
 * @param {Node} root
 * @return {number[]}
 */
var preorder = function (root) {

    if (root === null) return [];
    var list = [];
    var stack = [];
    stack.push(root);
    while (stack.length > 0) {
        var node = stack.pop();
        console.log(node.val);
        list.push(node.val);
        for (let i = node.children.length - 1; i >= 0; i--) {

            stack.push(node.children[i]);
        }
    }
    return list;

};