package Model.ADT;

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
        return null;
    }

    public T2 lookUp(String id) {
        return dictionary.get(id);
    }


}
