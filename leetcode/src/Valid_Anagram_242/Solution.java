package Valid_Anagram_242;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        boolean res = s.isAnagram("a","b");
        System.out.println(res);
    }
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char s_c = s.charAt(i);
            char t_c = t.charAt(i);
            if(s_c == t_c) continue;
            if(map.containsKey(s_c)){
                map.put(s_c,map.get(s_c)+1);
            }else{
                map.put(s_c,1);
            }
            if(map.containsKey(t_c)){
                map.put(t_c,map.get(t_c)-1);
            }else{
                map.put(t_c,-1);
            }
        }
//        for(int i=0; i<t.length(); i++){
//            char c = s
//        }
        for(int num: map.values()){
            if(num != 0){
                return false;
            }
        }
        System.out.println(map.values());
        System.out.println(map);
        return true;
    }
}
