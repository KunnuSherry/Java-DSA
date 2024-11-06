import java.lang.reflect.Array;
import java.time.Instant;
import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,49,5};
        System.out.println(Minimum(arr));

    }
    static int Minimum(int[] arr){
        int min = arr[0];
        for(int num: arr){
            if(num<min){
                min=num;
            }
        }
        return min;
    }
}