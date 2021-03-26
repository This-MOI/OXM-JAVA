package shiyan;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.SimpleTimeZone;

public class My_Calnedar {
    public static void main(String[] args) {
        Calendar asd = Calendar.getInstance();
        System.out.println(asd);
        System.out.println(new SimpleDateFormat("yyyy.MM.dd").format(asd.getTime()));
        System.out.println(asd.get(1));
        System.out.println(asd.get(Calendar.MONTH)+1);
        System.out.println(asd.get(Calendar.DATE)) ;
        asd.add(1,1);
        System.out.println(asd.get(Calendar.YEAR));
        System.out.println(asd.getTime());

    }
}
