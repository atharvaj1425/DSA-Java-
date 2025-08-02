package Stacks;

import java.util.LinkedList;
import java.util.Queue;

public class stackUsingQueue {
    class MyStack {

        Queue<Integer> q1;
        Queue<Integer> q2;

        public MyStack() {
            q1 = new LinkedList<>();
            q2 = new LinkedList<>();
        }

        public void push(int x) {
            q2.offer(x); // Add new element to q2

            // Move all elements from q1 to q2
            while (!q1.isEmpty()) {
                q2.offer(q1.poll());
            }

            // Swap the queues
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }

        public int pop() {
            return q1.poll(); // Front of q1 is top of stack
        }

        public int top() {
            return q1.peek(); // Front of q1 is top of stack
        }

        public boolean empty() {
            return q1.isEmpty();
        }
    }


/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}
