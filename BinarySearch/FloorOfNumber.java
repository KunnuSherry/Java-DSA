// Return a number equal to smaller than the target.

public class FloorOfNumber {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        System.out.println(nextGreatestLetter(letters, 'c'));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = 0;
        while(low<=high){
            int mid = (low+high);
            if(letters[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return letters[low % letters.length];
    }
}
