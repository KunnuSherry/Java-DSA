<<<<<<< HEAD
public class P1_CountPermutations {
    public static void main(String[] args) {

    }
    static int permutCount(String s, String p){
        if(p.isEmpty()){
            System.out.println(s);
            return 1;
        }
        char ch = p.charAt(0);
        int count = 0;
        for(int i=0; i<=s.length(); i++){
            String f = s.substring(0,i);
            String sec = s.substring(i, s.length());
            count = count + permutCount(f+ch+sec, p.substring(1));
        }
        return count;

    }
}
=======
public class P1_CountPermutations {
    public static void main(String[] args) {

    }
    static int permutCount(String s, String p){
        if(p.isEmpty()){
            System.out.println(s);
            return 1;
        }
        char ch = p.charAt(0);
        int count = 0;
        for(int i=0; i<=s.length(); i++){
            String f = s.substring(0,i);
            String sec = s.substring(i, s.length());
            count = count + permutCount(f+ch+sec, p.substring(1));
        }
        return count;

    }
}
>>>>>>> be372f68be5095a3420265508787e91550474a6b
