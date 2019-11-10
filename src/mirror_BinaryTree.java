public class mirror_BinaryTree {
    public class TreeNode {
        int val;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public void Mirror(TreeNode root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null)
            return;
        TreeNode temp = null;
        temp = root.left;
        root.left = root.right;
        root.right = temp;
        Mirror(root.left);
        Mirror(root.right);
//        if (root==null)
//            return;
//        if (root.left==null&&root.right==null)
//            return;

    }
}
