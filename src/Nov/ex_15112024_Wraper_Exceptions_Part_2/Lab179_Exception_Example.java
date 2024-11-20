package Nov.ex_15112024_Wraper_Exceptions_Part_2;

public class Lab179_Exception_Example {
    public static void main(String[] args) {

        System.out.println("Start of the program");
        String ip = args[0]; //ArrayIndexOutOfBoundsException
        int a = Integer.parseInt(ip);//.NumberFormatException
        int b = 1000/a; //ArithmeticException
        System.out.println(b);
        System.out.println("End of program");

        //Suppose we have given this to user, how the execution will happen
        //Jvm will initialize the memory(From RAM)
        //Create and starts the main thread - main called
        //1) Collects the command line args -10
        //string[] args -> {10} ->
        //2) Lab 179_exception.main
        //Now control will be transfer from main thread to main method
        // when problem comes in main -jvm
        //if we don't handel the exception jvm will handel it.
        // always terminate the program with exception

    }
}
