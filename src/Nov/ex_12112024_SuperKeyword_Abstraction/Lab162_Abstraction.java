package Nov.ex_12112024_SuperKeyword_Abstraction;

public class Lab162_Abstraction {

}

class akshay extends Loan{
    @Override
    void loan50k() {
        System.out.println("Giving the loan");
    }

    @Override
    void loan30k() {
        System.out.println("30K the given");
    }
}

abstract class Loan{
    abstract  void loan50k();
   abstract  void loan30k();

    void loan1l(){
        System.out.println("1L Loan is there");
    }
}

//Concrete Class

class person{

}
