package HashMapsQuestions;

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        String s = "absdfdsfwerdcferghs";
        int[] arr = new int[26];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'a']++;
        }

        System.out.println(arr['a'-'a']);
    }
}
