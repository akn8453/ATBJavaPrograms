package Task.Task_05112024;

import java.sql.SQLOutput;

public class Task1_Object_Class {
    public static void main(String[] args) {
    Dog D1 = new Dog();
    D1.name = "Jimmy";
    D1.Bark();
    System.out.println(D1.name);

     Dog D2 =  new Dog();
     D2.name = "Tiger";
     D1.eat();
     System.out.println(D2.name);

     Dog D3 = new Dog();
     D3.name = "Bronzoo";
     D3.run();
     System.out.println(D3.name);

     Dog D4 =  new Dog();
     D4.name = "Sheru";
     D4.play();
     System.out.println(D4.name);

     Dog D5 = new Dog();
     D5.name = "Ronny";
     D5.anger();
     System.out.println(D5.name);

    }

}

class Dog {
    String name;

    void Bark (){
        System.out.println("Barking");
    }

    void eat(){
        System.out.println("Eating");
    }

    void run (){
        System.out.println("Running");
    }

    void play (){
        System.out.println("Playing");
    }

    void anger (){
        System.out.println("Angry");
    }


}