package oop;

public class methodoverriding {
    public static void main(String[] args) {

        Deear d1 = new Deear();
        d1.eat();// If same function is available in both parent and child class it always reffer child class function its called overriding
        
    }
    
}

class Animal1{
    String type;

    void eat(){
        System.out.println("Eating");
    }
}

class Deear extends Animal1{

    String color;

    void eat(){
        System.out.println("Eating grass");
    }

}
