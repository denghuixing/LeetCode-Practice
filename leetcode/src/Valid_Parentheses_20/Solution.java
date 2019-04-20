package Valid_Parentheses_20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.isValid("()[]{}"));
        System.out.println(s.isValid("([)]{}"));
        System.out.println(s.isValid("({})"));
        System.out.println(s.isValid("[]}"));
        System.out.println(s.isValid("["));
    }

    public boolean isValid(String s) {
        if(s.length()<1) return true;
        Map<Character,Integer> map = new HashMap<>();
        map.put('(',1);
        map.put('[',2);
        map.put('{',3);
        map.put(')',-1);
        map.put(']',-2);
        map.put('}',-3);
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            if(map.get(s.charAt(i))>0) {
                stack.push(s.charAt(i));
                continue;
            }
            if(stack.isEmpty()){return false;}
            if(map.get(stack.peek())+map.get(s.charAt(i))!=0){
                return false;
            }else {
                stack.pop();
            }
        }
        return stack.isEmpty();
//        stack.isEmpty() ? return true: return false
//        if(stack.isEmpty()) return true;
//        else return false;
    }
}
