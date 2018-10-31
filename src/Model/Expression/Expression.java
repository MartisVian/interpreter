package Model.Expression;

import Model.ADT.MyIDictionary;

public interface Expression {
    int eval(MyIDictionary<String, Integer> table);
    String toStr();
}

