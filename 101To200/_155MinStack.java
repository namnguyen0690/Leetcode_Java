package com.nami.solutions.from101to200;

public class _155MinStack {
    class MinStack {

        Stack<Integer> stack = new Stack();
        Stack<Integer> min_vals =  new Stack();
        
        public void push(int val) {
            if (min_vals.isEmpty() || val <= min_vals.peek()) {
                min_vals.push(val);
            }
            stack.push(val);
        }

        public void pop() {
            if (stack.peek().equals(min_vals.peek())) {
                min_vals.pop();
            }
            stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return min_vals.peek();
        }
    }
}
