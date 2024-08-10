package oop;

public class abstractclass {

    public static void main(String[] args) {
        
        // Horse h=new Horse();
        // h.eat();
        // h.changeColor();

        Dog d= new Dog();

    }
    
}


abstract class Animal2{  // we cant create object of abstract classes
    String name;
    String color;

    Animal2(){
        System.out.println("Animal constructor is called");
    }

    void eat(){
        System.out.println("Animal Eating");
    }

    abstract void run();  // if the class is abstract class in that case if any function is define as 
                          //abstract function we have to give some value to it in every single subclass compulsarryly
}

class Horse extends Animal2{

    int leg;

    Horse(){
        System.out.println("Houres Constructor ic called");
    }

    void changeColor(){
        color="dark";
    }

    void run(){
        System.out.println("Horse run on 4 legs");// compulsary statment 

    }


}

class Dog extends Horse{

    Dog(){
        System.out.println("Dog constructor is called");
    }
}