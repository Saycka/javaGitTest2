package ex3;

public class Obj {
    public static void main(String[] args) {
        Object a = new Object();
        Object b = new Object();
        Object c = a;
        System.out.println("a == b: " + (a == b));
        System.out.println("a == c: " + (a == c));
        System.out.println("a.equals(b): " + (a.equals(b)));
        System.out.println("a.equals(c): " + (a.equals(c)));
    }
}
