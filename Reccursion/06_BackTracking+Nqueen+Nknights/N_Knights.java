public class N_Knights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        nknights(board, 0, 0, n);
    }

    static void nknights(boolean[][] board, int row, int col, int target) {
        if (target == 0) {
            display(board);
            System.out.println();
            return;
        }

        if (row == board.length) {
            return;
        }

        if (col == board[0].length) {
            nknights(board, row + 1, 0, target);
            return;
        }

        if (isSafe(row, col, board)) {
            board[row][col] = true;
            nknights(board, row, col + 1, target - 1); // Place knight and move to next column with reduced target
            board[row][col] = false; // Backtrack
        }

        nknights(board, row, col + 1, target); // Skip current cell and move to next column
    }

    static boolean isSafe(int row, int col, boolean[][] board) {
        int n = board.length;

        // Knight moves (2 rows, 1 col) and (1 row, 2 col) in all directions
        if (row - 2 >= 0 && col + 1 < n && board[row - 2][col + 1]) return false;
        if (row - 2 >= 0 && col - 1 >= 0 && board[row - 2][col - 1]) return false;
        if (row - 1 >= 0 && col + 2 < n && board[row - 1][col + 2]) return false;
        if (row - 1 >= 0 && col - 2 >= 0 && board[row - 1][col - 2]) return false;

        return true;
    }

    static void display(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j]) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
