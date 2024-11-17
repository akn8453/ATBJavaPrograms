package Nov.ex_17112024_Static_Wraper_Exceptions;

public class Lab175_ENUM_P3 {

    public static void main(String[] args) {
        System.out.println(color.RED.getHexcode());
    }
}

enum color{

    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");


    private String hexcode;

    color(String hexcode){
        this.hexcode = hexcode;
    }
    String getHexcode(){
        return this.hexcode;
    }


}