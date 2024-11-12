package Task.Task_08112024.MethodOverLoading;

import Task.Task_08112024.Multilevel.ATBStudent_3;

public class Task8_1 {
    public static void main(String[] args) {

        ATBStudents atb = new ATBStudents();
        int total_course1 = atb.Course_Purchased(1,1);
        System.out.println("Total Course purchased " + total_course1);
        int total_course2 = atb.Course_Purchased(1,1,1);
        System.out.println("Total Course purchased " + total_course2);

    }

}

class ATBStudents{

    int Course_Purchased(int Java_Course, int Master_Course){

        return Java_Course+Master_Course;
    }

    void Course_Purchased(){
        System.out.println("The Jenkins Mater Class");
    }

    int Course_Purchased(int Java_Course, int Master_Course, int SQLClass){

        return Java_Course+Master_Course+SQLClass;
    }


}