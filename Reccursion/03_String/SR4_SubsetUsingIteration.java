<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

public class SR4_SubsetUsingIteration {
    public static void main(String[] args) {
        int[]  arr = {1,2,3};
        ArrayList<ArrayList<Integer>> list = subset(arr);
        for(ArrayList<Integer> l: list){
            System.out.println(l);
        }
    }
    static ArrayList<ArrayList<Integer>> subset(int[] arr){
        ArrayList<ArrayList<Integer>> olist = new ArrayList<>();
        olist.add(new ArrayList<>());
        for(int i : arr){
            int n = olist.size();
            for(int j=0; j< n; j++){
                ArrayList<Integer> ilist = new ArrayList<>();
                ilist.add(i);
                ilist.addAll(olist.get(j));
                olist.add(ilist);
            }
        }
        return olist;
    }
}
=======
import java.util.ArrayList;
import java.util.List;

public class SR4_SubsetUsingIteration {
    public static void main(String[] args) {
        int[]  arr = {1,2,3};
        ArrayList<ArrayList<Integer>> list = subset(arr);
        for(ArrayList<Integer> l: list){
            System.out.println(l);
        }
    }
    static ArrayList<ArrayList<Integer>> subset(int[] arr){
        ArrayList<ArrayList<Integer>> olist = new ArrayList<>();
        olist.add(new ArrayList<>());
        for(int i : arr){
            int n = olist.size();
            for(int j=0; j< n; j++){
                ArrayList<Integer> ilist = new ArrayList<>();
                ilist.add(i);
                ilist.addAll(olist.get(j));
                olist.add(ilist);
            }
        }
        return olist;
    }
}
>>>>>>> be372f68be5095a3420265508787e91550474a6b
