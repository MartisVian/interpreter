package Model.ADT;

public interface MyIStack<T> {
    T pop();
    void push(T element);
    String toStr();
}
