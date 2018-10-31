package Model.Expression;

import Model.ADT.MyIDictionary;

public class VarExpression implements Expression {
    String id;

    public int eval(MyIDictionary<String, Integer> table) {
        return table.lookUp(id);
    }

    public String toStr() {
        return null;
    }
}
