package Model;

import Model.ADT.MyIDictionary;
import Model.ADT.MyIList;
import Model.ADT.MyIStack;
import Model.Statement.IStatement;

public class PrgState {
    private MyIStack<IStatement> exeStack;
    private MyIDictionary<String, Integer> symTable;
    private MyIList<Integer> out;

    PrgState(MyIStack<IStatement> stack, MyIDictionary<String,Integer> symtbl, MyIList<Integer> output, IStatement prg){
        exeStack=stack;
        symTable=symtbl;
        out = output;
        stack.push(prg);
    }

    String toStr()
    {
        return exeStack.toStr() + '\n' + symTable.toStr() + '\n' + out.toStr();
    }
}
