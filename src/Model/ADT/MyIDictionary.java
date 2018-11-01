package Model.ADT;
import Exception.MyException;

public interface MyIDictionary<T1, T2> {
    void add(T1 a, T2 b);
    boolean isDefined(T1 id);
    String toStr();
    T2 lookUp(String id) throws MyException;
}
