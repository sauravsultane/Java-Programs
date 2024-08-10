package oop;
public  class Constructor {
    public static void main(String args[]){
        Student s1 =new Student();
        Student s2 =new Student("Saurav");
        Student s3 =new Student(21);

        System.out.println(s3.age);


    }

    
}


class Student{

    String name;
    int age;
    float percentage;

    Student(){
        System.out.println("Constructor is running....");
    }

    Student(String name){
        this.name=name;
    }
    Student(int age){
        this.age=age;
    }

}