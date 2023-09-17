import java.util.ArrayList;
import java.util.Collections;

public class fractionalKS {
    public static class KS {
        int weight;
        int value;
        float ratio;

        KS(int weight, int value, float ratio) {
            this.weight = weight;
            this.value = value;
            this.ratio = ratio;
        }
    }

    public static void ks(int value[], int weight[], int ksweight) {
        float ratio[] = new float[value.length];
        ArrayList<KS> items = new ArrayList<>();
        for (int i = 0; i < value.length; i++) {
            ratio[i] = value[i] / weight[i];
            items.add(new KS(weight[i], value[i], ratio[i]));
        }
        // sort based on ratio
        Collections.sort(items, (a, b) -> (int) (b.ratio - a.ratio));
        int profit = 0;
        for (int i = 0; i < items.size(); i++) {
            if (ksweight == 0) {
                break;
            } else if (items.get(i).weight <= ksweight) {
                ksweight -= items.get(i).weight;
                profit += items.get(i).value;
            } else {
                profit += (ksweight * items.get(i).value) / items.get(i).weight;
                ksweight = 0;
                break;
            }
        }
        System.out.println(profit);
    }

    public static void main(String[] args) {
        int value[] = { 100, 60, 120 };
        int weight[] = { 20, 10, 30 };
        int ksweight = 50;
        ks(value, weight, ksweight);
    }
}
