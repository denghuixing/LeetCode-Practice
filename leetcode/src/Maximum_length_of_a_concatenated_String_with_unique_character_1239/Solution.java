package Maximum_length_of_a_concatenated_String_with_unique_character_1239;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<String> inputArr = new ArrayList<>();
        inputArr.add("un");
        inputArr.add("iq");
        inputArr.add("ue");
        int res = s.maxLength(inputArr);
        System.out.println(res);
    }

    int max = 0;

    public int maxLength(List<String> arr) {
        List<String>[] lists = new List[2];
        int active = 0;
        lists[1] = new ArrayList();

        for (String s : arr) {

            lists[active] = new ArrayList(lists[1 - active]);
            if (isUnique(s))
                lists[active].add(s);
            System.out.println("s:" + " " + s + " - " + listToString(lists));
            for (String s1 : lists[1-active]) {
                String s2 = s1 + s;
                if (isUnique(s2)) {
                    lists[active].add(s2);
                    System.out.println("s2:" + " " + s2 + " - " + listToString(lists));
                }
            }
            active = 1 - active;
        }

        return max;
    }

    private static String listToString(List<String>[] strList) {
        StringBuilder sb = new StringBuilder();
        for (List<String> s : strList)
        {
            sb.append(s);
            sb.append(" ");
        }
        return sb.toString();
    }

    private boolean isUnique(String s) {
        int[] a = new int[256];

        for (char c : s.toCharArray()) {
            if (a[c]++ > 0)
                return false;
        }
        max = Math.max(s.length(), max);
        return true;
    }
}