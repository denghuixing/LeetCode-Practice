package Valid_palidrome_125;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        String str = "A man, a plan, a canal: Panama";
        System.out.println(s.isPalindrome(str));
    }

    public boolean isPalindrome(String s) {
        String reverse = s.toLowerCase().replaceAll(" ","");
        System.out.println(reverse);
        for(char c : s.toCharArray()){
            if(c>)
            System.out.println(c);
        }
        return true;
    }
}
