public class stringCompession {
    public static void compresser(String str) {
        StringBuilder newStr = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 1;
            i++;
            while (i < str.length() && str.charAt(i) == ch) {
                count++;
                i++;
            }
            i--;
            newStr.append(ch);
            if (count > 1) {
                newStr.append(count);
            }
        }
        System.out.println(newStr);
    }

    public static void main(String[] args) {
        String str = "aaabbcccdeeeff";
        compresser(str);
    }
}
