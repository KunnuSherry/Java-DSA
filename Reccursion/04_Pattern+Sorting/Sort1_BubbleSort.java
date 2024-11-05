import java.util.Arrays;

public class Sort1_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        sort(arr,3,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int i1, int i2){
        if(i1==0){
            return;
        }
        if(i2<i1){
            if(arr[i2]>arr[i2+1]){
                swap(arr,i2,i2+1);
            }
            sort(arr,i1,i2+1);
        }
        else{
            sort(arr,i1-1, 0);
        }
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
