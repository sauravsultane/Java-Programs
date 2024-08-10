public class array {


    public static void swaparr(int marks[]){
        int start =0;
        int end=marks.length-1;

        while(start<end){
            
            int temp=marks[start];
            marks[start]=marks[end];
            marks[end]=temp;

            start++;
            end--;
        }


        
    }

    public static int binarys(int marks[],int n){

        int start   =0;
        int end     =marks.length-1;
        int number  =n;
        

        while(start<=end){
            int mid=(start+end)/2;

            if(number==marks[mid]){
                System.out.println("Your number is at "+ mid);
            }if(number>marks[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }



        }


        return -1;
    }



    public static void binary(int marks[] , int n){
        int number=n;

        int start=0;
        int end  =marks.length-1;
        

        for(int i=0;i<=marks.length;i++){
            int mid  =(start+end)/2;
            if(number==marks[mid]){
                System.out.println("Your number is at "+mid);
                break;


            }else if (number>marks[mid]){
                start=mid+1;
                
                

            }else if(number<marks[mid]){
                end=mid-1;
                
            }
        }

    }

    public static void largest(int marks[]){
        int number=Integer.MIN_VALUE;

        for(int i=0;i<marks.length;i++){
            if(number<marks[i]){
                number=marks[i];
            }
            

        }
        System.out.println(number);
       

    }
    public static void linear(int marks[],int n){

        for(int i=0;i<marks.length;i++){
            if (marks[i]==n) {
                System.out.println(i);
                break;
                
            }else{
                System.out.println("Your number is not in the list");
            }


        }
    }


    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;

        }

        

    } 
    public static void main(String args[]){
        int marks[]={35,45,50,54,80};
        // Scanner sc=new Scanner(System.in);

        // update(marks);
        // for(int i=0;i<marks.length;i++){
        //     System.out.print(marks[i]+" ");
        // }

        // System.out.println();


        // int n=sc.nextInt();
        // linear(marks, n);
        // largest(marks);
        // binary(marks,35);
        // binarys(marks,35);
        swaparr(marks);
        for (int i = 0; i < marks.length; i++) {
            System.err.println(marks[i]);            
        }
        

        

    }
    
}
