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
