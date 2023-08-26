public class largestString {
    public static void largestStr(String s1, String s2, String s3) {
        if (s1.compareTo(s2) > 1 && s1.compareTo(s3) > 1) {
            System.out.println(s1);
            return;
        } else if (s2.compareTo(s1) > 1 && s2.compareTo(s3) > 1) {
            System.out.println(s2);
            return;
        } else {
            System.out.println(s3);
            return;
        }
    }

    public static void main(String[] args) {
        String s1 = "mango", s2 = "pineapple", s3 = "watermelon";
        largestStr(s1, s2, s3);
    }
}
