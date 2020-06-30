public class LowestAncestor {

    /*求解n1和n1的最近公共祖先
     *
     * 利用后序遍历求解
     */
    public TreeNode getLowestAncestor(TreeNode head,TreeNode n1,TreeNode n2){
        if(head==null || head==n1 || head==n2){
            return head;
        }

        //先遍历左右子树，左右子树的返回为left和right；然后判断left和right情况
        TreeNode left=getLowestAncestor(head.left,n1,n2);
        TreeNode right=getLowestAncestor(head.right,n1,n2);


        /*左和右都不为null---说明在左子树中发现过n1或n2，
         * 在右子树上也发现过n1或n2，并且n1和n2在当前节点首次相遇
         */
        if(left!=null && right!=null){
            return head;
        }

        /*左和右中一个不为null，另一个为null，
         * 说明不为null的节点是n1或n2中的一个，或者是n1和n2的最近祖先；
         * 直接返回；
         */
        if(left!=null){
            return left;
        }
        if(right!=null){
            return right;
        }

        //左和右均为null，没有发现n1和n2；
        return null;
    }

}