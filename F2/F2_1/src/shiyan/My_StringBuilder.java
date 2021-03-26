package shiyan;

public class My_StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(123);
        stringBuilder.append("asd");
        System.out.println(stringBuilder);
        String str = stringBuilder.toString();
        System.out.println(str);
    }
}
