package Pascals_Triangle_II_119;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.getRow(2));

    }
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex < 0) {
            return new ArrayList<>();
        }
        List<Integer> stage = new ArrayList<>();
        stage.add(1);
        if (rowIndex == 0) return stage;
        stage = new ArrayList<>();
        stage.add(1);
        stage.add(1);
        for (int i = 1; i < rowIndex; i++) {
            List<Integer> temp = new ArrayList<>();
            int lastIndex = stage.size() - 1;
            temp.add(stage.get(0));
            for (int j = 0; j < lastIndex - 1; j++) {
                temp.add(stage.get(j) + stage.get(j + 1));
            }

            temp.add(stage.get(lastIndex - 1) + stage.get(lastIndex));
            temp.add(stage.get(lastIndex));
            stage = temp;
        }
        return stage;
    }

}
