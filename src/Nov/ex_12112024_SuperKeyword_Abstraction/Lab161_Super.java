package Nov.ex_12112024_SuperKeyword_Abstraction;

public class Lab161_Super {

    public static void main(String[] args) {
        Car c = new Car();

    }
}

class Car extends  Vehical{
    private  int maxSpeed = 281;

    @Override
    void display() {
        super.display();
    }
    Car(){
        super(10);
        System.out.println("DC Car");
        System.out.println(this.maxSpeed);
        System.out.println(super.maxSpeed);
        this.display();//child
        super.display();//parent

    }
}


class Vehical {

    public int maxSpeed = 180;

    void display(){
        System.out.println("Parent");
    }

    Vehical(){
        System.out.println("DC Vehicle");
    }
    Vehical (int a){
        System.out.println("PC Vehicle");
    }

    void message (){
        System.out.println("Hello Vehicle");
    }

    void message (int a){
        System.out.println("Hello Vehicle");
    }

}