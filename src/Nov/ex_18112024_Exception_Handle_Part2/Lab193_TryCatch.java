package Nov.ex_18112024_Exception_Handle_Part2;

public class Lab193_TryCatch {
    public static void main(String[] args) {
        try{
            String s1 = "Akshay";
            String a1 = args[0];
            int a = 10 / 0;
            s1 = null;
            System.out.println(s1.trim());
        }catch (Exception e){
            System.out.println("There is some problem with the code");
            System.out.println(e.getMessage());
        }

        System.out.println("End of the program!");
    }
}
