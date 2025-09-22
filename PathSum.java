public class PathSum {

    // TreeNode definition
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) { val = x; }
    }

    // Function to check if path sum exists
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        // If leaf node, check if its value matches targetSum
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        // Subtract current node value and check subtrees
        int newTarget = targetSum - root.val;
        return hasPathSum(root.left, newTarget) || hasPathSum(root.right, newTarget);
    }

    // Main function for testing
    public static void main(String[] args) {
        // Example 1: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
        TreeNode root1 = new TreeNode(5);
        root1.left = new TreeNode(4);
        root1.right = new TreeNode(8);
        root1.left.left = new TreeNode(11);
        root1.left.left.left = new TreeNode(7);
        root1.left.left.right = new TreeNode(2);
        root1.right.left = new TreeNode(13);
        root1.right.right = new TreeNode(4);
        root1.right.right.right = new TreeNode(1);

        System.out.println("Example 1: " + hasPathSum(root1, 22)); // true

        // Example 2: root = [1,2,3], targetSum = 5
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        System.out.println("Example 2: " + hasPathSum(root2, 5)); // false

        // Example 3: root = [], targetSum = 0
        TreeNode root3 = null;
        System.out.println("Example 3: " + hasPathSum(root3, 0)); // false
    }
}
