package com.nami.solutions.from201to300;

public class _206ReverseLinkedList {
    public static class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;
            while (curr != null) {
                ListNode nextTmp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextTmp;
            }
            return prev;
        }
    }
}
