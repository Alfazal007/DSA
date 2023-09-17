import java.util.Arrays;
import java.util.Comparator;

public class indianCoins {
    public static void coiner(Integer[] coins, int amount) {
        int num = 0;
        Arrays.sort(coins, Comparator.reverseOrder());
        for (int i = 0; i < coins.length; i++) {
            if (amount == 0) {
                break;
            }
            while (coins[i] <= amount) {
                amount = amount - coins[i];
                num++;
            }
        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        int amount = 590;
        coiner(coins, amount);
    }
}
