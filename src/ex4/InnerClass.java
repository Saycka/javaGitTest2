package ex4;

public class InnerClass {
    public int pub = 1;
    protected int prot;
    int def;
    private int priv;

    public static int spub;
    protected static int sprot;
    static int sdef;
    private static int spriv;


    public void start() {
        Inner1 in = new Inner1();
        in.m();
    }

    class Inner1 {
        int pub = 2;

        void m() {
            System.out.println(InnerClass.this.pub);
            prot = 1;
            def = 1;
            priv = 1;

            spub = 1;
            sprot = 1;
            sdef = 1;
            spriv = 1;
        }
    }

    static class Inner2 {
        void m() {
            InnerClass.spub = 1;
            sprot = 1;
            sdef = 1;
            spriv = 1;
        }
    }
}
