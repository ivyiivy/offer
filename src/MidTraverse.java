import java.util.Stack;
public class MidTraverse {
    public class TreeNode{
        int val;
        TreeNode left=null;
        TreeNode right=null;
        TreeNode(int val){
            this.val=val;
        }
    }
    public void midTraverse(TreeNode root){
        if(root==null){
            return;
        }
        if (root.left==null&&root.right==null){
            Traverse(root);
        }
        Stack<TreeNode> stack=new Stack<>();
        TreeNode p=root;
        while(p!=null||!stack.isEmpty()){
            while(p!=null){
                stack.push(p);
                p=p.left;
            }
            if(!stack.isEmpty()){
                p=stack.pop();
                Traverse(p);
                p=p.right;
            }
        }
    }
    private void Traverse(TreeNode root){
        System.out.println(root.val);
    }
}
