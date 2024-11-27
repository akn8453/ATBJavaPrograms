package Nov.ex_21112024_List_Set_Collection_Framework;

import javax.xml.transform.Source;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Lab218_Vector {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        vector.add("Date");

        for(Object o: vector){
            System.out.println(o);
        }


        //Iterator for legacy class iterator is not available.
        // we can use enumeration

        System.out.println(" ---- ");

        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

    }
}
