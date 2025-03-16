package HashMapsQuestions;

import java.util.HashMap;

public class CountUsingHashmap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 3, 2, 1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            //if the num exists +1 else make the key for num
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);
    }
}
class CountCharacter{
    public static void main(String[] args) {
        String s = "adaeargqhbvsacbsduhargqhbvdfhdagfuywqasdara";
        HashMap<Character, Integer> map = new HashMap<>();
         for(int i=0; i<s.length(); i++){
             map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
         }
        System.out.println(map);
    }
}
