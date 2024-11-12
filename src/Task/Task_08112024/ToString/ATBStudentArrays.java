package Task.Task_08112024.ToString;

public class ATBStudentArrays {
    int rollno;
    String Name,Address;

    //Constructor
    public ATBStudentArrays(int rollno,String Name,String Address){
        this.rollno=rollno;
        this.Name=Name;
        this.Address=Address;

    }
    // Used to print student details
    public String toString(){
        return this.rollno+" "+this.Name+""+ this.Address;
    }
}
