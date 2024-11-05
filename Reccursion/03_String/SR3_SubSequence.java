import java.util.ArrayList;

public class SR3_SubSequence {
    public static void main(String[] args) {
        subsequence("abc", "");
        System.out.println(subsequenceRet("abc", ""));
    }
    static void subsequence(String s, String ns){
        if(s.isEmpty()){
            System.out.println(ns);
            return;
        }
        subsequence(s.substring(1),ns+s.charAt(0));
        subsequence(s.substring(1),ns);
    }
    static ArrayList<String> subsequenceRet(String s, String ns){
        ArrayList<String> lst = new ArrayList<>();
        if(s.isEmpty()){
            lst.add(ns);
            return lst;
        }
        ArrayList<String> left = subsequenceRet(s.substring(1), ns+s.charAt(0));
        ArrayList<String> right = subsequenceRet(s.substring(1), ns);
        left.addAll(right);
        return left;
    }
}
