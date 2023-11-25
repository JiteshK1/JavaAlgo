package Recursion.backtracking;

public class Sudoku {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (solve(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }
    }


    static boolean solve(int[][] board){
        int n = board.length;
        int r=-1;
        int c=-1;

        boolean emptyLeft=true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j]==0){
                    r=i;
                    c=j;
                    emptyLeft=false;
                    break;
                    //break because to do further operations on it so it will exit the loop and go to next loop
                }
            }
            if (!emptyLeft){
                break;
            }
        }

        if (emptyLeft){
            return true;
            //sudoku solved
        }

        for (int number = 1; number <=9 ; number++) {
               if (isSafe(board,r,c,number)){
                   board[r][c]=number;
                   if (solve(board)){
                       return true;
                   }else {
                       board[r][c]=0;

                   }
               }
        }
 return  false;
    }
    static boolean isSafe(int[][] board, int row, int col, int num) {
        //check for row;
        for (int i = 0; i < board.length; i++) {
            if (board[row][col] == num) {
                return false;
            }
        }

        //check for col;

        for (int[] r : board) {
            if (r[col] == num) {
                return false;
            }
        }
        //check for box;

        int sqrt = (int) (Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r <rowStart+ sqrt ; r++) {
            for (int c = colStart; c < colStart+ sqrt; c++) {
                 if (board[r][c]==num){
                     return false;
                 }
            }
        }
      return  true;
    }

    private static void display(int[][] board) {
        for(int[] row : board) {
            for(int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
