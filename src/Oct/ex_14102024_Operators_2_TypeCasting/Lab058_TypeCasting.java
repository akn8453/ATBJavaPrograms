package Oct.ex_14102024_Operators_2_TypeCasting;

public class Lab058_TypeCasting {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
        //
        // short s = phone_no; // Implict - JVM
        short s = (short)phone_no; // Explicit - User - Loss that data
        System.out.println(s);
    }
}
