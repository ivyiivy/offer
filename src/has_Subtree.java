public class has_Subtree {
    public class TreeNode{
        int val;
        TreeNode left=null;
        TreeNode right=null;
        TreeNode(int val){
            this.val=val;
        }
    }
    private boolean is_Subtree(TreeNode root1,TreeNode root2){
        if (root2==null)
            return true;

        if (root1==null)
            return false;
        if (root1.val!=root2.val)
            return false;
        else
            return is_Subtree(root1.left,root2.left)&&is_Subtree(root1.right,root2.right);

    }
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1==null ||root2==null)
            return false;
        boolean result=false;
        if(root1.val==root2.val){
            result=is_Subtree(root1,root2);
        }
        if (!result)
            result=HasSubtree(root1.left,root2);
        if(!result)
            result=HasSubtree(root1.right,root2);
        return result;
    }
}
