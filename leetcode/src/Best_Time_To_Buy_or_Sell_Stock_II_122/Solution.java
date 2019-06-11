package Best_Time_To_Buy_or_Sell_Stock_II_122;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        int[] stockArr = new int[]{7,1,5,3,6,4};
        int[] stockArr2 = new int[]{1,2,3,4,5};
        System.out.println(s.maxProfit(stockArr));
    }
    //One pass through method
    public int maxProfit(int[] prices) {
        if(prices.length<1) return 0;
        int maxProf = 0;
        int bottom = prices[0];
        int peak = prices[0];
        for(int i=1; i<prices.length; i++){
            if(prices[i]>prices[i-1]){
                peak = prices[i];
            }else {
                maxProf += peak-bottom;
                bottom = prices[i];
                peak= prices[i];
            }
        }
        maxProf += peak-bottom;
        return maxProf;
    }
}
