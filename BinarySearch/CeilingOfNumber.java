// We need to return a number equal to or greater than the target number.

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,10};
        System.out.println(Ceiling(arr, 7));
    }
    static int Ceiling(int[] arr, int target){
        int low =0;
        int mid=0;
        int high =arr.length-1;
        while(low<=high){
            mid = low + (high-low)/2;
            if(arr[mid] == target){
                return arr[mid];
            }
            if(arr[mid]>target){
                high = mid-1;
            }
            else{
                low = low+1;
            }
        }
        return arr[low];
    }


}
