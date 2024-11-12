public class N_Queens {
    public static void main(String[] args) {
        int num = 8;
        boolean[][] board = new boolean[num][num];
        nqueens(board, 0);
    }
    static void nqueens(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return;
        }
        for(int i=0; i<board[0].length; i++){
            if(isSafe(row, i, board)){
                board[row][i] = true;
                nqueens(board, row+1);
                board[row][i] = false;
            }

        }
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
    static void display(boolean[][] board){
        for(int i=0; i< board.length; i++){
            for(int j=0; j<board[0].length; j++){
                boolean element = board[i][j];
                if(element){
                    System.out.print("Q");
                }
                else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
