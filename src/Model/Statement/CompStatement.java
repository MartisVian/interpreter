package Model.Statement;
import Exception.MyException;
import Model.ADT.MyIStack;
import Model.PrgState;

public class CompStatement implements IStatement {
    private IStatement first;
    private IStatement second;

    public CompStatement(IStatement frst, IStatement scnd)
    {
        first = frst;
        second = scnd;
    }

    public String toString() {
        return "(" + first.toString() + ";" + second.toString() + ")";
    }

    public PrgState execute(PrgState state) throws MyException {
        MyIStack<IStatement> stack = state.getStack();
        stack.push(second);
        stack.push(first);

        return state;
    }
}
