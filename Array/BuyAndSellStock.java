
import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        // HashSet<Integer> map = new HashSet<Integer>();
        // int diff = 0,newDiff = 0;
        // for(int i=0; i<prices.length; i++){
            
        //     for(int j = i+1; j<prices.length; j++){
        //         if(prices[i]< prices[j]){
        //             diff = prices[j] - prices[i];
        //         }
        //         if(newDiff < diff){
        //             newDiff = diff;
        //         }
                
        //     }
        // }
        // return newDiff ;


        //  Optimal approch 

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price:prices){
             if(price< minPrice){
                minPrice = price;              

            }else{
                int profit = price - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;



    }
}

public class BuyAndSellStock {
    public static void main(String[] args){
        Solution sol = new Solution();
        int [] prices1 = {7,1,5,3,6,4};
        int [] prices2 = {7,3,5,1,8,6,5};
        int[] prices3 = {1000,899,1500,1511,1522,1500,1502,1600};
        System.out.println(("Max Proift:" + sol.maxProfit(prices1)));
        System.out.println(("Max Proift:" + sol.maxProfit(prices2)));
        System.out.println(("Max Proift:" + sol.maxProfit(prices3)));
        
    }
}
