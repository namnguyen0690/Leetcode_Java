package com.nami.solutions.from1to100;

public class _21MergeTwoSortedLists {
    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            // set up a prehead node
            ListNode prehead = new ListNode(-1);
            ListNode prev = prehead;

            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    prev.next = list1;
                    list1 = list1.next;
                } else {
                    prev.next = list2;
                    list2 = list2.next;
                }
                prev = prev.next;
            }

            // At least one of l1 and l2 can still have nodes at this point, so connect
            // the non-null list to the end of the merged list.
            prev.next = list1 == null ? list2 : list1;

            return prehead.next;
        }
    }
}
