package test;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args){
//        System.out.println("hello world!");
//        int[] arr = new int[10];

//        String s = "    hello world!";
//        String s = "  hello world!  ";
        String s = "qqhelloqworld!qq";
        System.out.println(Arrays.toString(s.split("q")));
        System.out.println(listToString(s.split("q")));

    }

    private static String listToString(String[] strList) {
        System.out.println(strList.length);
        StringBuilder sb = new StringBuilder();
        for (String s : strList)
        {
            sb.append(s);
            sb.append("_");
        }
        return sb.toString();
    }
}
