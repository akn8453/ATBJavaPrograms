package Task.Task_08112024.Multilevel;

import java.sql.SQLOutput;

public class Task8_1_Inheritance_Multilevel {
    public static void main(String[] args) {

        System.out.println("ATBStudent1 Extending the resources of the Course");
        System.out.println();
        System.out.println();

        ATBStudent_1 atb1 = new ATBStudent_1();
        atb1.Give_Recording_Access();
        atb1.Give_Java_notes();
        atb1.Give_ATB_Community_Access();
        atb1.Using_Recording_Access();
        atb1.Completing_Task_Daily();
        atb1.Asking_Doubts();
        System.out.println();
        System.out.println();

        System.out.println("ATBStudent2 Extending the resources of the Course");
        System.out.println();
        System.out.println();

        ATBStudent_2 atb2 = new ATBStudent_2();
        atb2.Give_Recording_Access();
        atb2.Give_Java_notes();
        atb2.Give_ATB_Community_Access();
        atb2.Using_Recording_Access();
        atb2.Solving_250_Que();
        System.out.println();
        System.out.println();

        System.out.println("ATBStudent2 Extending the resources of the Course");
        System.out.println();
        System.out.println();

        ATBStudent_3 atb3 = new ATBStudent_3();
        atb3.Give_Recording_Access();
        atb3.Give_Java_notes();
        atb3.Give_ATB_Community_Access();
        atb3.Using_Recording_Access();
        atb3.Posting_Concept();


    }
}
