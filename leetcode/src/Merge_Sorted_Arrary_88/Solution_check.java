package Merge_Sorted_Arrary_88;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

//public class Solution_check {
//}
class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        System.out.println(m+" "+n+" "+nums1.length);
        if(nums1.length<m+n){return;}
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<m; i++){
            res.add(nums1[i]);
        }
        if(m==0){res.add(Integer.MAX_VALUE);}
        int pos = 0;
        for (int i=0; i<n; i++){
            if(nums2[i]<=res.get(0)){
                res.add(0,nums2[i]);
//                System.out.println("1: "+res);
                continue;
            }
            if(nums2[i]>=res.get(res.size()-1)){
                for(int j=i;j<n;j++){
                    res.add(nums2[j]);
//                    System.out.println("2: "+res);
                }
                break;
            }
            for(int j=res.size()-1; j>0; j--){
                if(nums2[i]<=res.get(j) && nums2[i]>=res.get(j-1)){
                    res.add(j,nums2[i]);
//                    System.out.println("3: "+res);
                    break;
                }
            }
        }
//        System.out.println(res);
//        System.out.println(res);
        for(int i=0; i<m+n; i++){
            nums1[i] = res.get(i);
        }
//        System.out.println(Arrays.toString(nums1));
//        nums1 = res.toArray(int[] nums1);
    }
}

public class Solution_check {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }

        String result = "";
        for(int index = 0; index < length; index++) {
            int number = nums[index];
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static String integerArrayToString(int[] nums) {
        return integerArrayToString(nums, nums.length);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums1 = stringToIntegerArray(line);
            line = in.readLine();
            int m = Integer.parseInt(line);
            line = in.readLine();
            int[] nums2 = stringToIntegerArray(line);
            line = in.readLine();
            int n = Integer.parseInt(line);

            new Solution2().merge(nums1, m, nums2, n);
            String out = integerArrayToString(nums1);

            System.out.print(out);
        }
    }
}