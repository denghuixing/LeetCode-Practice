package Two_Sum_II_Input_Array_is_Sorted_167;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        int[] arr = new int[]{2,7,11,15};
        int[] arr2 = new int[]{-1,0};
        System.out.println(Arrays.toString(s.twoSum(arr2,-1)));
//        System.out.println(s.binarySort(arr, 9));
    }
    public int[] twoSum(int[] numbers, int target) {
        int middle = binarySort(numbers, target)+2< numbers.length ? binarySort(numbers, target)+2: numbers.length;
        System.out.println(numbers.length+" "+middle);
        Map<Integer,Integer> numMap = new HashMap<>();
        for(int i=0; i<numbers.length; i++){
            int sub = target - numbers[i];
            if(numMap.containsKey(sub)){
                return new int[]{numMap.get(sub)+1, i+1};
            }else{
                numMap.put(numbers[i],i);
            }
        }
        return new int[]{};
    }

    public int binarySort(int[] srcArray, int des){
        int low = 0;
        int high = srcArray.length-1;
        int middle = (low + high)/2;
        while(low <= high) {
            middle = (low + high)/2;
            if(des == srcArray[middle]) {
                return middle;
            }else if(des <srcArray[middle]) {
                high = middle - 1;
            }else {
                low = middle + 1;
            }
        }
        System.out.println(middle);
        return middle;
    }
}
