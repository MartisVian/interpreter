package Model.ADT;
import Exception.MyException;
import java.util.HashMap;

public class MyDictionary<T1, T2> implements MyIDictionary<T1, T2> {
    private HashMap<T1, T2> dictionary;

    public MyDictionary(){dictionary = new HashMap<>();}

    public void add(T1 a, T2 b) {
        dictionary.put(a, b);
    }


    public boolean isDefined(T1 id) {
        return dictionary.get(id) != null;
    }

    public String toStr() {
        StringBuilder returnString = new StringBuilder();
        for(HashMap.Entry<T1, T2> e : dictionary.entrySet())
        {
            returnString.append("Key: ").append(e.getKey().toString()).append(", Value: ").append(e.getValue().toString());
        }
        if(!returnString.toString().equals("")) {
            return "\n\t" +
                    returnString;
        }

        return returnString.toString();
    }

    public T2 lookUp(String id) throws MyException {
        if(dictionary.get(id) != null) {
            return dictionary.get(id);
        } else
            throw new MyException("Id not found.");
    }


}
