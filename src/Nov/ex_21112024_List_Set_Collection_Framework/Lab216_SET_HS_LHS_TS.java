package Nov.ex_21112024_List_Set_Collection_Framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab216_SET_HS_LHS_TS {
    public static void main(String[] args) {

        Set hs = new HashSet();
        //hashing mechanism to store the element no order
       //  no duplicate no order

        hs.add("Apple");
        hs.add("orange");
        hs.add("WaterMelon");
        hs.add("WaterMelon");
        hs.add(null);
        System.out.println(hs);


        Set lhs = new LinkedHashSet();
        //linked list mechanism is used to store the element
        // order will maintain no duplicate

        lhs.add("Apple");
        lhs.add("apple");
        lhs.add("orange");
        lhs.add("WaterMelon");
        lhs.add("WaterMelon");
        lhs.add(null);
        System.out.println(lhs);

        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());

        Set ts = new TreeSet();
        // Black and red tree mechanising to store the element.
        // order will maintain, naturel sorting is done.

        ts.add("Orange");
        ts.add("Dapple");
        ts.add("Apple");
        System.out.println(ts);
    }
}
