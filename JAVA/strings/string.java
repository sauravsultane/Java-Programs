package strings;

public class string {

    public static void printstr(String str3){

        for (int i=0;i<str3.length();i++){
            System.out.print(str3.charAt(i)+" ");

        }

    }
    public static void main(String args[]){


        char str[]={'a','b','c','d'};
        String str1="Saurav";
        String str2=new String("Sultane");


        //concatnation in java 

        String str3=str1+" " +str2;

        System.out.println(str3);

        System.out.println(str3.charAt(0));
        printstr(str3);



    }
    
}
