package shiyan;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Mydate {
    public static void main(String[] args) throws ParseException {
        /*SimpleDateFormat a = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(a.format(new Date()));
        Date date = new Date();
        String str;
        System.out.println("please input yyyy年MM月dd日");
        str = new Scanner(System.in).next();
        date = a.parse(str);
        System.out.println(date);*/
        Date date = new Date(System.currentTimeMillis());
        System.out.println(new SimpleDateFormat("yyyy.MM.dd").format(date));
    }
}
