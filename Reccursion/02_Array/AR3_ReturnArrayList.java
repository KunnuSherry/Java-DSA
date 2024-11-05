//Here we are taking the arrayList outside the reccursive function

import java.util.ArrayList;

public class AR3_ReturnArrayList {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,2};
        System.out.println(search(arr, 2, 0));
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> search(int[] arr, int target, int index){
        if(index==arr.length){
            return new ArrayList<>();
        } else if (arr[index]==target) {
            list.add(index);
        }
        search(arr, target, index+1);
        return list;
    }
}
