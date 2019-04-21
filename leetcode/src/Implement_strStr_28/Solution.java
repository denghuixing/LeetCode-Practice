package Implement_strStr_28;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.strStr("hello","ll"));
        System.out.println(s.strStr("aaaaa","bba"));
        System.out.println(s.strStr("aaaaa",""));
        System.out.println(s.strStr("aaa","aaaa"));
    }

    public int strStr(String haystack, String needle) {
        int hayLen = haystack.length();
        int neLen = needle.length();
        if(neLen==0) return 0;

        for(int i=0; i<hayLen; i++){
            if(haystack.charAt(i)==needle.charAt(0) && hayLen-i >=neLen){
//                int tmp = neLen;
                boolean flag = true;
                for (int j=1;j<neLen;j++){
                    if(haystack.charAt(i+j)!=needle.charAt(j)){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    return i;
                }
            }
        }
        return -1;
    }
}
