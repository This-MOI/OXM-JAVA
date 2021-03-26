package shiyan;

public class A2 {
    int num ;
    static int num2 = 200;
    public static void main(String[] args) {
        asd(num2);
        A2 a2 = new A2();
        asd(a2.num);
    }


    public static void asd(int a){
        System.out.println(a);
    }
}
