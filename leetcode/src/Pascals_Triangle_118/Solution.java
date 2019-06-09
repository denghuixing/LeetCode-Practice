package Pascals_Triangle_118;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.generate(2));
    }

    public List<List<Integer>> generate(int numRows) {
        if(numRows<1) {
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> stage = new ArrayList<>();
        stage.add(1);
        res.add(stage);
        if(numRows==1) return res;
        stage = new ArrayList<>();
        stage.add(1);
        stage.add(1);
        res.add(stage);
        for (int i=1; i<numRows; i++){
            List<Integer> temp = new ArrayList<>();
            int lastIndex = stage.size()-1;
            temp.add(stage.get(0));
            for (int j=0; j<lastIndex-1; j++){
                temp.add(stage.get(j)+stage.get(j+1));
            }
            temp.add(stage.get(lastIndex-1)+stage.get(lastIndex));
            temp.add(stage.get(lastIndex));
            res.add(temp);
            stage = temp;
        }
        return res;
    }
}
