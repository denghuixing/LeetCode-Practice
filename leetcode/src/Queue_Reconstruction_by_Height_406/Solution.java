package Queue_Reconstruction_by_Height_406;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        int[][] arr = new int[][]{{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};

        for(int[] par : arr){
            System.out.print(Arrays.toString(par) + " ");
        }
        System.out.println();
        int[][] res = s.reconstructQueue(arr);
        for(int[] par : res){
            System.out.print(Arrays.toString(par) + " ");
        }

    }
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int []>() {        //按身高降序排序(h大的在前面)，按k的大小升序排列(k小的在前面)
            public int compare(int[] a, int[] b) {
                if(a[0] != b[0]) return -a[0]+b[0];
                else return a[1]-b[1];
            }
        });
//        for(int[] par : people){
//            System.out.print(Arrays.toString(par) + " ");
//        }
//        System.out.println();
        List<int[]> res=new LinkedList<>();        //保存结果

        for(int i=0;i<people.length;i++){
            int[] peo = people[i];
            res.add(peo[1], peo);
//            for(int[] par : res){
//                System.out.print(Arrays.toString(par) + " ");
//            }
//            System.out.println();
        }

        return res.toArray(new int[people.length][]);
    }
}
