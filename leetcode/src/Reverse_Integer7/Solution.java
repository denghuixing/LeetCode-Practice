package Reverse_Integer7;

public class Solution {
    public static void main(String[] args){
        System.out.println("hello world");
        Solution s = new Solution();
        System.out.println(s.reverse(123));
    }

    //通过除数与余数的方法来解决
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
            res = res*10 + temp%10;
            temp = temp/10;
        }
        if(flag){
            return -res;
        }else {
            return res;
        }
    }
}
