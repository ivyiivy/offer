public class reverseList {
    public class ListNode{
        int val;
        ListNode next=null;
        ListNode(int val){this.val=val;}
    }

    public ListNode ReverseList(ListNode head) {
        if(head==null ||head.next==null){
            return head;
        }
        ListNode p=head;
        ListNode q=head.next;
        ListNode r=null;
        head.next=null;
        while(q!=null){
            r=q.next;
            q.next=p;
            p=q;
            q=r;
        }
        return p;
    }

}
