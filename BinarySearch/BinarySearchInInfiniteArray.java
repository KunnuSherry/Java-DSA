public class BinarySearchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,8,9,10,12,34,65,78,100};
        int target = 5;
        int start = 0;
        int end = 1;

        while(arr[end]<target){
            int tempStart = end+1;
            end = end + (end-start+1)*2;
            start = tempStart;
        }
        int ans = BinarySearch(arr, target, start, end);
        System.out.println(ans);
    }

    public static int BinarySearch(int[] arr, int target, int start, int end) {
        int low = start;
        int high = end;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
}
