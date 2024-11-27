package Nov.ex_21112024_List_Set_Collection_Framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab215_Set {
    public static void main(String[] args) {
        Set hs = new HashSet();

        Set lhs = new LinkedHashSet();

        Set ts = new TreeSet();

        hs.add("Akshay");
        hs.add("Ajay");
        hs.add("Ayush");
        hs.add("Aditya");
        System.out.println(hs);



    }
}
