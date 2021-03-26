package QWE;

import java.util.ArrayList;

public class F5 {
    public static void main(String[] args) {
        ArrayList<STU> list = new ArrayList<>();
        list.add(new STU("one",1233));
        list.add(new STU("two",1234));
        list.add(new STU("three",1235));
        list.add(new STU("four",1236));
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getName());
            System.out.println(list.get(i).getNumber());
        }
    }
}
