package Pascals_Triangle_118;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.generate(0));
    }

    public List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> res = new ArrayList<>();
//        List<Integer> stage = new ArrayList<>();
        if(numRows<1) {
//            res.add(null);
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
        for (int i=2; i<numRows; i++){
//            System.out.println(stage);
            List<Integer> temp = new ArrayList<>();
            int lastIndex = stage.size()-1;
//            System.out.println("last: "+lastIndex);
            temp.add(stage.get(0));
//            if(lastIndex==1){
//                temp.add(stage.get(0)+stage.get(0));
//            }else {
            for (int j=0; j<lastIndex-1; j++){

//                    System.out.println(temp.get(j)+temp.get(j+1));
                temp.add(stage.get(j)+stage.get(j+1));
//                System.out.println(temp);
            }
//            }
//            System.out.println("last"+lastIndex);

            temp.add(stage.get(lastIndex-1)+stage.get(lastIndex));
            temp.add(stage.get(lastIndex));
//            temp.add(stage.get(0));
//            temp.add(lastIndex,stage.get(lastIndex-1));
            res.add(temp);
            stage = temp;
        }
        return res;
    }
}
