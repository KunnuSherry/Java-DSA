<<<<<<< HEAD
public class SR2_RemoveRepeatedString {
    public static void main(String[] args) {

        System.out.println(skip("kunalunsungya", "un"));
    }
    static String skip(String s, String r){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith(r)){
            return skip(s.substring(r.length()), r);
        }
        else {
            return s.charAt(0) + skip(s.substring(1), r);
        }
    }
}
=======
public class SR2_RemoveRepeatedString {
    public static void main(String[] args) {

        System.out.println(skip("kunalunsungya", "un"));
    }
    static String skip(String s, String r){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith(r)){
            return skip(s.substring(r.length()), r);
        }
        else {
            return s.charAt(0) + skip(s.substring(1), r);
        }
    }
}
>>>>>>> be372f68be5095a3420265508787e91550474a6b
