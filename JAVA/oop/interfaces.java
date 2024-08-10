package oop;



// Interfaces is ues for multiple inheritance
//It is also use for total abstractclass
// Use public before evary constructor





public class interfaces {
    public static void main(String[] args) {

        //Example of total abstraction
        Queen q = new Queen();
        q.moves();

        //Multiple inheritances

        Tortal t = new Tortal();
        t.swim();
        t.walk();
    }
    
}

interface Chessplayer {

    void moves();

}

class Queen implements Chessplayer{
    public void moves(){
        System.out.println("UP,DOWN,LEFT,RIGHT,DIAGONAL IN ANY DIRECTION");
    }
}

class Elephant implements  Chessplayer{
    public void moves(){
        System.out.println("UP,DOWN.LEFT,RIGHT");
    }
}

class Camel implements Chessplayer{
    public void moves(){
        System.out.println("Diagonaly");
    }
}












// Multiple inheritance


interface Fish{
    void swim();
}

interface Mammnal{
    void walk();
}

class Tortal implements Fish,Mammnal{

    public void swim(){
        System.out.println("Tortal can Swim");
    }

    public void walk(){
        System.out.println("Tortal can walk");
    }
}