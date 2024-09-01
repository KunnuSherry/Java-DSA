public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {{12,34,222},
                       {22,56,11},
                       {33,65,90,100}};
        System.out.println(Search(arr,90));
    }
    static String Search(int[][] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]==target){
                    return i + "," + j;
                }
            }
        }
        return "Not Found !";
    }
}
