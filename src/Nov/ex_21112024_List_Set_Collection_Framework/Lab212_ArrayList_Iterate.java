package Nov.ex_21112024_List_Set_Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab212_ArrayList_Iterate {
    public static void main(String[] args) {

        List<String> myList = new ArrayList();
        myList.add("Akshay");
        myList.add("Ajay");
        myList.add("Ayush");


        System.out.println("To print ArrayList - 1");
        for(String str : myList){
            System.out.println(str);
        }

        System.out.println("To print arraylist - 2");
        for(int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }


        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
