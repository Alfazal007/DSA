import java.util.ArrayList;

public class printMatrix {
    public static void zigzagger(int arr[][]) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int curI = i;
            for (int j = 0; j <= i && curI >= 0; j++, curI--) {
                arrlist.add(arr[curI][j]);
            }
        }
        for (int j = 1; j < arr.length; j++) {
            int i = arr.length - 1;
            int curJ = j;
            while (i >= 1 && curJ < arr.length) {
                arrlist.add(arr[i][curJ]);
                i--;
                curJ++;
            }
        }
        for (int i = 0; i < arrlist.size(); i++) {
            System.out.print(arrlist.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        zigzagger(arr);
    }
}
