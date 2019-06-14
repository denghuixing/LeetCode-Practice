package Min_Stack_155;

import java.util.LinkedList;
import java.util.Stack;

public class Solution {
    public static void main(String[] args){
        MinStack minStack = new MinStack();
    }


}
class MinStack{
    /** initialize your data structure here. */
    public MinStack() {

    }

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();



    public void push(int x) {
        stack.push(x);
        minStack.push(minStack.isEmpty() ? x : Math.min(minStack.peek(),x));
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
