package Nov.ex_12112024_SuperKeyword_Abstraction;

public class Tesla extends Engine{

    @Override
    void startEngine() {
        System.out.println("Starting at the electric engine");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping at the electric engine");

    }
    void drive(){
        startEngine();
        stopEngine();
    }
}
