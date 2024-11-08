package Nov.ex_06112024_OOPs_Constructor;

import java.util.Scanner;

public class Lab154_Constructor_P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car3 t1 = new Car3("Tesla", 2015);
        System.out.println(t1.model);
        System.out.println(t1.year);
        t1.display();

        Car3 t2 = new Car3("nano",2013);
        System.out.println(t2.model);
        System.out.println(t2.year);
        t2.display();

        System.out.println("Enter the model name");
        String model_name_input = sc.next();
        System.out.println("Enter the year");
        int year_input = sc.nextInt();

        Car3 t3 = new Car3 (model_name_input, year_input);

        System.out.println(t3.year);
        System.out.println(t3.model);

        t3.display();

    }
}
class Car3 {

    String model;
    int year;

    // parametrized constructor

    Car3(String model_name, int year_created){
        System.out.println("PC");
        this.model = model_name;
        this.year = year_created;
    }

    void display(){
        System.out.println("Car2 Details ->" +this.model + " -" + this.year);
    }
}
