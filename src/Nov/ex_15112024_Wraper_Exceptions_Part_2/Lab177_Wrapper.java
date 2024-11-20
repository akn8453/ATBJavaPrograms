package Nov.ex_15112024_Wraper_Exceptions_Part_2;

public class Lab177_Wrapper {
    public static void main(String[] args) {
        int a = 10;
        Integer b = a; //Boxing - int -> Integer
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        b.intValue();

        Integer a2 = 42;
        int value = a2; //unboxing -Integer -> int
        System.out.println(value);


    }
}
