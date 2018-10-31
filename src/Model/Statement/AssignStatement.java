package Model.Statement;

import Model.ADT.MyIDictionary;
import Model.ADT.MyIStack;
import Model.Expression.Expression;
import Model.PrgState;
import Exception.MyException;

public class AssignStatement implements IStatement {
    private String id;
    private Expression expression;

    public AssignStatement(String str, Expression expr)
    {
        id = str;
        expression = expr;
    }

    public String toString() {
         return id + "=" + expression.toStr();
    }

    public PrgState execute(PrgState state) throws MyException  {
        MyIStack<IStatement> stack = state.getStack();
        MyIDictionary<String, Integer> symTable = state.getSymTable();

        int val = expression.eval(symTable);

        if (symTable.isDefined(id))
            symTable.update(id, val);
        else
            symTable.add(id,val);

        return state;
    }
}