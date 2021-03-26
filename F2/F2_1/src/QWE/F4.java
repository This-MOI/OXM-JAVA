package QWE;

import java.util.ArrayList;
import java.util.Random;

public class F4 {
    public static void main(String[] args) {
        Random a = new Random();
        ArrayList<Integer> b =new ArrayList<>();
        for(int i=0;i<6;i++)
            b.add(a.nextInt(33)+1);
        System.out.println(b);
        System.out.println(b.size());
    }
}
