package Palidrome_Number_9;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.isPalindrome(121));

    }
    public boolean isPalindrome(int x){
        if(x<0){
            return false;
        }
        if(x==0){
            return true;
        }
        int res = 0;
        int temp = x;
        while (temp>0){
            int pop = temp%10;
            temp = temp/10;
            if(temp>Integer.MAX_VALUE/10 || (temp==Integer.MAX_VALUE && pop>7)){
                return false;
            }
            res = res*10 + pop;
        }
        System.out.println(res+" "+x);
        if(res==x){return true;}
        else return false;
    }
}
