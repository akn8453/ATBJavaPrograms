package Nov.ex_21112024_List_Set_Collection_Framework;

public class Student {
    private String name;
    private String rollNo;

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

       public void printDeatils(){
           System.out.println("Student name: " + this.name);
           System.out.println("Student rollno: " + this.rollNo);
       }


}
