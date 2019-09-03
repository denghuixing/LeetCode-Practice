package Daily_Temperatures_739;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        int[] temperatures = new int[]{73,74,75,71,69,72,76,73};
        int[] res = s.dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(res));
    }
    public int[] dailyTemperatures(int[] T) {
        int len = T.length;
        int[] res = new int[len];
        Stack<int[]> stack = new Stack<>();
        for(int i=0; i<len; i++){
            while (!stack.isEmpty() && stack.peek()[0] < T[i]){
                res[stack.peek()[1]] = i - stack.peek()[1];
                stack.pop();
            }
//            ArrayList<Integer> temp = new ArrayList<>();
//            temp.add(T[i]);
//            temp.add(i);
            stack.push(new int[]{T[i],i});
        }
        return res;
    }
}
