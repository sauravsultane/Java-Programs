package impque;

public class searchtwod{
    public static void search(int matrix[][],int key){
        int row=0,col=matrix[0].length-1;

        while (row<matrix.length && col>=0) {
            if(key==matrix[row][col]) {
                System.out.println("Your key is at :("+row+","+col+")");
                break;
            }
             else if(key<matrix[row][col]){
                col--;
            }else if(key>matrix[row][col]){
                row++;
            }else{
                System.out.println("Your key is not in matrix");
            }
            
        }

    }

    public static void main(String args[]){

        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int key=16;
        search(matrix,key);

    }

}