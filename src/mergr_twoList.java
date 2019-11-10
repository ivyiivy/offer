import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class mergr_twoList {

    public class ListNode{
        int val;
        ListNode next=null;
        ListNode(int val){
            this.val=val;
        }
    }
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null)
            return list2;
        else if(list2==null)
            return list1;
        ListNode node=null;
        if (list1.val<list2.val){
            node=list1;
            node.next=Merge(list1.next,list2);
        }
        else {
            node=list2;
            node.next=Merge(list1,list2.next);
        }
        return node;

    }
}
