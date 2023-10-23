class _2_ReverseTheArray {
    // S=i.like.this.program.very.much
    // Output:much.very.program.this.like.i
    // Explanation:
    // After reversing
    // the wholes tring(not individual words), the input string becomes
    // much.very.program.this.like.i

    // time complexity linear
    // space complexity constant
    String reverseWords(String s) {
        // code here
        if (s.length() <= 2) {
            return s;
        } else {
            int j = s.length() - 1;
            StringBuilder reversedResult = new StringBuilder("");

            while (j >= 0) {
                StringBuilder reversedNotResult = new StringBuilder("");
                char ch = s.charAt(j);
                while (ch != '.') {
                    reversedNotResult.append(ch);
                    j--;
                    if (j >= 0) {
                        ch = s.charAt(j);
                    } else {
                        break;
                    }
                }
                reversedNotResult.append('.');
                String str = reversedNotResult.toString();
                for (int i = str.length() - 1; i >= 0; i--) {
                    reversedResult.append(str.charAt(i));
                }
                j--;
            }
            return reversedResult.toString().substring(1);
        }
    }
}