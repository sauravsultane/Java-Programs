package sorting;

public class SelectionSort {

    public static void SelectionSort(int arr[]){
        for(int i=0; i<arr.length;i++){
            int minposition=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minposition]<arr[j]){
                    minposition=j;
                }

            }

            int temp=arr[minposition];
            arr[minposition]=arr[i];
            arr[i]=temp;

        }
    }

    public static void printarr(int arr[]){
        for(int i=1;i<=arr.length;i++){
            System.out.print(i+" ");
        }
    }

    public static void main(String args[]){
        int arr[]={5,4,3,2,1};
        SelectionSort(arr);
        printarr(arr);
    }
    
}
