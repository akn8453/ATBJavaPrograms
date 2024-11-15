package Nov.ex_12112024_SuperKeyword_Abstraction;

import java.sql.SQLOutput;

public class Lab165_Interface_P1 {

}

abstract  class ABC {

    ABC(){
        System.out.println("DC");
    }
    abstract  void m1();

   void m2(){
       System.out.println("Complete method");
   }
}

interface  I{
    void m1 ();
    void m2 ();

    default void m3(){
        System.out.println("Default method");
    }
    static void m4 (){
        System.out.println("Static method in interface");
    }


}