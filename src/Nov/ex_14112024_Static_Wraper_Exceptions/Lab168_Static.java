package Nov.ex_14112024_Static_Wraper_Exceptions;

public class Lab168_Static {
    public static void main(String[] args) {

        Student s1 = new Student(23);
        Student s2 = new Student(33);
        System.out.println(Student.school_name);
        Student.school_name = "xyz";
        System.out.println(Student.school_name);
        System.out.println(s1.school_name);
        System.out.println(s2.school_name);

    }



}

class Student{


    int age;//non static variable //instance variable.
    static String school_name = "ABC";//STATIC VARIABLE

    public Student(int age) {
        this.age = age;
    }


    {
//INSTANCE INITIALIZATION BLOCK
        System.out.println("IIB");
        System.out.println("Here you can write a code what you want");
        System.out.println("Read a Mysql DB");

    }

    static {
        System.out.println("SIB");
        System.out.println("Loaded once when class is loaded.");
        System.out.println("Read the excel file");
    }


}
