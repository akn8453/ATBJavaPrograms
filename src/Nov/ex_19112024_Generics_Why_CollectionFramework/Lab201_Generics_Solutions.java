package Nov.ex_19112024_Generics_Why_CollectionFramework;

public class Lab201_Generics_Solutions {
    public static void main(String[] args) {
       temp_sum(23,45);
       temp_sum("Pramode","Dutta");
       temp_sum(true,false);

    }

    public static <T> T temp_sum(T a, T b){
        System.out.println(a);
        System.out.println(b);
        return  null;
    }
}
