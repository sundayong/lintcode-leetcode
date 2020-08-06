package leetcode;

//  Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class _938 {
    public int rangeSumBST(TreeNode root, int L, int R) {
        return 0;
    }

    public static void main(String[] args) {
        //int[] root = {10, 5, 15, 3, 7, null, 18};
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(5);
        treeNode.right = new TreeNode(15);
        treeNode.left.left = new TreeNode(3);
        treeNode.left.right = new TreeNode(7);
        int L = 7, R = 15;
//        System.out.println(new _938().rangeSumBST());
    }
}
