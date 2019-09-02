package Sum_of_Two_integers_371;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        int res = s.getSum(1,2);
        System.out.println(res);
    }

    public int getSum(int a, int b) {
        int res = a ^ b;                            //按位加
        int carry = (a&b) << 1;                     //计算金薇
        if(carry !=0) return getSum(res,carry);     //判断进位并处理
        return res;
    }
}
