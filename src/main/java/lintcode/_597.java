package lintcode;;


public class _597 {

    static Result res = null;

    static class Result {
        TreeNode treeNode;
        int sum;
        int size;

        public Result(TreeNode treeNode, int sum, int size) {
            this.treeNode = treeNode;
            this.sum = sum;
            this.size = size;
        }
    }

    public static Result loop(TreeNode treeNode) {

        if (treeNode == null) {
            return new Result(null, 0, 0);
        }
        Result left = loop(treeNode.left);
        Result right = loop(treeNode.right);

        Result curRes = new Result(treeNode, left.sum + right.sum + treeNode.val, left.size + right.size + 1);

        if (res == null || res.sum * 1.0 / res.size < curRes.sum * 1.0 / curRes.size) {
            res = curRes;
        }
        return curRes;
    }

    public static TreeNode findSubtree2(TreeNode root) {
        if (root == null) {
            return null;
        }
        loop(root);
        return res.treeNode;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(-5);
        treeNode.right = new TreeNode(11);
        treeNode.left.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(4);
        treeNode.right.right = new TreeNode(-2);
        Result loop = loop(treeNode);
        System.out.println(res.treeNode.val);

    }
}
