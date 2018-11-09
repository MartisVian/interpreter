package Model;

import Model.ADT.*;
import Model.Statement.IStatement;


public class PrgState {
    private MyIStack<IStatement> exeStack;
    private MyIDictionary<String, Integer> symTable;
    private MyIList<Integer> out;
    private FileTable fileTable;

    public PrgState(MyIStack<IStatement> stack, MyIDictionary<String,Integer> symtbl, MyIList<Integer> output,
                    FileTable fileT,
                    IStatement prg){
        exeStack=stack;
        symTable=symtbl;
        out = output;
        fileTable = fileT;
        exeStack.push(prg);
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
    public FileTable getFileTable(){ return fileTable; }
    public String toStr()
    {
        return "ExeStack: " +  exeStack.toStr() + "\nSymTable: "+ symTable.toStr() + "\nOutput: "+ out.toStr()
                + "\n---------------------------------------------------\n";
    }
}
