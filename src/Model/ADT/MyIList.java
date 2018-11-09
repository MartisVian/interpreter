package Model.ADT;

public interface MyIList<T> {
    void add(T v);
    T pop();
    T getLast();
    String toStr();
}
