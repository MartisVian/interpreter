package Repository;
import Exception.MyException;
import Model.PrgState;

public interface IRepository {
    PrgState currentState();
    void addPrg(PrgState newPrg);
    void logPrgStateExec() throws MyException;
}
