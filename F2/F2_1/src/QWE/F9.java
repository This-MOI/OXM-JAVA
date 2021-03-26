package QWE;

public class F9 {
    public static void main(String[] args) {
        char[] a = "hello".toCharArray();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        byte[] bytes = "hello".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        String f = new String("Hello");
        System.out.println(f.replace("l","++"));
        System.out.println(f);

        String[] ad = "asd,asd,dsf,rtfgdgh,fh".split(",");
        for (int i = 0; i < ad.length; i++) {
            System.out.println(ad[i]);
        }
    }
}
