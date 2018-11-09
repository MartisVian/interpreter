package Repository;

import Exception.MyException;
import Model.ADT.MyList;
import Model.PrgState;

import java.io.*;

public class Repository implements IRepository{
    private MyList<PrgState> prgStateList;
    private String logFilePath = "C:\\Facultate\\Anul 2\\MAP\\InterpreterGit\\src\\Log\\test.txt";

    public Repository() {
        prgStateList = new MyList<>();
    }

    public PrgState currentState() {
        return prgStateList.pop();
    }

    public void addPrg(PrgState newPrg) {
        prgStateList.add(newPrg);
    }

    public void logPrgStateExec() throws MyException{
        try {
            FileWriter fw = new FileWriter(logFilePath, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.print(prgStateList.getLast().toStr());
            pw.close();
        }
        catch(FileNotFoundException fnf){
            throw new MyException("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
