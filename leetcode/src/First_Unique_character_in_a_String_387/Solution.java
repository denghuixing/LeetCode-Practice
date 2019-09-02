package First_Unique_character_in_a_String_387;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        int res = s.firstUniqChar("loveleetcode");
        System.out.println(res);
    }

    public int firstUniqChar(String s) {
        if(s.length()<=1) return 0;
        Map<Character,Integer> map= new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,-1);
            }else {
                map.put(c,i);
            }
        }
        for(int i=0; i<s.length(); i++){
            if(map.get(s.charAt(i))!=-1) return map.get(s.charAt(i));
        }
//        System.out.println(map);
        return -1;
    }
}
