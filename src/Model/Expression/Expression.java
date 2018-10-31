package Model.Expression;
import Exception.MyException;
import Model.ADT.MyIDictionary;

public interface Expression {
    int eval(MyIDictionary<String, Integer> table) throws MyException;
    String toStr();
}

