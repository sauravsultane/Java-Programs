package recursion;

public class fibunaci {

    public static int printnum1(int n){
       if(n== 0|| n==1){
        return n;
           }

           int fibnm1=printnum1(n-1);
           int fibnm2=printnum1(n-2);

           int fib = fibnm1+fibnm2;
           return fib;

    }

    public static void main(String args[]){
        // int n=5;

        System.out.println(printnum1(5));
    }
    
}
