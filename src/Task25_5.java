import java.lang.String;

public class Task25_5 {

  public static void main (String [] args){
 
        String s1 = "Hello"; // SCP
        String s4 = "Hello"; // SCP
        String s2 = new String("Hello"); // Object Area
        String s3 = new String("Hello"); // Object Area
        String s5 = new String("hello"); // Object Area


       System.out.println(s1 == s4);
       System.out.println(s1 == s2);
       System.out.println(s4 == s3);
    
       System.out.println(s1.equals(s2));
       System.out.println(s4.equals(s3));
       System.out.println(s2.equals(s5));

       
       System.out.println(s1.equalsIgnoreCase(s5));
       System.out.println(s4.equalsIgnoreCase(s5));

       

      


       




 
  }





}