package shiyan;

import java.util.Iterator;
import java.util.LinkedList;

public class my_linklist {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        list.add(2);
        list.add(3);
        list.addFirst(4);
        /*System.out.println(list);
        System.out.println(list.removeFirst());
        System.out.println(list.pop());
        System.out.println(list);
        list.push(123);
        System.out.println(list);*/
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
        for(int i : list)
            System.out.println(i);;
        System.out.println(list);

    }
}
