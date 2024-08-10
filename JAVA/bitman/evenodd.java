public class evenodd {
    public static void evenorodd(int number){

        int bitMask=1;
        if((bitMask&number)==0){
            System.out.println("even");

        }else{
            System.out.println("odd");

        }

    }
    public static void main(String args[]){
        
        evenorodd(3);
        evenorodd(5);
        
        evenorodd(4);
        evenorodd(8);
    }
    
}
