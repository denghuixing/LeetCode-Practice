package Count_and_Say_38;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
//        System.out.println(s.countAndSay(4));
//        System.out.println(s.countAndSay(3));
        for(int i=1; i<15; i++){
            System.out.println(s.countAndSay(i));
        }
    }

    public String countAndSay(int n) {
        if(n<1) return "";
        if(n==1) return "1";
        StringBuilder sb = new StringBuilder();
        sb.replace(0,sb.length(),"11");

        for(int i=1;i<n-1;i++){
            StringBuilder tmpSb = new StringBuilder();
            for(int j=0;j<sb.length()-1;){
                if(sb.charAt(j)!=sb.charAt(j+1)){
                    tmpSb.append("1"+sb.charAt(j));
                    j++;
                }else {
                    int count = 0;
                    for(int k = j;k<sb.length();k++){
                        if(sb.charAt(k)==sb.charAt(j)){
                            count++;
                        }else { break; }
                    }
                    tmpSb.append(Integer.toString(count)+sb.charAt(j));
                    j += count;
                }
            }
            if(sb.charAt(sb.length()-1)!=sb.charAt(sb.length()-2)){
                tmpSb.append("1"+sb.charAt(sb.length()-1));
            }
                sb.replace(0,sb.length(),tmpSb.toString());
        }
        return sb.toString();
    }
}
