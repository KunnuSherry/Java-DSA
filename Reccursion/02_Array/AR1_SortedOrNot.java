<<<<<<< HEAD
public class AR1_SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,12,4};
        System.out.println(sorted(arr,0));
    }
    static boolean sorted(int[] arr, int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]<arr[index+1]==false){
            return false;
        }
        return arr[index]<arr[index+1] && sorted(arr, index+1);
    }
}
=======
public class AR1_SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,12,4};
        System.out.println(sorted(arr,0));
    }
    static boolean sorted(int[] arr, int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]<arr[index+1]==false){
            return false;
        }
        return arr[index]<arr[index+1] && sorted(arr, index+1);
    }
}
>>>>>>> be372f68be5095a3420265508787e91550474a6b
