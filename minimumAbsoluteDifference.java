import java.util.Arrays;
import java.util.Collections;

public class minimumAbsoluteDifference {
    public static int minPairDifference(int a[], int b[]) {
        Arrays.sort(a);
        Arrays.sort(b);
        int minDifference = 0;
        for (int i = 0; i < a.length; i++) {
            minDifference += Math.abs(a[i] - b[i]);
        }
        return minDifference;
    }

    public static void main(String[] args) {
        int a[] = { 4, 1, 8, 7 };
        int b[] = { 2, 3, 6, 5 };
        System.out.println(minPairDifference(a, b));
    }
}
