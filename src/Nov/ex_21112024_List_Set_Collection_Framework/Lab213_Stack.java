package Nov.ex_21112024_List_Set_Collection_Framework;

import java.util.Stack;

public class Lab213_Stack {
    public static void main(String[] args) {
        // Stack
        // List in -> First out
/*
        Stack s = new Stack();
        s.add("Akshay");
        s.add("Ajay");
        s.add("Adityaa");
        System.out.println(s);


*/

        Stack s = new Stack();
        s.push("Akshay");
        s.push("Ajay");
        s.push("Ayush");
        s.push("Aaditya");


        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.add("Namu"));
        System.out.println(s);

        s.add(0,"Nomulwar");
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.get(0));
        System.out.println(s.get(1));

    }
}
