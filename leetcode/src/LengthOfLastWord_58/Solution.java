package LengthOfLastWord_58;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.lengthOfLastWord("Hello world"));
        System.out.println(s.lengthOfLastWord("a "));
    }

    public int lengthOfLastWord(String s) {
        int count = 0;
        int pos = s.length()-1;
        for(int i = s.length()-1;i>0;i--){
            if(s.charAt(i)==' '){
                pos--;
            }else {
                break;
            }
        }
        for(int i=pos;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
            }else {
                break;
            }
        }
        return count;
    }
}
