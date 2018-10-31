package Model.Expression;

import Model.ADT.MyIDictionary;

public class ArithExpression implements Expression {
    private Expression expression1;
    private Expression expression2;
    private int op;

    public int eval(MyIDictionary<String, Integer> table) {
        if(op == 1)
            return expression1.eval(table) + expression2.eval(table);
        if(op == 2)
            return expression1.eval(table) - expression2.eval(table);
        if(op == 3)
            return expression1.eval(table) * expression2.eval(table);
        if(op == 4)
            return expression1.eval(table) / expression2.eval(table);
        return Integer.parseInt(null);
    }

    public String toStr() {
        if(op == 1)
            return expression1.toStr() + "+" + expression2.toStr();
        if(op == 2)
            return expression1.toStr() + "-" + expression2.toStr();
        if(op == 3)
            return expression1.toStr() + "*" + expression2.toStr();
        if(op == 4)
            return expression1.toStr() + "/" + expression2.toStr();
        return null;
    }
}
