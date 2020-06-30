import java.util.Stack;
public class PostTraverse {
    public void postTraverse(TreeNode root){
        if(root==null){
            return;
        }
        if (root.left==null&&root.right==null){
            Traverse(root);
        }
        Stack<TreeNode> s=new Stack();
        TreeNode p=root;
        TreeNode r=null;
        while(p!=null||!s.isEmpty()){
            while(p!=null){
                s.push(p);
                p=p.left;
            }
            p=s.peek();
            if(p.right!=null&&p.right!=r){  //判断右节点是否已访问过
                p=p.right;
            }
            else{
                p=s.pop();
                Traverse(p);
                r=p;
                p=null;

            }
        }
    }
    private void Traverse(TreeNode root){
        System.out.println(root.val);
    }

}
