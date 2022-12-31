package com.nami.solutions.from1to100;

public class _2AddTwoNumbers {
    class Solution {
        int carry = 0;

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            if (l1 == null && l2 == null && carry == 0) {
                return null;
            }
            int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
            carry = sum / 10;
            ListNode answer = new ListNode(sum % 10,
                    addTwoNumbers(l1 == null ? null : l1.next, l2 == null ? null : l2.next));
            return answer;
        }
    }
}
