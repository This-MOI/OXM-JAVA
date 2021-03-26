package shiyan;

import java.util.ArrayList;
import java.util.List;

public class mylist {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.get(2));
        System.out.println(list);
        list.add(1,123);
        System.out.println(list);
        System.out.println(list.set(2,12345));
        System.out.println(list);
    }
}
