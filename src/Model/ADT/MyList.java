package Model.ADT;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> implements MyIList<T> {
    List<T> list;

    public MyList(){ list = new ArrayList<T>(); }

    public String toStr() {
        StringBuilder sb = new StringBuilder();
        for(T element : list)
        {
            sb.append(element.toString()).append('\n');
        }
        return sb.toString();
    }
}
