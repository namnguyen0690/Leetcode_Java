package com.nami.solutions.from201to300;

public class _273IntegerToEnglishWords_Recursion {
    public static class Solution {
        private final String[] under20 = { "One", "Two", "Three", "Four", "Five",
                "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
                "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
        private final String[] under100 = { "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
                "Ninety" };
        private final String[] htmb = { "Hundred", "Thousand", "Million", "Billion" };
        private final Integer[] p = { 100, 1000, 1000 * 1000, 1000 * 1000 * 1000 };

        public String numberToWords(int num) {
            if (num == 0)
                return "Zero";
            return convert(num).substring(1);
        }

        private String convert(int n) {
            if (n == 0) {
                return "";
            }
            if (n < 20) {
                return " " + under20[n - 1];
            }
            if (n < 100) {
                return " " + under100[n / 10 - 2] + convert(n % 10);
            }
            for (int i = 3; i >= 0; --i) {
                if (n >= p[i]) {
                    return convert(n / p[i]) + " " + htmb[i] + convert(n % p[i]);
                }
            }
            return "";
        }
    }

}
