package Stacks;

import java.util.Stack;

public class minStack {

    class MinStack {
        Stack<Integer> s;
        
        public MinStack() {
        s = new Stack<>();  
        }
        
        public void push(int val) {
            s.push(val);
        }
        
        public void pop() {
            s.pop();
        }
        
        public int top() {
            return s.peek();
        }
        
        public int getMin() {
            int min = Integer.MAX_VALUE;
            for(int i=0; i<s.size(); i++){
                min = Math.min(min, s.get(i));
            }
            return min;
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}

