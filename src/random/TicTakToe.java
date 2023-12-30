package random;

import java.util.Scanner;

public class TicTakToe {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }

 ticTacToe(board);
    }

    static void ticTacToe(char[][] board){
        char player='X';
        boolean gameOver=false;

        while (!gameOver){
        printBoard(board);
            System.out.println("Player "+player+" enter");
            int row= sc.nextInt();
            int col= sc.nextInt();
            System.out.println();

            if (board[row][col]==' '){
                board[row][col]=player;
                gameOver=hasWon(board,player);
                if (gameOver){
                    System.out.println(player +" has won the Game");
                }else {
                    player=(player=='X')?'0':'X';
                }
            } else {
                System.out.println("Invalid move. Try again!");
            }
        }
        printBoard(board);
    }

    private static boolean hasWon(char[][] board, char player) {
        // check the rows
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }
        // check for col
        for (int col = 0; col < board[0].length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }
        //for diagonal
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;

    }

    private static void printBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                System.out.print(board[row][col]+" | ");
            }
            System.out.println();
        }
    }
}
