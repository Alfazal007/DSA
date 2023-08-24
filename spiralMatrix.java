public class spiralMatrix {
    public static void spiralArray(int arr[][]) {
        int startRow = 0, startCol = 0;
        int endRow = arr.length - 1, endCol = arr[0].length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(arr[startRow][i] + " ");
            }
            startRow++;
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }
            endCol--;
            for (int i = endCol; i >= startCol; i--) {
                System.out.print(arr[endRow][i] + " ");
            }
            endRow--;
            for (int i = endRow; i >= startRow; i--) {
                System.out.print(arr[i][startCol] + " ");
            }
            startCol++;
        }
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
        };
        spiralArray(arr);
    }
}