package Model.ADT;

import java.util.Stack;

public class MyStack<T> implements MyIStack<T> {
    Stack<T> stack;

    public MyStack(){ stack = new Stack<T>(); }

    public T pop() {
        return stack.pop();
    }

    public void push(T element) {
        stack.push(element);
    }

    public String toStr(){
        StringBuilder sb = new StringBuilder();
        for(T el : stack)
        {
            sb.append(el.toString()).append('\n');
        }
        return sb.toString();
    }
}
