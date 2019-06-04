package Pascals_Triangle_118;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.generate(3));
    }

    public List<List<Integer>> generate(int numRows) {
        if(numRows<1) return null;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> stage = new ArrayList<>();
        stage.add(1);
        res.add(stage);
        for (int i=2; i<numRows; i++){
            List<Integer> temp = new ArrayList<>();
            
        }
    }
}
