package com.nami.solutions.from1to100;

public class _2AddTwoNumbers {
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode pre = new ListNode(-1);
        ListNode tmp = pre;
        while (l1 != null || l2 != null) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            tmp.next = new ListNode(sum % 10);
            tmp = tmp.next;
            carry = sum / 10;
        }
        if (carry != 0) {
            tmp.next = new ListNode(carry);
        }
        return pre.next;
    }
}
