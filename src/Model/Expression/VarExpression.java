package Model.Expression;
import Exception.MyException;
import Model.ADT.MyIDictionary;

public class VarExpression implements Expression {
    private String id;

    public VarExpression(String str)
    {
        this.id = str;
    }

    public int eval(MyIDictionary<String, Integer> table)throws MyException {
        return table.lookUp(id);
    }

    public String toStr() {
        return id;
    }
}
