package Excel_Sheet_Column_Title_168;

//import static jdk.vm.ci.meta.JavaKind.Char;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.convertToTitle(26*3));
    }
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0){
//            System.out.println(n);
            if(n%26==0){
                sb.insert(0,'Z');
//                n = n/26;
                n = n - (n/26)*26 + n/26-1;
            }else{
                char c = (char)(n % 26 + 64);
                sb.insert(0,c);
//                sb.append()
                n = n/26;
            }

        }
        return sb.toString();
    }
}
