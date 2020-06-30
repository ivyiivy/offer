import java.util.Stack;

public class PreTraverse {
    public class TreeNode{
        int val;
        TreeNode left=null;
        TreeNode right=null;
        TreeNode(int val){
            this.val=val;
        }
    }
    public void preTraverse(TreeNode root){
        if (root==null)
            return;
        if (root.left==null&&root.right==null)
            System.out.println(root.val);
        Stack<TreeNode> s=new Stack<>();
        TreeNode p=root; //工作节点
        while(p!=null||!s.isEmpty()){
            while (p!=null){
                Traverse(p);
                s.push(p);
                p=p.left;
            }
            if (!s.isEmpty()){
                p=s.pop();
                p=p.right;
            }
        }
    }
    private void Traverse(TreeNode root){
        System.out.println(root.val);
    }
}
