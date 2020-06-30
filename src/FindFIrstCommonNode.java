public class FindFIrstCommonNode {


    public ListNode Find(ListNode pHead1, ListNode pHead2)  {
        if (pHead1 == null || pHead2 == null)
            return null;
        ListNode node1 = pHead1;
        ListNode node2 = pHead2;
        int length1 = 0;
        int length2 = 0;
        int len;
        while (node1 != null) {
            node1 = node1.next;
            length1 += 1;
        }
        while (node2 != null) {
            node2 = node2.next;
            length2 += 1;
        }
        if (length1 > length2) {
            len = length1 - length2;
            while (len != 0) {
                pHead1 = pHead1.next;
                len -= 1;
            }
        } else if (length1 < length2) {
            len = length2 - length1;
            while (len != 0) {
                pHead2 = pHead2.next;
                len -= 1;
            }
        }
        while (pHead1 != null) {
            if (pHead1 == pHead2)
                return pHead1;
            pHead1=pHead1.next;
            pHead2=pHead2.next;
        }
        return null;

    }
}
