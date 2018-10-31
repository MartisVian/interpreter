package Model.ADT;
import Exception.MyException;
import java.util.HashMap;

public class MyDictionary<T1, T2> implements MyIDictionary<T1, T2> {
    private HashMap<T1, T2> dictionary;

    public MyDictionary(){dictionary = new HashMap<T1, T2>();}

    public void add(T1 a, T2 b) {
        dictionary.put(a, b);
    }

    public void update(T1 a, T2 b) {
    }

    public boolean isDefined(String id) {
        return dictionary.get(id) != null;
    }

    public String toStr() {
        String returnString = "";
        for(HashMap.Entry<T1, T2> e : dictionary.entrySet())
        {
            returnString = returnString + "Key: " + e.getKey().toString() + ", Value: " + e.getValue().toString();
        }
        if(!returnString.equals("")) {
            StringBuilder sb = new StringBuilder();
            sb.append("\n\t");
            sb.append(returnString);
            return sb.toString();
        }

        return returnString;
    }

    public T2 lookUp(String id) throws MyException {
        if(dictionary.get(id) != null)
            return dictionary.get(id);
        else
            throw new MyException("Id not found.");
    }


}
