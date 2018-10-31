package Model.ADT;

import java.util.Stack;
import Model.Expression.*;

public class MyStack<T> implements MyIStack<T> {
    private Stack<T> stack;

    public MyStack(){ stack = new Stack<>(); }

    public T pop() {
        return stack.pop();
    }

    public void push(T element) {
        stack.push(element);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
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
