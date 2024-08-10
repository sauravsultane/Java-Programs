package impque;

public class spiral {
    public static void spirals(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;

        while(startRow<=endRow && startCol<=endRow){

            // print top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");

            }

            // print right boundary

            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }

            // print bottom boundary

            for(int j=endCol-1;j>=startCol;j--){
                System.out.print(matrix[endRow][j]+" ");

            }

            // print left boundary

            for(int i=endRow-1;i>=startRow+1;i--){
                System.out.print(matrix[i][startCol]+" ");

            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }

    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{1,2,3,4},{5,6,7,8}};

        spirals(matrix);
    }
    
}
