package recursion;

public class factroial {

    public static int fact(int n){
        if(n==0){
            return 1;
        }

        int fm1=fact(n-1);
        int fn = n*fact(n-1);
        

        return fn;
    }

    public static int printsum(int n){
        if(n==0){
            return 0;
        }

        int sums=printsum(n-1);
        int sum=n+printsum(n-1);
        return sum;
    }

    public static void main(String args[]){
        int n=5;

        System.out.println(fact(n));
        System.out.println(printsum(n));
    }
    
}
