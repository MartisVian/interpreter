package Model.Statement;
import Exception.MyException;
import Model.ADT.MyIDictionary;
import Model.ADT.MyIList;
import Model.Expression.Expression;
import Model.PrgState;

public class PrintStatement implements IStatement {
    private Expression expression;

    public PrintStatement(Expression expr)
    {
        expression = expr;
    }

    public String toString() {
        return "print(" + expression.toStr() + ")";
    }

    public PrgState execute(PrgState state) throws MyException {
        MyIList<Integer> out = state.getOut();
        MyIDictionary<String,Integer> symTable = state.getSymTable();
        out.add(expression.eval(symTable));
        return state;
    }
}
