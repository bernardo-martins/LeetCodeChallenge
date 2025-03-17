package days;

import utils.ListNode;

public class Day6 {

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;
        ListNode node = head;
        ListNode next = node.next;
        ListNode origin = node;
        while(next != null) {
            if(node.val != next.val) {
                node.next = next;
                node = node.next;
                next = node.next;
            } else {
                next = next.next;
            }
        }
        node.next = null;
        return origin;
    }
}
