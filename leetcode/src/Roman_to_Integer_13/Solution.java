package Roman_to_Integer_13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.romanToInt("IV"));
        System.out.println(s.romanToInt("III"));
        System.out.println(s.romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {
        if(s.length()<1) return 0;
        Map<Character,int[]> map = new HashMap<>();
        map.put('I', new int[]{0,1});
        map.put('V',new int[]{1,5});
        map.put('X',new int[]{2,10});
        map.put('L',new int[]{3,50});
        map.put('C',new int[]{4,100});
        map.put('D',new int[]{5,500});
        map.put('M',new int[]{6,1000});
        char[] charArr = s.toCharArray();
        int res = 0;
        for(int i=0 ; i<charArr.length-1 ; i++){
            if(map.get(charArr[i])[0]>=map.get(charArr[i+1])[0]){
                res = res + map.get(charArr[i])[1];
            }else {
                res = res - map.get(charArr[i])[1];
            }
        }
        res += map.get(charArr[charArr.length-1])[1];

//        System.out.println(map);
//        for (Character key:map.keySet()) {
//            System.out.println(key+": "+map.get(key)[0]+" "+map.get(key)[1]);
//        }
        return res;
    }
}
