package Model.ADT;

import Model.Statement.IStatement;
import Model.Statement.IfStatement;

public interface MyIStack<T> {
    T pop();
    void push(T element);
    boolean isEmpty();
    String toStr();
}
