package Recursion.backtracking;

public class Knights {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        nKnight(board,0,0,4);
    }

    static void nKnight(boolean[][] board, int r, int c, int target) {
        if (target == 0) {
            display(board);
            System.out.println();
            return;
        }
        if (r == board.length - 1 && c == board.length) {
            return;
        }
        if (c == board.length) {
            nKnight(board, r + 1, 0, target);
            return;
        }
        if (isSafe(board, r, c)) {
            board[r][c] = true;
            nKnight(board, r, c + 1, target - 1);
            board[r][c] = false;
        }
        nKnight(board, r, c + 1, target);
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }

        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }

        return true;
    }


    static boolean isValid(boolean[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("K ");
                }
                else {
                    System.out.print("X ");

                }
            }
            System.out.println();
        }
    }
}
