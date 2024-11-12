public class N_Queens_Count {
    public static void main(String[] args) {
        int num = 4;
        boolean[][] board = new boolean[num][num];
        System.out.println(nqueens(board, 0));;
    }
    static int nqueens(boolean[][] board, int row){
        int count = 0;
        if(row == board.length){
            return 1;
        }
        for(int i=0; i<board[0].length; i++){
            if(isSafe(row, i, board)){
                board[row][i] = true;
                int countbelow = nqueens(board, row+1);
                count = count+countbelow;
                board[row][i] = false;
            }

        }
        return count;
    }

    static boolean isSafe(int row, int col, boolean[][] board){
        //vertical case
        for(int i=0; i< board.length; i++){
            if(board[i][col]){
                return false;
            }
        }
        //horizontal case
        for(int i=0; i< board.length; i++){
            if(board[row][i]){
                return false;
            }
        }
        //diagonal left
        int minLeft = Math.min(row, col);
        for(int i=1; i<=minLeft; i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        //diagonal right
        int minRight = Math.min(row, board.length-col-1);
        for(int i=1; i<=minRight; i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }

}
