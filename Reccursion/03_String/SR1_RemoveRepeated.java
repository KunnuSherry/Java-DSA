<<<<<<< HEAD
public class SR1_RemoveRepeated {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s = "Kunala";
        replace(s, 0, 'a', sb);
        System.out.println(sb.toString());
        System.out.println(replaceII(s, 'a'));
    }
    static void replace(String s, int i, char r, StringBuilder sb){
          if(i==s.length()){
              return;
          }
          if(s.charAt(i)!=r){
              sb.append(s.charAt(i));
              replace(s, i+1, r, sb);
          }
          else {
              replace(s, i + 1, r, sb);
          }

    }
    static String replaceII(String s, char r){
        if(s.isEmpty()){
            return "";
        }
        char ch = s.charAt(0);
        if(ch==r){
            return replaceII(s.substring(1), r);
        }
        return ch + replaceII(s.substring(1), r);
    }


}
=======
public class SR1_RemoveRepeated {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s = "Kunala";
        replace(s, 0, 'a', sb);
        System.out.println(sb.toString());
        System.out.println(replaceII(s, 'a'));
    }
    static void replace(String s, int i, char r, StringBuilder sb){
          if(i==s.length()){
              return;
          }
          if(s.charAt(i)!=r){
              sb.append(s.charAt(i));
              replace(s, i+1, r, sb);
          }
          else {
              replace(s, i + 1, r, sb);
          }

    }
    static String replaceII(String s, char r){
        if(s.isEmpty()){
            return "";
        }
        char ch = s.charAt(0);
        if(ch==r){
            return replaceII(s.substring(1), r);
        }
        return ch + replaceII(s.substring(1), r);
    }


}
>>>>>>> be372f68be5095a3420265508787e91550474a6b
