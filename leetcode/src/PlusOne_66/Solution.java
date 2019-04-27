package PlusOne_66;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        int[] arr = new int[]{6,9,9};
        System.out.println(Arrays.toString(s.plusOne(arr)));
    }

    public int[] plusOne(int[] digits) {
        boolean flag = false;
        for (int i=0; i<digits.length;i++){
            if(digits[i]!=9){
                flag = true;
            }
        }
        if(flag==false){
            int[] res = new int[digits.length+1];
            res[0] = 1;
            for(int i=1; i<res.length; i++){
                res[i] = 0;
            }
            return res;
        }else {
//            digits[digits.length-1] =
            for (int i=digits.length-1; i>=0; i--){
                int temp = digits[i] + 1;
                if(temp<10){
                    digits[i] = temp%10;
                    return digits;
                }else digits[i] = temp%10;
            }
        }
        return new int[]{1,2,3};
    }
}
