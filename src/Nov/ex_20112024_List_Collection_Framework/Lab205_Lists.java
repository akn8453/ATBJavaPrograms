package Nov.ex_20112024_List_Collection_Framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab205_Lists {
    public static void main(String[] args) {
        List myList = new ArrayList(); // Arrays format - continous
        List myList2 = new LinkedList();// doubly linked list.
        // How they are stored in the memory


        List fruits = List.of("Orange","Apple");
        fruits.add("Watermelon");//lang.UnsupportedOperationException
       // we can not use the add function
       // add is the function which is not available in the list
       // Why? List is the interface and of is the function which takes the hard core value


    }

}
