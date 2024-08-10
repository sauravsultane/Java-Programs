public class NewArr {

    public static void printsumarray(int number[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=i;j<number.length;j++){
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++){
                    // System.out.println(number[k]+" ");
                    currSum+=number[k];
                }
                // System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
               

            }
            

        }
        System.out.println(maxSum);
    }


    

    public static void subarr(int number[]){
        for(int i=0;i<number.length;i++){
            int start=i;

            for(int j=i;j<number.length;j++){
                int end=j;

                for(int k=start;k<=end;k++){
                    System.out.print(number[k]+" ");
                }

                System.out.println();

            }
            System.out.println();

        }
    }

    public static void pairs(int numbers[]){
        

        for(int i=0;i<numbers.length;i++){
            int curr=numbers[i];

            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+ curr+" ,"+numbers[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int number[]={1,2,3,4,5,6,7,8,9,10};
        // pairs(number);
        // subarr(number);
        printsumarray(number);
    }
}
