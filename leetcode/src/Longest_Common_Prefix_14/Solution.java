package Longest_Common_Prefix_14;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.longestCommonPrefix(new String[]{"flower","flight","flow"}));
        System.out.println(s.longestCommonPrefix(new String[]{"ower","flight","flow"}));
        System.out.println(s.longestCommonPrefix(new String[]{}));
    }

    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int minLen = 0;
        if(strs.length>0){
            minLen = strs[0].length();
        }else{
            return "";
        }
        for(int i=0; i<strs.length; i++){
//            System.out.println(strs[i]+" "+strs[i].length());
            if(strs[i].length()<minLen){
                minLen = strs[i].length();
            }
        }
        for(int i=0; i<minLen; i++){
            char tmp = strs[0].charAt(i);
//            System.out.println(tmp);
            for (String s: strs) {
                if(s.charAt(i)!=tmp) return sb.toString();
            }
            sb.append(tmp);
        }

//        System.out.println(minLen);
        return sb.toString();
    }
}
