package Nov.ex_15112024_Wraper_Exceptions_Part_2;

import java.io.FileInputStream;

public class Lab180_Exceptions {
    public static void main(String[] args) {

        //  Checked - JVM Knows
        //FileInputStream file = new FileInputStream("C://a.text");
        // jvm knows that this may lead to file not found exceptions
        //so it's telling to handle it.

        // Unchecked - JVM Don't know it
        int a = 10;
        int b = 10;
        b = 0;
        int c = a/b;
        System.out.println(c);
    }
}
