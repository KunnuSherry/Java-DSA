package HashMapsQuestions;
//We have na array given which can have value from 0 to 12, we want to return the count of the number in the array
import java.sql.SQLOutput;
import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,1,3,2};
        int[] hash = new int[13];
        for(int num: arr){
            hash[num]++;
        }
        System.out.print("How many numbers do you want to search the count for: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("Enter the number"+(i+1)+" to be searched: ");
            int s = sc.nextInt();
            System.out.println(s+" is search for "+hash[s]+" times");
        }
    }

}
