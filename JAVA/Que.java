

public class Que{

    public static void bobblesort(int number[]){
        for(int i=0;i<number.length;i++){
            for(int j=0;j<number.length-1;j++){
                if(number[j]>number[j+1]){
                    int temp=number[j];
                    number[j]=number[j+1];
                    number[j+1]=temp;
                }
            }
        }
    }
    public static void printArr(int number[]){
        for(int i=0;i<=number.length;i++){
            System.out.print(number[i] +" ");

        }
    }

    public static Boolean que(int number[]){

        for(int i=0;i<number.length-1;i++){
          
            for(int j=i+1;j<number.length;j++){
                if(number[i]==number[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]){

        int number[]={1,12,35,47,5,16,27,18,99,0,1};
        // que(number);
        bobblesort(number);
        printArr(number);

    }

}