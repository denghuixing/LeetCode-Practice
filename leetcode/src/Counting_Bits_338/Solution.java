package Counting_Bits_338;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        int[] res = s.countBits(5);
        System.out.println(Arrays.toString(res));
    }

    public int[] countBits(int num) {
//        ArrayList<Integer> resArr = new ArrayList<>();
//        resArr.add(0);
        int[] resArr = new int[num+1];
        resArr[0] = 0;
        for (int i=1; i<num+1; i++){
            if (i % 2 == 0) resArr[i] = (resArr[i / 2]);
            else resArr[i] = (resArr[i / 2] + 1);
        }
        return resArr;
    }
}
