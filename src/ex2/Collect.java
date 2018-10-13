package ex2;

public class Collect {
    public static void main(String[] args) {
        Object a = new Integer[10];
        Object[] b = new Integer[10];
//        a = 1;

        b[0] = 1;
        System.out.println(a);
        System.out.println(b[0]);
    }
}
