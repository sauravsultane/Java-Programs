
package oop;
public class Ststic {

    public static void main(String args[]){

        Students s1 =new Students();
        s1.Schoolname="Shri shivaji high school";

        Students s2= new Students();
        s2.name="Saurav";
        s2.Schoolname="SVM";
        
        System.out.println(s2.Schoolname);

    }
    
}

class Students {
    String name;
    int rollno;

    static String Schoolname;

    void setName(String Schoolname){
        this.name=name;
    }

    void get(){
        this.name=name;
    }

}
