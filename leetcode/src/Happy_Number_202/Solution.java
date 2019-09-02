package Happy_Number_202;

import java.util.HashSet;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        boolean res = s.isHappy(12);
        System.out.println(res);
    }

    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();
        while (n != 1){
            int sum = 0;
            while (n!=0){
                sum += (n%10)*(n%10);
                n /= 10;
            }
            n = sum;
            if(set.contains(n)) return false;
            else set.add(n);
        }
        return true;
    }
}
