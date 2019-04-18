package Reverse_Integer7;

public class Solution {
    public static void main(String[] args){
        System.out.println("hello world");
        Solution s = new Solution();
        System.out.println(s.reverse(123));
    }

    //通过除数与余数的方法来解决，这个没有考录到溢出问题
    public int reverse(int x){
        if(x==0){
            return 0;
        }
        int temp = Math.abs(x);
        int res = 0;
        while (temp>0){
            int pop = temp%10;
            temp = temp/10;
            if(res>Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 && pop>7)) return 0;
            res = res*10 + pop;
        }
        if(x<0){
            return -res;
        }else {
            return res;
        }
    }
}
