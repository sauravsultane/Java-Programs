package recursion;

public class basic {

    public static void printnumdec(int n){
        if(n==0){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");

        printnumdec(n-1);

    }

    public static void printnuminc(int m){
        if(m==100){

            System.out.println(m);
            return;

        }

        System.out.print(m+" ");
        printnuminc(m+1);
    }

    public static void main(String args[]){
        int n=100;
        int m=0;
        printnumdec(n);
        printnuminc(m);
    }
    
}
