class containerWithMostWater {
    public static void mostWater(int heights[]) {
        int lp = 0;
        int rp = heights.length - 1;
        int mostWater = Integer.MIN_VALUE;
        while (lp < rp) {
            mostWater = Math.max(mostWater, ((Math.min(heights[lp], heights[rp])) * (rp - lp)));
            if (heights[lp] < heights[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
        System.out.println(mostWater);
    }

    public static void main(String[] args) {
        int heights[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        mostWater(heights);
    }
}