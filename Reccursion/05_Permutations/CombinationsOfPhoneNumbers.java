<<<<<<< HEAD
import java.util.ArrayList;

public class CombinationsOfPhoneNumbers {
    public static void main(String[] args) {
        phone("", "12");
        System.out.println(phone1("", "123"));
    }
    static void phone(String e, String ne){
        if(ne.isEmpty()){
            System.out.println(e);
            return;
        }
        char f = ne.charAt(0);
        int val = f - '0';

        for(int i=0; i<3; i++){
            char ch = (char) ((97+(3*(val-1)))+i);
            String temp = Character.toString(ch);
            phone(e+temp, ne.substring(1));
        }
    }
    static ArrayList<String> phone1(String e, String ne){
        ArrayList<String> list = new ArrayList<>();
        if(ne.isEmpty()){
            list.add(e);
            return list;
        }
        char f = ne.charAt(0);
        int val = f - '0';

        for(int i=0; i<3; i++){
            char ch = (char) ((97+(3*(val-1)))+i);
            String temp = Character.toString(ch);
            ArrayList<String> below = phone1(e+temp, ne.substring(1));
            list.addAll(below);
        }
        return list;
    }
}
=======
import java.util.ArrayList;

public class CombinationsOfPhoneNumbers {
    public static void main(String[] args) {
        phone("", "12");
        System.out.println(phone1("", "123"));
    }
    static void phone(String e, String ne){
        if(ne.isEmpty()){
            System.out.println(e);
            return;
        }
        char f = ne.charAt(0);
        int val = f - '0';

        for(int i=0; i<3; i++){
            char ch = (char) ((97+(3*(val-1)))+i);
            String temp = Character.toString(ch);
            phone(e+temp, ne.substring(1));
        }
    }
    static ArrayList<String> phone1(String e, String ne){
        ArrayList<String> list = new ArrayList<>();
        if(ne.isEmpty()){
            list.add(e);
            return list;
        }
        char f = ne.charAt(0);
        int val = f - '0';

        for(int i=0; i<3; i++){
            char ch = (char) ((97+(3*(val-1)))+i);
            String temp = Character.toString(ch);
            ArrayList<String> below = phone1(e+temp, ne.substring(1));
            list.addAll(below);
        }
        return list;
    }
}
>>>>>>> be372f68be5095a3420265508787e91550474a6b
