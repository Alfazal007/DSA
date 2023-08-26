public class toUpperCase {
    public static String upperConverter(String str) {
        StringBuilder newStr = new StringBuilder("");
        newStr.append(Character.toUpperCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            while (i < str.length() && str.charAt(i) != ' ') {
                newStr.append(str.charAt(i));
                i++;
            }
            if (i >= str.length()) {
                break;
            }
            newStr.append(str.charAt(i));
            i++;
            if (i < str.length()) {
                newStr.append(Character.toUpperCase(str.charAt(i)));
            } else {
                break;
            }
        }
        return newStr.toString();
    }

    public static void main(String[] args) {
        String str = "hi, i am shanks";
        System.out.println(upperConverter(str));
    }
}
