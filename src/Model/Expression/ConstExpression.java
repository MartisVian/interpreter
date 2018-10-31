package Model.Expression;

import Model.ADT.MyIDictionary;

public class ConstExpression implements Expression {
    int number;
    public int eval(MyIDictionary<String, Integer> table) {
        return number;
    }

    public String toStr() {
        return null;
    }
}
