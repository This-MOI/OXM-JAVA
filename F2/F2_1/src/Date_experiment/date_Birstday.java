package Date_experiment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class date_Birstday { //计算一个人出生到现在活了多少天
    public static void main(String[] args) throws ParseException {
        long date_Now = new Date().getTime();
        System.out.println("please input yyy.MM.dd");
        long date_birth = new SimpleDateFormat("yyyy.MM.dd").parse(new Scanner(System.in).next()).getTime();
        System.out.println("你出生了"+(date_Now-date_birth)/24/60/60/1000+"天");
    }
}