package Nov.ex_19112024_Generics_Why_CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lab203_Array_List {
    public static void main(String[] args) {

      //  Collection list = new ArrayList();
       // List list1 = new ArrayList(); //dynamic dispatcher
        ArrayList StudentList = new ArrayList();

        StudentList.add("Akshay");
        StudentList.add("Ajay");
        StudentList.add("Aditya");
        StudentList.add("Ankita");
        StudentList.add("Namarta");
        StudentList.add(123);
        StudentList.add(true);
        StudentList.add(null);

        System.out.println(StudentList);

        //Collection - interface

    }
}
