package impque;

public class Stocks {


    public static void  stocks(int price[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfite=0;

        for(int i=0;i<price.length;i++){


            if (buyPrice<price[i]) {

                int profite=price[i]-buyPrice;

                maxProfite=Math.max(profite, maxProfite);

                

                
            }else{
                buyPrice=price[i];
               
            }

         
        }   System.out.println(buyPrice+": is your buying price");
        int sellingprice=maxProfite+buyPrice;
        System.out.println(sellingprice+": is your selling price ");
        System.out.println(maxProfite+": is your max profite");
        


    }

    public static void main(String args[]){


        int price[]={7,4,1,8,6,3,5};
        stocks(price);
    }
    
}
