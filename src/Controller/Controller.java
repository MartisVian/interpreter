package Controller;

import Model.ADT.MyIStack;
import Model.PrgState;
import Model.Statement.IStatement;
import Repository.IRepository;
import Repository.Repository;
import Exception.MyException;

public class Controller {
    private IRepository myRepository;

    public Controller(Repository myRepository) {
        this.myRepository = myRepository;
    }

    public void addProgram(PrgState newPrg) {
        myRepository.addPrg(newPrg);
    }

    public PrgState oneStep(PrgState state) throws MyException
    {
        MyIStack<IStatement> stack = state.getStack();

        if(stack.isEmpty())
            throw new MyException("You reached the end of the program.");
        IStatement crtStmt = stack.pop();

        return crtStmt.execute(state);
    }

    public void allStep(){
        PrgState prg = myRepository.currentState();
        try{
            while(prg.getStack() != null){
                System.out.println(prg.toStr());
                oneStep(prg);
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
}
