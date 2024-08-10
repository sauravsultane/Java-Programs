// package sorting;

public class CountingSort {


    public static void sorting(int arr[]){
        int largest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }

        int count[]= new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;

        }

        int j=0;

        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
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
