package Task.Task_08112024.MethodOverRidding;

public class Task8_1 {
    public static void main(String[] args) {

        ATBStudent atb = new ATBStudent();
        atb.Java_Course();
        atb.Master_Class();
        atb.SQL();
        atb.API_Testing();

    }
}

class ATBCourse{
    void Java_Course(){
        System.out.println("Programming Core Java with OOPs concept");
    }

    void Master_Class(){
        System.out.println("Manual Testing Class with agile methodology");
    }

    void SQL (){
        System.out.println("SQL Master Class");
    }

    void API_Testing (){
        System.out.println("API Postman Course");
    }

}

class ATBStudent extends ATBCourse {

 void Java_Course(){
     System.out.println("Can access the Full java course with notes");
 }

 void SQL (){
     System.out.println("Can access the full SQL course");
 }

 void Master_Class(){
     System.out.println("Can access the full manual master class with agile method");
 }

  void API_Testing(){
      System.out.println("Can access the API post man master class");
  }
}