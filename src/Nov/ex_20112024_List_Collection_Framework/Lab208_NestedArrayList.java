package Nov.ex_20112024_List_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab208_NestedArrayList {
    public static void main(String[] args) {

        List fruits1 = new ArrayList();
        fruits1.add("Orange");
        fruits1.add("Apple");
        fruits1.add("Banana");
        fruits1.add("watermelon");
        fruits1.add("grapes");
        System.out.println(fruits1);

        List fruits2 = new ArrayList();
        fruits2.add("Mango");
        fruits2.add("Papaya");
        fruits2.add("Pomogranate");
        System.out.println(fruits2);


        List all_fruits = new ArrayList();
        all_fruits.add(fruits1);
        all_fruits.add(fruits2);
        System.out.println(all_fruits);



    }
}
