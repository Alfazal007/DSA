import java.util.Arrays;
import java.util.Comparator;

public class chocolaProblem {
    public static void minimumCuts(Integer horizontalCuts[], Integer verticalCuts[]) {
        int rows = 1;
        int columns = 1;
        int cost = 0;
        Arrays.sort(horizontalCuts, Comparator.reverseOrder());
        Arrays.sort(verticalCuts, Comparator.reverseOrder());
        int i = 0, j = 0;
        while (i < horizontalCuts.length && j < verticalCuts.length) {
            if (horizontalCuts[i] > verticalCuts[j]) {
                // make a horizontal cut
                cost = cost + (columns * horizontalCuts[i]);
                i++;
                rows++;
            } else {
                cost = cost + (rows * verticalCuts[j]);
                j++;
                columns++;
            }
        }
        while (i < horizontalCuts.length) {
            cost = cost + (columns * horizontalCuts[i]);
            i++;
            rows++;
        }
        while (j < verticalCuts.length) {
            cost = cost + (rows * verticalCuts[j]);
            j++;
            columns++;
        }
        System.out.println(cost);
    }

    public static void main(String[] args) {
        Integer horizontalCuts[] = { 4, 1, 2 };
        Integer verticalCuts[] = { 2, 1, 3, 1, 4 };
        minimumCuts(horizontalCuts, verticalCuts);
    }
}
