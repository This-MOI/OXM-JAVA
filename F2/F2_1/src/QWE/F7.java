package QWE;

import java.util.ArrayList;
import java.util.Random;

public class F7 {   //生成20个随机数放在集合里面，然后从大集合中挑出偶数放在小集合内部，并输出
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Random a =new Random();
        for(int i=0 ; i<20 ;i++) // 向LIST中添加随机数20个
            list.add(a.nextInt(100)+1);
        adm(list,list2);
        System.out.println(list);
        System.out.println(list2);
    }

    public static void adm(ArrayList<Integer> list1, ArrayList<Integer> list2){ int num;
        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0 )
                list2.add(list1.get(i));
        }
    }

}
