package Repository;

import Model.ADT.MyList;
import Model.PrgState;

public class Repository implements IRepository{
    private MyList<PrgState> prgStateList;

    public Repository() {
        prgStateList = new MyList<>();
    }

    public PrgState currentState() {
        return prgStateList.pop();
    }

    public void addPrg(PrgState newPrg) {
        prgStateList.add(newPrg);
    }
}
