package Model.Statement;

import Model.PrgState;

public interface IStatement {
    String toStr();
    PrgState execute(PrgState state);
}
