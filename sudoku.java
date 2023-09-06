public class sudoku {
    public static void printBoard(int sudoku[][]) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int sudoku[][], int curRow, int curCol, int num) {
        for (int i = 0; i < sudoku[0].length; i++) {
            if (sudoku[curRow][i] == num) {
                return false;
            }
        }
        for (int i = 0; i < sudoku.length; i++) {
            if (sudoku[i][curCol] == num) {
                return false;
            }
        }
        int startRow = (curRow / 3) * 3;
        int startCol = (curCol / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (sudoku[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void solve(int sudoku[][], int curRow, int curCol) {
        if (curRow == 9) {
            printBoard(sudoku);
            return;
        }
        if (sudoku[curRow][curCol] == 0) {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(sudoku, curRow, curCol, i)) {
                    sudoku[curRow][curCol] = i;
                    int nextCol = curCol + 1;
                    int nextRow = curRow;
                    if (nextCol == 9) {
                        nextCol = 0;
                        nextRow = curRow + 1;
                    }
                    solve(sudoku, nextRow, nextCol);
                    sudoku[curRow][curCol] = 0;
                }
            }
        } else {
            int nextCol = curCol + 1;
            int nextRow = curRow;
            if (nextCol == 9) {
                nextCol = 0;
                nextRow = curRow + 1;
            }
            solve(sudoku, nextRow, nextCol);
        }
    }

    public static void main(String[] args) {
        int sudoku[][] = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 }
        };
        solve(sudoku, 0, 0);
    }
}
