package Nov.ex_20112024_List_Collection_Framework;

import java.util.Vector;

public class Lab206_Vectors {
    public static void main(String[] args) {

        Vector v = new Vector();
        v.add("Akshay");
        v.add("Ajay");
        v.add("Ayush");
        System.out.println(v);
        v.remove("Ayush");
        System.out.println(v);
        System.out.println(v.contains("Akshay"));



    }
}
