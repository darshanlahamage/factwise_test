package Q3;

public class stockPrice {
    public static int maxProfit(int[] prices){
        int ls = Integer.MAX_VALUE;
        int op =0;
        int pist =0;

        for(int i=0;i<prices.length;i++){
            if (prices[i] <ls){
                ls = prices[i];
            }
            pist = prices[i]-ls;
            if(op<pist){
                op =pist;
            }
        }
        return op;
    }
     public static void main(String [] args){
         int prices1[] = {7,1,5,3,6,4};
         int prices2[] = {7,6,4,3,1};
         System.out.println(maxProfit(prices1));
         System.out.println(maxProfit(prices2));
    }
}
