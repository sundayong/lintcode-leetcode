package leetcode;

/**
 * Add Two Numbers
 */


//Definition for singly-linked list.

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

}

public class _2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int tmp = 0;//进位
        ListNode res = l2;
        while (l1 != null || tmp != 0) {

            l2.val += l1.val + tmp;
            tmp = 0;
            if (l2.val / 10 > 0) {
                tmp = l2.val / 10;
                l2.val %= 10;
            }
            if (tmp != 0) {
                if (l1.next == null) {
                    l1.next = new ListNode(0);
                }

                if (l2.next == null) {
                    l2.next = new ListNode(0);
                }
            } else {
                if (l1.next != null && l2.next == null) {
                    l2.next = new ListNode(0);
                }
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        return res;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode listNode = addTwoNumbers(l1, l2);
        while (listNode != null) {
            System.out.print(listNode.val + " -> ");
            listNode = listNode.next;
        }
    }
}


