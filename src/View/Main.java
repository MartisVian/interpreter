package View;

import Model.ADT.*;
import Model.Expression.ArithExpression;
import Model.Expression.ConstExpression;
import Model.Expression.VarExpression;
import Model.PrgState;
import Model.Statement.*;
import Repository.Repository;
import Controller.Controller;

public class Main {

    private static Repository myRepository = new Repository();
    private static Controller myController = new Controller(myRepository);

    public static void main(String[] args){
        IStatement originalProgram = new IfStatement(new ConstExpression(10), new CompStatement(new AssignStatement("v",
                new ConstExpression(5)), new PrintStatement(new ArithExpression('/', new VarExpression("v"),
                new ConstExpression(3)))), new PrintStatement(new ConstExpression(100)));

        MyIStack<IStatement> exeStack = new MyStack<>();
        MyIDictionary<String, Integer> symTable = new MyDictionary<>();
        MyIList<Integer> out = new MyList<>();
        FileTable fileTable = new FileTable();
        PrgState myPrgState = new PrgState(exeStack, symTable, out, fileTable, originalProgram);


        myController.addProgram(myPrgState);
        myController.allStep();
//        try {
//            System.out.println(myPrgState.toStr());
//            myController.oneStep(myPrgState);
//            System.out.println(myPrgState.toStr());
//            myController.oneStep(myPrgState);
//            System.out.println(myPrgState.toStr());
//            myController.oneStep(myPrgState);
//            System.out.println(myPrgState.toStr());
//            myController.oneStep(myPrgState);
//        }
//        catch(Exception e)
//        {
//            System.out.println(e.getMessage());
//            System.exit(0);
//        }
    }
}
