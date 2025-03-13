package days;

import utils.ListNode;

public class Day1 {

    public int maximumCount(int[] nums) {
        int pn = 0;
        int nn = 0;
        for(int num : nums)
            if(num < 0)
                nn++;
            else if (num > 0)
                pn++;
        return Math.max(pn,nn);

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        ListNode curr1, curr2 = null;
        ListNode head = null;
        if(list1.val < list2.val) {
            head = list1;
            curr1 = list1.next;
            curr2 = list2;
        } else {
            head = list2;
            curr1 = list1;
            curr2 =  list2.next;
        }

        ListNode origin = head;
        while(curr1 != null || curr2 != null) {
            if (curr1 == null && curr2 != null) {
                head.next = curr2;
                break;
            }
            else if (curr2 == null && curr1 != null) {
                head.next = curr1;
                break;
            }
            if(curr1.val == curr2.val) {
                //advance curr0
                head.next = curr1;
                curr1 = curr1.next;
            } else if(curr1.val < curr2.val) {
                head.next = curr1;
                curr1 = curr1.next;
            } else {
                head.next = curr2;
                curr2 = curr2.next;
            }
            head = head.next;
        }

        return origin;
    }

}
