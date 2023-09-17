import java.util.ArrayList;
import java.util.Collections;

public class maxLengthChain {
    public static class Pair {
        int start;
        int end;

        Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void chainer(ArrayList<Pair> pairs) {
        int time = 0;
        int len = 0;
        Collections.sort(pairs, (a, b) -> a.end - b.end);
        for(int i = 0; i < pairs.size(); i++) {
            if(time <= pairs.get(i).start) {
                len++;
                time = pairs.get(i).end;
            }
        }
        System.out.println(len);
    }

    public static void main(String[] args) {
        ArrayList<Pair> pairs = new ArrayList<>();
        pairs.add(new Pair(5, 24));
        pairs.add(new Pair(39, 60));
        pairs.add(new Pair(5, 28));
        pairs.add(new Pair(27, 40));
        pairs.add(new Pair(50, 90));
        chainer(pairs);
    }
}
