package Valid_palidrome_125;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        String str = "A man, a plan, a canal: Panama";
        String str2 = "0P";
        System.out.println(s.isPalindrome(str2));
    }

    public boolean isPalindrome(String s) {
        if(s.length()<1) return true;
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetter(c)||Character.isDigit(c)){
                sb.append(c);
            }
        }
        System.out.println(sb);
        if(sb.length()<=1) return true;
//        System.out.println(sb);
        for(int i=0; i<=sb.length()/2; i++){
            if(sb.charAt(i)!=sb.charAt(sb.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
