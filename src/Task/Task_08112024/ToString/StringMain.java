package Task.Task_08112024.ToString;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMain {
    public static void main(String[] args) {
        ATBStudentArrays[] ar = {
                new ATBStudentArrays(1, "Akshay: " ,  "Nanded"),
                new ATBStudentArrays(2, "Chetan: "  , "Kolhapur"),
                new ATBStudentArrays(3, "Sumit: "  , "Nanded"),
                new ATBStudentArrays(4, "Karan :" , "Kolhapur")};
        //Arrays.toString() is overloaded for array of Object class
                System.out.println(Arrays.toString(ar));

    }




}
