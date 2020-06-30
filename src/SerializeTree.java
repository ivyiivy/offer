
public class SerializeTree {
    private int index=0;
    String Serialize(TreeNode root) {
        if(root==null){
            return "";
        }

       return helpSerialize(root,new StringBuilder()).toString();
    }
    private StringBuilder helpSerialize(TreeNode root,StringBuilder str){
        if (root==null){
            str.append("#!");
            return str;
        }
        str.append(root.val).append("!");
        helpSerialize(root.left,str);
        helpSerialize(root.right,str);
        return str;

    }
    TreeNode Deserialize(String str) {
        if (str==null||str.length()==0){
            return null;
        }
        String[] s=str.split("!");
        return helpDeserialize(s);
    }
    private TreeNode helpDeserialize(String[] s){
        if (s[index].equals("#")){
            index++;
            return null;
        }
        TreeNode root=new TreeNode(Integer.parseInt(s[index]));
        index++;
        root.left=helpDeserialize(s);
        root.right=helpDeserialize(s);
        return root;
    }
}