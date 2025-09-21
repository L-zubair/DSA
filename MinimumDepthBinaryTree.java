public class MinimumDepthBinaryTree {

    // TreeNode definition
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) { val = x; }
    }

    // Function to find minimum depth
    public static int minDepth(TreeNode root) {
        if (root == null) return 0;

        if (root.left == null) {
            return 1 + minDepth(root.right);
        }

        if (root.right == null) {
            return 1 + minDepth(root.left);
        }

        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }

    // Main function for testing in VS Code
    public static void main(String[] args) {
        // Example 1: [3,9,20,null,null,15,7]
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);

        System.out.println("Min depth (Example 1): " + minDepth(root1)); // Output: 2

        // Example 2: [2,null,3,null,4,null,5,null,6]
        TreeNode root2 = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.right.right = new TreeNode(4);
        root2.right.right.right = new TreeNode(5);
        root2.right.right.right.right = new TreeNode(6);

        System.out.println("Min depth (Example 2): " + minDepth(root2)); // Output: 5
    }
}
