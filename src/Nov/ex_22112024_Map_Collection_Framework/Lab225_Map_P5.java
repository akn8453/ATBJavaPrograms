package Nov.ex_22112024_Map_Collection_Framework;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Lab225_Map_P5 {
    public static void main(String[] args) {
        //map is a key value pair and allow one null value
        //Hash table - synchronised, slow and legacy class.
        //T1,T2 - they will use one by one

        Hashtable<Integer,String> ht1 = new Hashtable<>();
        ht1.put(1,"One");
        ht1.put(2,"Two");
        ht1.put(3,"Three");
        ht1.put(4,"Four");
        System.out.println(ht1);

        HashMap<Integer,String> ht2 = new HashMap();
        ht2.put(1,"One");
        ht2.put(2,"Two");
        ht2.put(3,"Three");
        ht2.put(4,"Four");
        ht2.put(3,null);
        ht2.put(null,"5") ;
        System.out.println(ht2);

        Enumeration<Integer> e = ht1.keys();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
            //System.out.println(ht1.get(e.nextElement()));

        }


    }
}
