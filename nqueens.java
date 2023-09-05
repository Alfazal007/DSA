import java.util.Scanner;

public class nqueens {
    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public static boolean isSafe(char board[][], int curRow, int curCol) {
        for (int i = 0; i < curCol; i++) {
            if (board[curRow][i] == 'X') {
                return false;
            }
        }
        for (int i = 0; i < curRow; i++) {
            if (board[i][curCol] == 'X') {
                return false;
            }
        }
        int prevRow = curRow - 1;
        int prevCol = curCol - 1;
        while (prevRow >= 0 && prevCol >= 0) {
            if (board[prevRow][prevCol] == 'X') {
                return false;
            }
            prevRow--;
            prevCol--;
        }
        int nextRow = curRow - 1;
        int nextCol = curCol + 1;
        while (nextRow >= 0 && nextCol < board[0].length) {
            if (board[nextRow][nextCol] == 'X') {
                return false;
            }
            nextRow--;
            nextCol++;
        }
        return true;
    }

    public static void nqueenplacer(char board[][], int curRow) {
        // base case
        if (curRow == board.length) {
            printBoard(board);
            return;
        }
        for (int i = 0; i < board[0].length; i++) {
            if (isSafe(board, curRow, i)) {
                board[curRow][i] = 'X';
                nqueenplacer(board, curRow + 1);
                board[curRow][i] = ' ';
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of rows :");
        int n = new Scanner(System.in).nextInt();
        char board[][] = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
        nqueenplacer(board, 0);
    }
}
