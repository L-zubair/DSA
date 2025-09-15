// File: BinaryTreeInorderTraversal.java

import java.util.*;

// TreeNode class definition
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

// Solution class with inorder traversal
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            result.add(current.val);

            current = current.right;
        }

        return result;
    }
}

// Main class to test the solution
public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        // Create a sample tree: [1, null, 2, 3]
        //       1
        //        \
        //         2
        //        /
        //       3
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        // Call inorder traversal
        Solution sol = new Solution();
        List<Integer> result = sol.inorderTraversal(root);

        // Print the result
        System.out.println(result);  // Expected output: [1, 3, 2]
    }
}
