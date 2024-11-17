package Nov.ex_17112024_Static_Wraper_Exceptions;

public class Lab170_Real_SIB_IIB {

    public static void main(String[] args) {

        ATB s1 = new ATB("Amit");
        ATB s2 = new ATB("Suraj");
        ATB s3 = new ATB("Tushar");
        ATB s4 = new ATB("Balaji");
        ATB s5;
        new ATB("AKSHAY");
        s1.readDoc();
        s2.readDoc();

        //static
        ATB.doassignmet();//static method
        System.out.println(ATB.courseName);// static variable
    }



}

class ATB {
    {
        /*
        what is the prupose?
        Here we can write code related to start a website
        or anythin before starting the web automation or api automation
         */
        System.out.println("IIB");
        System.out.println("Reading from CSV file");
    }

    static {
        System.out.println("Class is loaded then i will execute");
    }

    public String getName() {
        return name;
    }

    public ATB (String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    void readDoc(){
        System.out.println("Non-Static Method");
        System.out.println(courseName);
    }
    static void doassignmet(){
       // System.out.println(phone);
        System.out.println("Do assignment");
    }

    private String name;
    private String phone;
    static String courseName ="ATB9x";
}
