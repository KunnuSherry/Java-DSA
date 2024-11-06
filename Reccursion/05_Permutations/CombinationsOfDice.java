import java.util.ArrayList;
import java.util.List;

public class CombinationsOfDice {
    public static void main(String[] args) {
        dice("", 4);
        System.out.println(dice1("", 4));
    }
    static void dice(String e, int target){
        if(target==0){
            System.out.println(e);
            return;
        }
        for(int i=1; i<=6 && i<=target; i++){
            dice(e+i, target-i);
        }
    }
    static List<String> dice1(String e, int target){
        List<String> list = new ArrayList<>();
        if(target==0){
            list.add(e);
            return list;
        }
        for(int i=1; i<=6 && i<=target; i++){
            List<String> below = dice1(e+i, target-i);
            list.addAll(below);
        }
        return list;
    }
}
