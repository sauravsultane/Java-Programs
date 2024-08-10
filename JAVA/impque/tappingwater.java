package impque;
// public class tappingwater {
//     public static void water(int heights[]){
//         int n=heights.length;

//         //calculate left max boundary

//         int leftMax[]=new int[n];
//         leftMax[0]=heights[0];
//         for(int i=1;i<n;i++){

//             leftMax[i]=Math.max(heights[i],leftMax[i-1]);

//         }

//         // calculate right max boundary

//         int rightMax[]=new int[n];
//         rightMax[n-1]=heights[n-1];

//         for(int i=n-2;i>=n;i--){

//             rightMax[i]=Math.max(heights[i],rightMax[i+1]);
//         }

//         //looop

//         int tw=0;

//         for(int i=0;i<n;i++){
//            int waterlevel=Math.min(leftMax[i],rightMax[i]);

//            tw+=waterlevel-heights[i];

//         }

//         System.out.println(tw);

       
//     }



//     public static void main(String args[]){
        

//         int heights[]={4,2,0,6,3,2,5};
//         water(heights);

        
//     }

    
// }



public class tappingwater {
    public static void water(int heights[]) {
        int n = heights.length;

        // Calculate left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = heights[0];
        for (int i = 1; i < n; i++) {  // <--- Changed the loop condition from i <= n to i < n
            leftMax[i] = Math.max(heights[i], leftMax[i - 1]);
        }

        // Calculate right max boundary
        int rightMax[] = new int[n];
        rightMax[n - 1] = heights[n - 1];
        for (int i = n - 2; i >= 0; i--) {  // <--- Changed the loop condition from i = n to i = n - 2, and iterates backwards correctly
            rightMax[i] = Math.max(heights[i], rightMax[i + 1]);
        }

        // Calculate total trapped water
        int totalWater = 0;  // <--- Initialized totalWater to accumulate the trapped water
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            totalWater += waterLevel - heights[i];  // <--- Changed to accumulate the total trapped water
        }

        System.out.println(totalWater);  // <--- Print the total trapped water
    }

    public static void main(String args[]) {
        int heights[] = {4, 5, 3, 7, 9, 3, 5, 6, 10};
        water(heights);
    }
}

