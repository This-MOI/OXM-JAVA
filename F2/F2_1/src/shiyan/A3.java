package shiyan;

public class A3 {
    private int a =100;
    private String s = "fuck you";

    public A3() {
    }

    public A3(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "A3{" +
                "a=" + a +
                ", s='" + s + '\'' +
                '}';
    }
}
