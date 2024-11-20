package Nov.ex_15112024_Wraper_Exceptions_Part_2;

public class Lab178_Converstions {
    public static void main(String[] args) {
        String num = "10";

        //String -> Wrapper(Integer) -> Primitive
        Integer a = Integer.valueOf(num);
        int a2 = a; //unboxing
        System.out.println(a2);

        //String to primitive
        int a3 = Integer.parseInt(num);
        System.out.println(a3);

        Long l = 10l;
        Short s =23;
        Boolean bb = true;


    }
}
