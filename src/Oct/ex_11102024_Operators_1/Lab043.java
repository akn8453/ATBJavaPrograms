package Oct.ex_11102024_Operators_1;

public class Lab043 {
    public static void main(String[] args) {
        String first_name = "Akshay";
        String last_name = "Nomulwar";
        int a = 10;
        int b = 10;
        System.out.println(first_name + last_name + a + b);
        // AkshayNomulwar1010 - first operator - + performed as Concatination
        System.out.println(a + b + first_name + last_name);
        // First + math -> 20AkshayNomulwar
        System.out.println(first_name + last_name + (a + b));
        // BODMAS -
    }
}
