package Best_Time_To_Buy_or_Sell_Stock_121;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        int[] stockArr = new int[]{7,1,5,3,6,4};
//        int[] stockArr2 = new int[]{7,6,3,1};
        System.out.println(Arrays.toString(stockArr));
        System.out.println(s.maxProfit2(stockArr));
    }

    //force method, not good enough! try better method
    public int maxProfit(int[] prices) {
        int maxProf = 0;
        for(int i=0; i<prices.length-1; i++){
            for(int j=i+1; j<prices.length; j++){
                int profit = prices[j] - prices[i];
                maxProf = maxProf>profit ? maxProf : profit;
            }

        }
        return maxProf;
    }

    //One pass method, buy in min price!!!
    public int maxProfit2(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProf = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<minPrice) {
                minPrice = prices[i];
            }else if(prices[i]-minPrice>maxProf){
                maxProf = prices[i]-minPrice;
            }
        }
        return maxProf;
    }
}
