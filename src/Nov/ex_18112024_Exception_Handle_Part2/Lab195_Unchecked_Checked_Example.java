package Nov.ex_18112024_Exception_Handle_Part2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab195_Unchecked_Checked_Example {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Unchecked");
        }

        try {
            FileReader f = new FileReader("c://abc.txt");
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally checked exception");
        }


    }
}
