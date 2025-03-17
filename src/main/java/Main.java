import utils.ListNode;

import java.util.Stack;

public class Main {

    public static ListNode deleteDuplicates(ListNode head) {
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
                continue;
            }
            next = next.next;
        }
        node.next = null;
        return origin;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(3, null)))));
        ListNode nonRepeated = deleteDuplicates(node);
        ListNode n = nonRepeated;
        while(n!=null) {
            System.out.println(n.val);
            n = n.next;
        }
    }
}