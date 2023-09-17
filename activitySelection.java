import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class activitySelection {
    public static class Activity {
        public int start;
        public int end;
        public int number;

        public Activity(int start, int end, int number) {
            this.start = start;
            this.end = end;
            this.number = number;
        }
    }

    public static void main(String[] args) {
        ArrayList<Activity> activity = new ArrayList<>();
        activity.add(new Activity(1, 2, 0));
        activity.add(new Activity(3, 4, 1));
        activity.add(new Activity(0, 6, 2));
        activity.add(new Activity(5, 7, 3));
        activity.add(new Activity(8, 9, 4));
        activity.add(new Activity(5, 9, 5));
        int time = 0;

        Collections.sort(activity, (a, b) -> a.end - b.end); // sort based on end time
        for (int i = 0; i < activity.size(); i++) {
            if (activity.get(i).start >= time) {
                System.out.println(activity.get(i).number);
                time = activity.get(i).end;
            }
        }
    }
}
