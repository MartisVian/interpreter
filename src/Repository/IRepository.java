package Repository;

import Model.PrgState;

public interface IRepository {
    PrgState currentState();
    void addPrg(PrgState newPrg);
}
