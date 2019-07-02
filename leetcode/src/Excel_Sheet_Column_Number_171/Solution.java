package Excel_Sheet_Column_Number_171;

public class Solution {

    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.titleToNumber("AB"));
    }

    public int titleToNumber(String s) {
        if(s.length()==0) return 0;
        char[] charArr= s.toCharArray();
        int sum = 0;
        for(int i = charArr.length-1; i>=0; i--){
//            System.out.println((int)charArr[i]);
            sum += (charArr[i]-64) * Math.pow(26,(charArr.length-i-1));
//            System.out.println(charArr[i]-64);
//            System.out.println((charArr.length-i-1)*26+1);
//            System.out.println(sum);
        }
        return sum;
    }
}