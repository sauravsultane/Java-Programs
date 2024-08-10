package oop;

import java.rmi.StubNotFoundException;
import java.util.jar.Attributes;

public class Basic {
    public static void main(String args[]){
        // Pen p1 =new Pen();
        // p1.setColor("pink");
        // p1.setTip(500);

        // System.out.println(p1.color);
        // System.out.println(p1.tip);

        // BankAcc B1 =new BankAcc();
        // B1.CustName="Saurav Anil Sultane";
        // B1.AccNo=1234567890;

        // System.out.println(B1.AccNo);

        Student s1=new Student();
        s1.name="saurav";
        s1.age=21;
        s1.grade=3;
        s1.percentage=99;
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.grade);
        System.out.println(s1.percentage);


    }


    
}

class Student{
    String name ;
    int age;
    int grade;
    float percentage;

    Student(){
        System.out.println("");
    }

    Student(String name){
        name="Saurav";
    }

    Student(int age){

        age=21;
    }

}
class BankAcc{

    public String CustName;
    int AccNo;
    private String Password;

}

class Pen{
    String color;
    int tip;

    void  setColor(String newColor){
        color =newColor;
    }
    void setTip(int size){
        tip=size;
    }
}
