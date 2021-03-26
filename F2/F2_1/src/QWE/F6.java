package QWE;

import java.util.ArrayList;

public class F6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("fuck");
        list.add("you");
        list.add("qwe");
        list.add(("1231"));
        PRI(list);
    }

    public static void PRI(ArrayList list){
        for (int i = 0; i < list.size(); i++) {
            if(i == 0) System.out.print("{");
            if(i == list.size()-1)
                System.out.print(list.get(i)+"}");
            else System.out.print(list.get(i)+" @ ");
        }
    }
}
