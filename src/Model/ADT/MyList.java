package Model.ADT;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MyList<T> implements MyIList<T> {
    private Queue<T> list;

    public MyList(){ list = new LinkedList<T>(); }

    public void add(T v) {
        list.add(v);
    }

    public T pop() {
        return list.poll();
    }

    public String toStr() {
        StringBuilder sb = new StringBuilder();
        for(T element : list)
        {
            sb.append(element.toString()).append('\n');
        }
        return sb.toString();
    }
}
