// File: SameTree.java

import java.util.*;

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

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Case 1: if both nodes are null → trees are same
        if (p == null && q == null) {
            return true;
        }

        // Case 2: if only one is null → trees differ
        if (p == null || q == null) {
            return false;
        }

        // Case 3: if values differ → trees differ
        if (p.val != q.val) {
            return false;
        }

        // Case 4: recursively check left & right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    // Main method for testing locally
    public static void main(String[] args) {
        SameTree solution = new SameTree();

        // Example 1: p = [1,2,3], q = [1,2,3]
        TreeNode p1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(solution.isSameTree(p1, q1)); // true

        // Example 2: p = [1,2], q = [1,null,2]
        TreeNode p2 = new TreeNode(1, new TreeNode(2), null);
        TreeNode q2 = new TreeNode(1, null, new TreeNode(2));
        System.out.println(solution.isSameTree(p2, q2)); // false

        // Example 3: p = [1,2,1], q = [1,1,2]
        TreeNode p3 = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        TreeNode q3 = new TreeNode(1, new TreeNode(1), new TreeNode(2));
        System.out.println(solution.isSameTree(p3, q3)); // false
    }
}
