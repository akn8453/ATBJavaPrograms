package Nov.ex_18112024_Exception_Handle_Part2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab197_Try_Catch_P2 {
    public static void main(String[] args)  {
        try {
            FileInputStream fileInputStream = new FileInputStream("C://a.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File is not present");
        }
        finally {
            System.out.println("Yes");
        }
    }
}
