package Reverse_String_344;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        char[] str = new char[]{'h','e','l','l','o'};
        System.out.println(Arrays.toString(str));
        s.reverseString(str);
        System.out.println(Arrays.toString(str));
    }
    public void reverseString(char[] s) {
        if(s.length <=1) return;
        int middle = s.length/2;
        for(int i=0; i<middle; i++){
            char tmp = s[s.length-1-i];
            s[s.length-1-i] = s[i];
            s[i] = tmp;
//            System.out.println(Arrays.toString(s));
        }
    }
}
