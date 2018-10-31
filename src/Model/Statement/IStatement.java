package Model.Statement;
import Exception.MyException;
import Model.PrgState;

public interface IStatement {
    String toString();
    PrgState execute(PrgState state) throws MyException;
}
