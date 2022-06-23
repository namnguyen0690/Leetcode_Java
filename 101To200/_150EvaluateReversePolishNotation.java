package com.nami.solutions.from101to200;

public class _150EvaluateReversePolishNotation {
    class Solution {
        public int evalRPN(String[] tokens) {
            Deque<Integer> stack = new ArrayDeque<>();

            for (String token : tokens) {
                if (!isOperator(token)) {
                    stack.push(Integer.valueOf(token));
                } else {
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    int res = 0;
                    switch(token) {
                        case "+":
                            res = num2 + num1;
                            break;
                        case "-":
                            res = num2 - num1;
                            break;
                        case "*":
                            res = num2 * num1;
                            break;
                        case "/":
                            res = num2 / num1;
                            break;
                    }
                    stack.push(res);
                }
            }
            return stack.peek();
        }

        private boolean isOperator(String token) {
            return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
        }
    }
}
