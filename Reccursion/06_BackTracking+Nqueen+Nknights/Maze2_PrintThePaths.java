<<<<<<< HEAD
import java.util.ArrayList;

public class Maze2_PrintThePaths {
    public static void main(String[] args) {
        System.out.println(path("", 3, 3));
    }
    static ArrayList<String> path(String e, int r, int c){
        ArrayList<String> ans = new ArrayList<>();
        if(r==1&&c==1){
            ans.add(e);
            return ans;
        }
        else if(r==1 && c!=1){
            ArrayList<String> pathright = path(e+"R", r, c-1);
            ans.addAll(pathright);
        }
        else if(c==1 && r!=1){
            ArrayList<String> pathdown = path(e+"D", r-1, c);
            ans.addAll(pathdown);
        }
        else{
            ArrayList<String> pathright = path(e+"R", r, c-1);
            ArrayList<String> pathdown = path(e+"D", r-1, c);
            ans.addAll(pathright);
            ans.addAll(pathdown);
        }
        return ans;
    }
}
=======
import java.util.ArrayList;

public class Maze2_PrintThePaths {
    public static void main(String[] args) {
        System.out.println(path("", 3, 3));
    }
    static ArrayList<String> path(String e, int r, int c){
        ArrayList<String> ans = new ArrayList<>();
        if(r==1&&c==1){
            ans.add(e);
            return ans;
        }
        else if(r==1 && c!=1){
            ArrayList<String> pathright = path(e+"R", r, c-1);
            ans.addAll(pathright);
        }
        else if(c==1 && r!=1){
            ArrayList<String> pathdown = path(e+"D", r-1, c);
            ans.addAll(pathdown);
        }
        else{
            ArrayList<String> pathright = path(e+"R", r, c-1);
            ArrayList<String> pathdown = path(e+"D", r-1, c);
            ans.addAll(pathright);
            ans.addAll(pathdown);
        }
        return ans;
    }
}
>>>>>>> be372f68be5095a3420265508787e91550474a6b
