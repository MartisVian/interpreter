package Model.Statement;

import Model.ADT.MyIDictionary;
import Model.ADT.MyIStack;
import Model.Expression.Expression;
import Model.PrgState;
import Exception.MyException;

import javax.print.DocFlavor;

public class IfStatement implements IStatement {
    private Expression expression;
    private IStatement thenStatement;
    private IStatement elseStatement;

    public IfStatement(Expression e, IStatement then, IStatement els)
    {
        expression = e;
        thenStatement = then;
        elseStatement = els;
    }

    public String toString() {
        return "IF(" + expression.toStr() + ") THEN(" + thenStatement.toString() + ")ELSE(" + elseStatement.toString() + ")";
    }

    public PrgState execute(PrgState state) throws MyException {
        MyIStack<IStatement> stack = state.getStack();
        MyIDictionary<String, Integer> symTable = state.getSymTable();

        if(expression.eval(symTable) != 0)
            stack.push(thenStatement);
        else
            stack.push(elseStatement);

        return state;
    }
}
