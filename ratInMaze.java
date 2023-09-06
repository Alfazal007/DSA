public class ratInMaze {
    public static void printMaze(int maze[][]) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void mazeSolver(int maze[][], int solution[][], int curRow, int curCol) {
        if (curRow == maze.length - 1 && curCol == maze.length - 1) {
            printMaze(solution);
            return;
        }
        // go right
        if ((curCol + 1 < maze.length) && maze[curRow][curCol + 1] != 0 && solution[curRow][curCol + 1] != 1) {
            solution[curRow][curCol + 1] = 1;
            mazeSolver(maze, solution, curRow, curCol + 1);
            solution[curRow][curCol + 1] = 0;
        }
        // go up
        if ((curRow - 1 >= 0) && maze[curRow - 1][curCol] != 0 && solution[curRow - 1][curCol] != 1) {
            solution[curRow - 1][curCol] = 1;
            mazeSolver(maze, solution, curRow - 1, curCol);
            solution[curRow - 1][curCol] = 0;
        }
        // go down
        if ((curRow + 1 < maze.length) && maze[curRow + 1][curCol] != 0 && solution[curRow + 1][curCol] != 1) {
            solution[curRow + 1][curCol] = 1;
            mazeSolver(maze, solution, curRow + 1, curCol);
            solution[curRow + 1][curCol] = 0;
        }
        // go left
        if ((curCol - 1 >= 0) && maze[curRow][curCol - 1] != 0 && solution[curRow][curCol - 1] != 1) {
            solution[curRow][curCol - 1] = 0;
            mazeSolver(maze, solution, curRow, curCol - 1);
            solution[curRow][curCol - 1] = 0;
        }
        return;
    }

    public static void main(String[] args) {
        int maze[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 }
        };
        int solution[][] = new int[4][4];
        solution[0][0] = 1;
        mazeSolver(maze, solution, 0, 0);
    }
}
