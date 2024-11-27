package Nov.ex_21112024_List_Set_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab214_ArrayList_With_Class {
    public static void main(String[] args) {

        Student s1 = new Student("Akshay","1");
        Student s2 = new Student("Ajay","2");
        Student s3 = new Student("Aditya","3");

        List<Student> myStudents = new ArrayList<>();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);


    s1.printDeatils();
    s2.printDeatils();
    s3.printDeatils();

        System.out.println(myStudents);

    }
}
