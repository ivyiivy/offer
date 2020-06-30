import java.util.ArrayList;


/*
此题为将二叉搜索树转化为双向链表
1.第一种方法先中序遍历，将节点添加进list，然后遍历节点转化为双向链表。
2.第二种方法从右边开始转化，每次转化得到链表头结点，最终返回。
 */
public class ConvertTreeToList {

  /*
    1.
   */
//    public TreeNode Convert(TreeNode pRootOfTree) {
//        if(pRootOfTree==null){
//            return null;
//        }
//        ArrayList<TreeNode> list=new ArrayList<>();
//        Convert(pRootOfTree,list);
//        return Convert(list);
//    }
//    public void Convert(TreeNode pRootOfTree,ArrayList<TreeNode> list){
//        if(pRootOfTree.left!=null){
//            Convert(pRootOfTree.left,list);
//        }
//        list.add(pRootOfTree);
//        if(pRootOfTree.right!=null){
//            Convert(pRootOfTree.right,list);
//        }
//    }
//    public TreeNode Convert(ArrayList<TreeNode> list){
//        for(int i=0;i<list.size()-1;i++){
//            list.get(i).right=list.get(i+1);
//            list.get(i+1).left=list.get(i);
//        }
//        return list.get(0);
//    }

    /*
    2.
     */
    TreeNode pre=null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null){
            return null;
        }
        Convert(pRootOfTree.right);
        if(pre==null){
            pre=pRootOfTree;
        }
        else{
            pRootOfTree.right=pre;
            pre.left=pRootOfTree;
            pre=pRootOfTree;
        }
        Convert(pRootOfTree.left);
        return pre;

    }
}
