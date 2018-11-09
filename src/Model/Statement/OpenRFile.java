package Model.Statement;
import Exception.MyException;
import Model.ADT.FileTable;
import Model.ADT.Pair;
import Model.PrgState;

public class OpenRFile implements IStatement {
    private String varFile;
    private String fileName;

    public OpenRFile(String var, String file)
    {
        varFile = var;
        fileName = file;
    }

    public PrgState execute(PrgState state) throws MyException {
        FileTable fileTable = state.getFileTable();
        fileTable.find(fileName);
        return null;
    }
}
