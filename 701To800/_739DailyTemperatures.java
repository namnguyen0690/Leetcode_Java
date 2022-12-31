package com.nami.solutions.from701to800;

public class _739DailyTemperatures {
    class Solution {
        public int[] dailyTemperatures(int[] temperatures) {
            int n = temperatures.length;
            int[] answer = new int[n];
            Deque<Integer> stack = new ArrayDeque<>();

            for (int i = 0; i < n; i++) {
                int currentTemp = temperatures[i];
                while (!stack.isEmpty() && temperatures[stack.peek()] < currentTemp) {
                    int prevDay = stack.pop();
                    answer[prevDay] = i - prevDay;
                }
                stack.push(i);
            }

            return answer;
        }
    }
}
