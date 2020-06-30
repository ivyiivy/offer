import java.util.HashSet;

public class DeleteDuplication {
    public static void main(String[] args) {

    }
    public static ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null) {
            return null;
        }
        HashSet<Integer> set = new HashSet<>();
        ListNode pre = pHead;
        ListNode cur = pre.next;
        while (cur != null) {
            if (pre.val == cur.val) {
                set.add(cur.val);
            }
            pre = pre.next;
            cur = cur.next;
        }
        while (pHead != null && set.contains(pHead.val)) {
            pHead = pHead.next;
        }
        if (pHead == null) {
            return null;
        }
        pre = pHead;
        cur = pHead.next;
        while (cur != null) {
            if (set.contains(cur.val)) {
                pre.next=cur.next;
                cur = cur.next;
            }
            pre=cur;
            cur=cur.next;

        }
        return pHead;

    }
}