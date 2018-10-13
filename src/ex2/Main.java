package ex2;

public class Main {
    public static void main(String[] args) {
        Modif.Inner i = new Modif().new Inner();
        Modif m = new Modif();
        Modif.Inner i2 = m.new Inner();
        Modif.InnerSt is = new Modif.InnerSt();
    }
}
