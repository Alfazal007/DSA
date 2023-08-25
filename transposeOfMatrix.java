public class transposeOfMatrix {
    public static void transposeFinder(int arr[][]) {
        int newArr[][] = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                newArr[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[0].length; j++) {
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };
        transposeFinder(arr);
    }
}
