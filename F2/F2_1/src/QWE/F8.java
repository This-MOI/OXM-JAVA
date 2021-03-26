package QWE;

import java.nio.charset.StandardCharsets;

public class F8 {
    public static void main(String[] args) {
        String a = new String("fuck");
        System.out.println(a);
        String b ;
        b = "asd";
        System.out.println(b);

        String str1 = "Hello";
        String str2 = new String("Hello");
        System.out.println(str2.equals(str1));
        System.out.println("hello".equals(str1));
        System.out.println("hello".equalsIgnoreCase(str1));

        int length = "asdfafqef".length();
        System.out.println(length);
        System.out.println("asdasdasdasdasdfefgg".concat(b));
        System.out.println(str2.charAt(0));
        System.out.println(str1.indexOf("lo"));
        System.out.println(str1.substring(1,3));

        System.out.println("hello".getBytes());
    }
}
