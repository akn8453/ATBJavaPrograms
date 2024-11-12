package Nov.ex_08112024_OOPs_Polymorphsim.MethodOverLoading;

public class Lab157 {
    public static void main(String[] args) {

        Mathoperations maths = new Mathoperations();
       int sum = maths.add(3,4);
       float sum1 = maths.add(3.4f,5.6f);
        System.out.println(sum);
        System.out.println(sum1);
    }
}

class Mathoperations{

   int add(int a, int b){

       return a+b;
   }

   float add(float a, float b){

       return a+b;
   }

   void add(int a, int b, int c){

       System.out.println("Hello World");
   }

   double add(double a, double b){

       return  a+b;
   }

    double add(double a, double b, double c){

       return a+b+c;
    }
}