package impque;
import java.lang.Math;

public class direction {
    public static void displacement(String strs){
        int x=0,y=0;

        for(int i=0;i<strs.length();i++){
            char dir=strs.charAt(i);

            //left
            if(dir=='W'){
                x--;
            }

            //top
            else if(dir=='N'){
                y++;
            }

            //Down
            else if(dir=='S'){
                y--;
            }

            //Right
            else if(dir=='E'){
                x++;
            }

            

            
        }int X2=x*x;
        int Y2=y*y;
        
        double disp=Math.sqrt(X2+Y2);
        System.out.println(disp);
        
    }
    public static void main(String args[]) {
        String strs[]={"WWWEEENNNSSS"};
        displacement(strs);



    }
    
}
