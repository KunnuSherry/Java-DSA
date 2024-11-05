import java.util.ArrayList;

public class P1_PermuationsOfString {
    public static void main(String[] args) {
        permut("", "kunal");
        System.out.println(permutation("", "abc"));
    }
    static void permut(String s, String p){
        if(p.isEmpty()){
            System.out.println(s);
            return;
        }
        char ch = p.charAt(0);

        for(int i=0; i<=s.length(); i++){
            String f = s.substring(0,i);
            String sec = s.substring(i, s.length());
            permut(f+ch+sec, p.substring(1));
        }

    }
    static ArrayList<String> permutation(String p, String up){
        ArrayList<String> str = new ArrayList<>();
        if(up.isEmpty()){
            str.add(p);
            return str;
        }
        char ch = up.charAt(0);
        for(int i=0; i<=p.length(); i++){
            String f = p.substring(0,i);
            String sec = p.substring(i, p.length());
            ArrayList<String> below = permutation(f+ch+sec, up.substring(1));
            str.addAll(below);
        }
        return str;

    }
}
