import java.util.Arrays;

public class Sort2_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        sort(arr, 3);
        System.out.println(Arrays.toString(arr));;
    }
    static void sort(int[] arr, int oloop){
        if(oloop==0){
            return;
        }
        int largest = largest(arr, oloop);
        swap(arr, largest, oloop);
        sort(arr, oloop-1);
    }
    static int largest(int[] arr, int end){
        int max = -1;
        int ind = -1;
        for(int i=0; i<=end; i++){
            if(arr[i]>max){
                max = arr[i];
                ind = i;
            }
        }
        return ind;
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
