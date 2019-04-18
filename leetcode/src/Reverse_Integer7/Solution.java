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
        int temp = x;
        int res = 0;
        boolean flag = false;
        if(x<0){
            temp = -temp;
            flag = true;
        }
        while (temp>0){
//            res = res*10 + temp%10;
//            temp = temp/10;
            int pop = temp%10;
            temp = temp/10;
            if(res>Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE && pop>7)) return 0;
            res = res*10 + pop;
        }
        if(flag){
            return -res;
        }else {
            return res;
        }
    }
}
