package ClimbingStair_70;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        for (int i=1; i<10; i++){
            System.out.println(s.climbStairs(i));
        }

    }

    public int climbStairs(int n) {
        if(n<1) return 0;
        if(n==1) return 1;
        if(n==2) return 2;

        int res = 0;
        int tmp1 = 1;
        int tmp2 = 2;
        for(int i=3; i<=n;i++){
            res = tmp1 + tmp2;
            tmp1 = tmp2;
            tmp2 = res;
        }
        return res;
    }
}
