package Model.ADT;
import Exception.MyException;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FileTable implements IIntegerMap<Pair<String, BufferedReader>> {

    private Map<Integer, Pair<String, BufferedReader>> files = new HashMap<>();

    public void add(Integer id, Pair<String, BufferedReader> pair) {
        files.put(id, pair);
    }

    public Pair<String, BufferedReader> get(Integer key) throws MyException{
        if(files.containsKey(key))
            return files.get(key);

        throw new MyException("Key is not in the list.");
    }

    public boolean find(String fileName) {
        for(Map.Entry<Integer, Pair<String, BufferedReader>> e : files.entrySet())
        {
            if(e.getValue().getKey().equals(fileName)) {
                return true;
            }
        }
        return false;
    }
}
