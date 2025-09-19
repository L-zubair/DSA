// File: SortedArrayToBST.java

// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int val) { 
        this.val = val; 
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        return build(nums, 0, nums.length - 1);
    }

    private TreeNode build(int[] nums, int left, int right) {
        if (left > right) return null;

        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);

        node.left  = build(nums, left, mid - 1);
        node.right = build(nums, mid + 1, right);

        return node;
    }

    // Helper method to print inorder traversal (to test the tree)
    public void inorderPrint(TreeNode root) {
        if (root == null) return;
        inorderPrint(root.left);
        System.out.print(root.val + " ");
        inorderPrint(root.right);
    }

    // Main method for testing
    public static void main(String[] args) {
        SortedArrayToBST solution = new SortedArrayToBST();
        int[] nums = {-10, -3, 0, 5, 9};

        TreeNode root = solution.sortedArrayToBST(nums);

        System.out.println("Inorder Traversal of BST:");
        solution.inorderPrint(root); // Should print sorted array again
    }
}
