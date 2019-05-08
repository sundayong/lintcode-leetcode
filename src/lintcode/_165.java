package lintcode;

public class _165 {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode t = new ListNode(1);
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode j = null;
        ListNode lastj = l2;
        for (ListNode i = l1; i != null; i = i.next) {
            for (j = (j == null ? l2 : j); j != null; j = j.next) {
                ListNode tmp = new ListNode(i.val);
                if (i.val < j.val) {
                    ListNode tmp1 = j;
                    if (tmp1 == l2) {
                        j = tmp;
                        j.next = tmp1;
                        l2 = j;
                        lastj = j;
                        j = j.next;
                    } else {
                        tmp.next = j;
                        lastj.next = tmp;
                        lastj = tmp;
                    }
                    break;
                } else if (j.next == null) {
                    tmp.next = j.next;
                    j.next = tmp;
                    j = j.next;
                    break;
                }
                lastj = j;
            }
        }

//        for (ListNode t = l2; t != null; t = t.next) {
//            System.out.print(t.val + ",");
//        }
        return l2;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(6);
        l1.next = new ListNode(8);
        l1.next.next = new ListNode(8);
        l1.next.next.next = new ListNode(16);
        l1.next.next.next.next = new ListNode(19);
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(2);
        l2.next.next = new ListNode(13);
        l2.next.next.next = new ListNode(16);
//        l2.next = new ListNode(3);
//        l2.next.next = new ListNode(3);
        mergeTwoLists(l1, l2);
    }

}
