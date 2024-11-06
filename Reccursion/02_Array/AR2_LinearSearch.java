<<<<<<< HEAD
import java.util.ArrayList;

public class AR2_LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5};
        System.out.println(searchfromfirst(arr, 3, 0));
        System.out.println(searchfromlast(arr, 3, arr.length-1));
        searchAll(arr, 3, 0);
        System.out.println(list);
    }

    //Search from first
    static int searchfromfirst(int[] arr, int target, int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return searchfromfirst(arr, target, index+1);
    }

    //search from last
    static int searchfromlast(int[] arr, int target, int index){
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return searchfromlast(arr, target, index-1);
    }

    //Search all indices
    static ArrayList<Integer> list = new ArrayList<>();
    static void searchAll(int[] arr, int target, int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        searchAll(arr, target, index+1);
    }
}
=======
import java.util.ArrayList;

public class AR2_LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5};
        System.out.println(searchfromfirst(arr, 3, 0));
        System.out.println(searchfromlast(arr, 3, arr.length-1));
        searchAll(arr, 3, 0);
        System.out.println(list);
    }

    //Search from first
    static int searchfromfirst(int[] arr, int target, int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return searchfromfirst(arr, target, index+1);
    }

    //search from last
    static int searchfromlast(int[] arr, int target, int index){
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return searchfromlast(arr, target, index-1);
    }

    //Search all indices
    static ArrayList<Integer> list = new ArrayList<>();
    static void searchAll(int[] arr, int target, int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        searchAll(arr, target, index+1);
    }
}
>>>>>>> be372f68be5095a3420265508787e91550474a6b
