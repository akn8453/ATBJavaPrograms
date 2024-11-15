package Nov.ex_12112024_SuperKeyword_Abstraction;

public class Lab164 {
    public static void main(String[] args) {

        Wagnor r = new Wagnor();
        r.drive();

        Tesla t = new Tesla();
        t.drive();
    }

}

 class Wagnor extends  Engine{


    void drive (){
        startEngine();
        stopEngine();
    }
    @Override
    void startEngine() {
        System.out.println("Starting car");
    }

    @Override
    void stopEngine() {
        System.out.println("Stoping car");

    }
}

abstract class Engine {
    abstract void startEngine();
    abstract  void stopEngine();
}