package Nov.ex_18112024_Exception_Handle_Part2;

public class Lab184_Exceptions {
    public static void main(String[] args) {
        int a = 0;
        int c = 0; //java.lang.ArithmeticException
        try {
            c = 10/a;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
     /*   catch (Exception e){
            System.out.println(e.getMessage());
        }
        catch (Throwable e){
            System.out.println(e.getMessage());
        } */
        System.out.println(c);
    }
}

//Exception is a class whose parent is throwable
//Parent of throwable is object.
//we can use throwable(bigger) exception(medium) arithmetic exception(smaller)


