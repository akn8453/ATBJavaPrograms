package Nov.ex_22112024_Map_Collection_Framework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lab222_Real_Example {
    public static void main(String[] args) {

        Map<String,Object> student1 = new HashMap<>();
        student1.put("name","Akshay");
        student1.put("phone","123456789");
        student1.put("Address","Banglore");

        Set book_read_items = new HashSet();
        book_read_items.add("Rich dad poor dad");
        book_read_items.add("Sapaiens");
        book_read_items.add("Secret");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Eat the frog");


    }
}
