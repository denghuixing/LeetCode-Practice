package Add_Binary_67;

public class Solution {
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.addBinary("1010","1011"));
        System.out.println(s.addBinary("11","1"));
    }

    public String addBinary(String a, String b) {
        if(a.length()<1){
            return b;
        }
        if(b.length()<1){
            return a;
        }
        StringBuilder temp = new StringBuilder(a);
        a = temp.reverse().toString();
        temp.delete(0,a.length());
        b = temp.append(b).reverse().toString();
//        System.out.println(a+" "+b);
        StringBuilder res = new StringBuilder();
        int addDig = 0;
        for(int i=0;i<Math.max(a.length(),b.length());i++){
            int digA = 0;
            int digB = 0;
            if(i<a.length()){digA = a.charAt(i)-'0';}
            if(i<b.length()){digB = b.charAt(i)-'0';}
//            System.out.println(digA+" "+digB+" "+addDig);
            switch (digA+digB+addDig){
                case 0:{
                    res.append("0");
                    addDig = 0;
                    break;
                }
                case 1:{
                    res.append("1");
                    addDig = 0;
                    break;
                }
                case 2:{
                    res.append("0");
                    addDig = 1;
                    break;
                }
                case 3: {
                    res.append("1");
                    addDig = 1;
                    break;
                }
            }
//            res.append(addDig);
//            System.out.println(res);

        }
        if(addDig>0){res.append(addDig);}
        return res.reverse().toString();
    }
}
