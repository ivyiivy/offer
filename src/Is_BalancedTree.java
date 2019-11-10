public class Is_BalancedTree {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
   public int TreeDepth(TreeNode root) {
        if (root==null)
            return 0;
        int left=TreeDepth(root.left);
        int right=TreeDepth(root.right);
        return left>right? left+1:right+1;
    }

    public boolean IsBalanced_Solution(TreeNode root) {
        if (root==null)
            return true;
        int left=TreeDepth(root.left);
        int right=TreeDepth(root.right);
        if(left-right>1||left-right<-1)
            return false;
        return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);

    }
}
