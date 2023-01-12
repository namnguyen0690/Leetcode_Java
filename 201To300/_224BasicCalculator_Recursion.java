package com.nami.solutions.from201to300;

public class _224BasicCalculator {
    class Solution {
        int i;

        public int calculate(String s) {
            i = 0;
            return calc(s);
        }

        private int calc(String s) {
            int res = 0, num = 0, sign = 1;
            while (i < s.length()) {
                char c = s.charAt(i++);
                if (c >= '0' && c <= '9')
                    num = num * 10 + c - '0';
                else if (c == '(')
                    num = calc(s);
                else if (c == ')')
                    return res + sign * num;
                else if (c == '+' || c == '-') {
                    res += sign * num;
                    num = 0;
                    sign = c == '-' ? -1 : 1;
                }
            }
            return res + sign * num;
        }
    }

}
