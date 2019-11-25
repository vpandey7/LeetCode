/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number} val
 * @return {TreeNode}
 */
var insertIntoBST = function (root, val) {

    var newNode = new TreeNode(val);

    if (root === null) {
        root = newNode;
    }
    let currentNode = root;
    while (true) {
        if (val < currentNode.val) {
            if (!currentNode.left) {
                currentNode.left = newNode;
                return root;
            } else {
                currentNode = currentNode.left;
            }
        } else if (val > currentNode.val) {
            if (!currentNode.right) {
                currentNode.right = newNode;
                return root;
            } else {
                currentNode = currentNode.right;
            }
        }
    }
    return root;

};