package ex5IO;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Reader r = new BufferedReader(new FileReader(""));
        Writer w = new BufferedWriter(new FileWriter(""));
        InputStream i = new BufferedInputStream(new FileInputStream(""));
        OutputStream o = new BufferedOutputStream(new FileOutputStream(""));

        Writer w2 = new OutputStreamWriter(o);
        Reader r2 = new InputStreamReader(i);

//        InputStream i2 = new InputStreamReader(r);
    }
}
