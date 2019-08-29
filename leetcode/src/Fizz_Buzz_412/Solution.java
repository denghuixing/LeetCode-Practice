package Fizz_Buzz_412;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        List<String> res = s.fizzBuzz(15);
        System.out.println(res);
    }
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for (int i=1; i<=n; i++){
            if(0==i%5 && 0==i%3){
                res.add("FizzBuzz");
            }else if(0 == i%3){
                res.add("Fizz");
            }else if(0 == i%5){
                res.add("Buzz");
            }else{
                res.add(String.valueOf(i));
            }
        }
        return res;
    }
}
