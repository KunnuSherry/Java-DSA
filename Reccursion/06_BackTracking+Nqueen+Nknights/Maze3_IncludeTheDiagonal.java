import java.util.ArrayList;

public class Maze3_IncludeTheDiagonal {
    public static void main(String[] args) {
        System.out.println(path("", 3, 3));
    }
    static ArrayList<String> path(String e, int r, int c){
        ArrayList<String> ans = new ArrayList<>();
        if(r==1&&c==1){
            ans.add(e);
            return ans;
        }
        if(r>1&&c>1){
            ArrayList<String> pathdiagonal = path(e+"T", r-1, c-1);
            ArrayList<String> pathright = path(e+"R", r, c-1);
            ArrayList<String> pathdown = path(e+"D", r-1, c);
            ans.addAll(pathright);
            ans.addAll(pathdown);
            ans.addAll(pathdiagonal);

        }
        if(r==1 && c!=1){
            ArrayList<String> pathright = path(e+"R", r, c-1);
            ans.addAll(pathright);
        }
        if(c==1 && r!=1){
            ArrayList<String> pathdown = path(e+"D", r-1, c);
            ans.addAll(pathdown);
        }
        return ans;
    }
}
