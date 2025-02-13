class TreeNode {
    int val;
    TreeNode left, right;

     TreeNode(int data) {
        val = data;
        left = right = null;
    }

    
}

class BinaryTree {
    TreeNode root;

    // Inorder Traversal: Left -> Root -> Right
    void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.left);  // Visit Left Subtree
            System.out.print(node.val + " ");  // Visit Root
            inorderTraversal(node.right); // Visit Right Subtree
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("Inorder Traversal:");
        tree.inorderTraversal(tree.root);  // Output: 4 2 5 1 3
    }
}
