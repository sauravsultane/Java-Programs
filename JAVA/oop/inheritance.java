package oop;

public class inheritance {

    public static void main(String args[]){

        Lion l1 = new Lion();
        l1.color="red";

        Lion l2 = new Lion();
        l2.color="broun";

        Lion l3 = new Lion();
        l3.color="blakc";

        Lion l4 = new Lion();
        l4.color="pink";

        Lion l5 = new Lion();
        l5.color="White";

        Lion l6 = new Lion();
        l6.eat();

    }


    
}
// Base class
class Animal{
    String color;
    int weight;
    int height;
    
    void eat(){
        System.out.println("Animals eats");
    }

    void walk(){
        System.out.println("Animal walks");
    }

    void drink(){
        System.out.println("Animal Drinks");
    }
}
//Derived class
class Lion extends Animal{

    String type;
    String gender;

    void Shikar(){
        System.out.println("Lion do shikar to live");
    }
    void king(){
        System.out.println("Lion is king of jungle");
    }


}


