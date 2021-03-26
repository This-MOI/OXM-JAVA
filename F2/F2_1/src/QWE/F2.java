package QWE;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class F2 {
    public static void main(String[] args) {
        Random r = new Random();
        int num =r.nextInt(100);
        System.out.println(num);
        ArrayList<String> list=new ArrayList<>();
        list.add("a");list.add("b");list.add("c");//向内添加元素
        System.out.println("数组是"+list);
        System.out.println("数组的长度是"+list.size());
        System.out.println("被删除的元素是："+list.remove(0));
        System.out.println("数组是"+list);
        System.out.println("数组的第一个元素是"+list.get(0));
        System.out.println("数组的长度是"+list.size());
    }


}
