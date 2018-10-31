package View;

import Model.ADT.*;
import Model.Expression.ArithExpression;
import Model.Expression.ConstExpression;
import Model.Expression.VarExpression;
import Model.PrgState;
import Model.Statement.*;
import Repository.Repository;
import Controller.Controller;

import javax.print.DocFlavor;

public class Main {

    private static Repository myRepository = new Repository();
    private static Controller myController = new Controller(myRepository);

    public static void main(String[] args) {
        IStatement originalProgram = new IfStatement(new ConstExpression(10), new CompStatement(new AssignStatement("v",
                new ConstExpression(5)), new PrintStatement(new ArithExpression('/', new VarExpression("v"),
                new ConstExpression(3)))), new PrintStatement(new ConstExpression(100)));
        IStatement prg2 =  new CompStatement(new AssignStatement("a", new ArithExpression('-',new ConstExpression(2), new
                ConstExpression(2))),
                new CompStatement(new IfStatement(new VarExpression("a"),new AssignStatement("v",new ConstExpression(2)), new
                        AssignStatement("v", new ConstExpression(3))), new PrintStatement(new VarExpression("v"))));

//        MyIStack<IStatement> exeStack = new MyStack<>();
//        MyIDictionary<String, Integer> symTable = new MyDictionary<>();
//        MyIList<Integer> out = new MyList<>();
//        PrgState myPrgState = new PrgState(exeStack, symTable, out, originalProgram);

        MyIStack<IStatement> exeStack2 = new MyStack<>();
        MyIDictionary<String, Integer> symTable2 = new MyDictionary<>();
        MyIList<Integer> out2 = new MyList<>();
        PrgState myPrgState2 = new PrgState(exeStack2, symTable2, out2, prg2);

//        myController.addProgram(myPrgState);
        myController.addProgram(myPrgState2);
        myController.allStep();

    }
}
