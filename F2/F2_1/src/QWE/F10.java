package QWE;

public class F10 {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println(foremArraytosString(array));
    }

    public static  String foremArraytosString(int[] array){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if(i == array.length - 1)
                str += "word" + array[i] + "]";
            else str += "word" + array[i] + "#";
        }
        return str;
    }
}
