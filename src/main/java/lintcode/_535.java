package lintcode;;

//Definition of TreeNode:

public class _535 {
    public static int[] postTrack(TreeNode node) {
        if (node == null) {
            int[] result = new int[]{0, 0};
            return result;
        }
        int[] result = new int[2];
        int[] left = postTrack(node.left);
        int[] right = postTrack(node.right);
        //偷当前结点
        result[0] = left[1] + right[1] + node.val;
        //不偷当前节点
        result[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return result;
    }

    public static int houseRobber3(TreeNode root) {
        // write your code here
        int[] result = postTrack(root);
        return Math.max(result[0], result[1]);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        houseRobber3(root);
    }
}
