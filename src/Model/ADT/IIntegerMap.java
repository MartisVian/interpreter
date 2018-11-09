package Model.ADT;
import Exception.MyException;
import Model.ADT.Pair;

public interface IIntegerMap<T> {
//    Boolean find(Object pair) throws MyException;
    void add(Integer id, T pair);
    T get(Integer key) throws MyException;
}

