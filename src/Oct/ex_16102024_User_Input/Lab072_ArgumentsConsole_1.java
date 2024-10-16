package Oct.ex_16102024_User_Input;

public class Lab072_ArgumentsConsole_1 {
    public static void main(String[] args) {
        // Create a Program to check wheather Akshay nomulwar will go to Goa OR NOT
        // Take an input age = Akshay ->  Goa
        // age > 25 -> Drinking - Goa
        // Ternary operator

      System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);

        int age = Integer.parseInt(args[1]);
        System.out.println(age > 25 ? "Allowed to Goa" : "Not Allowed");
    }
}
