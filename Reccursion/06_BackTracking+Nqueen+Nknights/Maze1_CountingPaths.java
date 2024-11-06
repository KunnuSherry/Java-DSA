<<<<<<< HEAD
public class Maze1_CountingPaths {
    public static void main(String[] args) {
        System.out.println(count(3,3));

    }
    static int count(int r, int c){
        int count = 0;
        if(r==1 || c==1){
            return 1;
        }
        int ctotal = count+ count(r-1, c) + count(r, c-1);
        return ctotal;
    }
}
=======
public class Maze1_CountingPaths {
    public static void main(String[] args) {
        System.out.println(count(3,3));

    }
    static int count(int r, int c){
        int count = 0;
        if(r==1 || c==1){
            return 1;
        }
        int ctotal = count+ count(r-1, c) + count(r, c-1);
        return ctotal;
    }
}
>>>>>>> be372f68be5095a3420265508787e91550474a6b
