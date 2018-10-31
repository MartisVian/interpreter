package Model;

import Model.ADT.MyIDictionary;
import Model.ADT.MyIList;
import Model.ADT.MyIStack;
import Model.Statement.IStatement;

public class PrgState {
    private MyIStack<IStatement> exeStack;
    private MyIDictionary<String, Integer> symTable;
    private MyIList<Integer> out;

    public PrgState(MyIStack<IStatement> stack, MyIDictionary<String,Integer> symtbl, MyIList<Integer> output, IStatement prg){
        exeStack=stack;
        symTable=symtbl;
        out = output;
        stack.push(prg);
    }

    public MyIStack<IStatement> getStack(){
        return exeStack;
    }

    public MyIList<Integer> getOut(){
        return out;
    }
    public MyIDictionary<String, Integer> getSymTable(){
        return symTable;
    }

    public String toStr()
    {
        return "ExeStack: " +  exeStack.toStr() + "\nSymTable: "+ symTable.toStr() + "\nOutput: "+ out.toStr();
    }
}
