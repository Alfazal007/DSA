public class maxAreaHistogram {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void areaFinder(int heights[]) {
        // find next smaller
        int nextSmaller[] = new int[heights.length];
        nextSmaller[heights.length - 1] = heights.length;
        for (int i = heights.length - 2; i >= 0; i--) {
            int curIndex = i + 1;
            while (curIndex < heights.length) {
                if (heights[i] > heights[curIndex]) {
                    break;
                }
                curIndex++;
            }
            if (curIndex == heights.length) {
                nextSmaller[i] = heights.length;
            } else {
                nextSmaller[i] = curIndex;
            }
        }

        int prevSmaller[] = new int[heights.length];
        prevSmaller[0] = -1;
        for (int i = 1; i < heights.length; i++) {
            int curIndex = i - 1;
            while (curIndex >= 0) {
                if (heights[curIndex] < heights[i]) {
                    break;
                }
                curIndex--;
            }
            if (curIndex < 0) {
                prevSmaller[i] = -1;
            } else {
                prevSmaller[i] = curIndex;
            }
        }

        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            maxArea = Math.max(maxArea, (nextSmaller[i] - prevSmaller[i] - 1) * heights[i]);
        }
        System.out.println(maxArea);
    }

    public static void main(String[] args) {
        int heights[] = { 2, 1, 5, 6, 2, 3 };
        areaFinder(heights);
    }
}
