package sorting;

public class InsersectionSort {

    public static void sorting(int arr[]){

        for(int i=1; i<arr.length;i++){

            int curr=arr[i];
            int prv=i-1;

            while (prv>=0 && arr[prv]>curr) {
                
                arr[prv+1]=arr[prv];
                prv--;
                
            }arr[prv+1]=curr;
        }

    }

    public static void print(int arr[]){
        for(int i=1;i<arr.length;i++){

            System.out.print(i+" ");
        }
    }

    public static void main(String args[]){
        int arr[]={5,4,3,2,1,0};

        sorting(arr);
        print(arr);

    }
    
}
