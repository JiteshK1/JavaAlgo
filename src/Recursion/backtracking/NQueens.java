package Recursion.backtracking;

public class NQueens {
    public static void main(String[] args) {

        int n=4;
        boolean[][] board=new boolean[n][n];
        System.out.println(  queens(board,0));
    }

    static int queens(boolean[][] board,int row){
        if (row== board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        for (int c = 0; c < board.length; c++) {
            if (isSafe(board,row,c)){
                board[row][c]=true;
                count+= queens(board,row+1);
                board[row][c]=false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int c) {

        //for vertical
        for (int i = 0; i <=row ; i++) {
            if (board[i][c]){
                return false;
            }
        }
        //for left
        int maxLeft= Math.min(row,c);
        for (int i = 1; i <=maxLeft ; i++) {
            if (board[row-i][c-i]){
                return false;
            }
        }

        //for right
        int maxRight= Math.min(row,board.length-c-1);
        for (int i = 1; i <=maxRight ; i++) {
            if (board[row-i][c+i]){
                return false;
            }
        }

        return true;
    }

    private static void display(boolean[][] board) {
        for(boolean[] row: board){
            for(boolean element: row){
                if (element){
                    System.out.print("Q ");
                }
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}
