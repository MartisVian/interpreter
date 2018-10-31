package Model.Expression;

import Model.ADT.MyIDictionary;

public class ConstExpression implements Expression {
    private int number;

    public ConstExpression(int no)
    {
        this.number = no;
    }

    public int eval(MyIDictionary<String, Integer> table) {
        return number;
    }

    public String toStr() {
        return Integer.toString(number);
    }
}
