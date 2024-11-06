<<<<<<< HEAD
public class Maze5_Backtracking {
    public static void main(String[] args) {
        Boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        allpaths("", maze, 0,0);
    }
    static void allpaths(String e, Boolean[][] maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(e);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        if(r< maze.length-1){
            allpaths(e+"D", maze, r+1, c);
        }
        if(c< maze[0].length-1){
            allpaths(e+"R", maze, r, c+1);
        }
        if(c>0){
            allpaths(e+"L",maze, r, c-1);
        }
        if(r>0){
            allpaths(e+"U", maze, r-1, c);
        }
        maze[r][c] = true;
    }

}
=======
public class Maze5_Backtracking {
    public static void main(String[] args) {
        Boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        allpaths("", maze, 0,0);
    }
    static void allpaths(String e, Boolean[][] maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(e);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        if(r< maze.length-1){
            allpaths(e+"D", maze, r+1, c);
        }
        if(c< maze[0].length-1){
            allpaths(e+"R", maze, r, c+1);
        }
        if(c>0){
            allpaths(e+"L",maze, r, c-1);
        }
        if(r>0){
            allpaths(e+"U", maze, r-1, c);
        }
        maze[r][c] = true;
    }

}
>>>>>>> be372f68be5095a3420265508787e91550474a6b
