package Model.Statement;

import Model.PrgState;

public class CompStatement implements IStatement {
    private IStatement first;
    private IStatement second;

    public String toStr() {
        return "(" + first.toStr() + ";" + second.toStr() + ")";
    }

    public PrgState execute(PrgState state) {
        return null;
    }
}
