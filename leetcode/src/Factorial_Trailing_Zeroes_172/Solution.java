package Factorial_Trailing_Zeroes_172;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.trailingZeroes(12));
    }

    public int trailingZeroes(int n) {
        int trailNum = 1;
        int countZeros = 0;
        while (n>=1){
            trailNum *= n--;
        }
        System.out.println(trailNum);
        if(trailNum%10 == 0){
            while (trailNum/10>=1){
                if(trailNum%10==0){
                    countZeros++;
                    trailNum = trailNum/10;
                }else {
                    break;
//                trailNum = trailNum/10;
                }
            }
        }else {
            while (trailNum/10>=1){
                if(trailNum%10==0){
                    countZeros++;
                    trailNum = trailNum/10;
                }else {
//                    break;
                trailNum = trailNum/10;
                }
            }
        }

        return countZeros;
    }

    //就是找5的个数
    public int trailNum(int n){
        int result=0;
        while (n>0){
            result+=n/5;

            n/=5;
        }
        return result;
    }
}
