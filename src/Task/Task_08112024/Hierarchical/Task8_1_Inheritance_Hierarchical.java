package Task.Task_08112024.Hierarchical;

public class Task8_1_Inheritance_Hierarchical {

    public static void main(String[] args) {

        System.out.println("Student_1");
        System.out.println();
        System.out.println();

        ATBStudent_1 atb1 = new ATBStudent_1();
        atb1.Fresher();
        atb1.workshop();
        atb1.enrolledCourse();
        atb1.Programming_Core_Java();
        atb1.Web_Automation();
        atb1.API_Testing();
        atb1.CI_CD_QA();

        System.out.println();
        System.out.println();
        System.out.println("Student_2");

        ATBStudent_2 atb2 = new ATBStudent_2();
        atb2.EXP_Manual_Testing();
        atb1.workshop();
        atb1.enrolledCourse();
        atb1.Programming_Core_Java();
        atb1.Web_Automation();
        atb1.API_Testing();
        atb1.CI_CD_QA();

        System.out.println();
        System.out.println();
        System.out.println("Student_3");

        ATBStudent_3 atb3 = new ATBStudent_3();
        atb3.EXP_Automation_Testing();
        atb1.workshop();
        atb1.enrolledCourse();
        atb1.Programming_Core_Java();
        atb1.Web_Automation();
        atb1.API_Testing();
        atb1.CI_CD_QA();


    }
}
