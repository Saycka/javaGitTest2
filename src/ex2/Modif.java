package ex2;

public class Modif {

    int x;
    static int sx;

    void m (){
        Inner i = new Inner();
        i.mI();
    }

    void sm (){
        Inner i = new Inner();
        i.mI();
    }

    public class Inner {
        void mI ()
        {
            x = 1;
            sx = 2;
            m();
            sm();
        }
    }

    public static class InnerSt {
        void mSI () {
            //x=1;
            sx = 1;
        }

    }
}
