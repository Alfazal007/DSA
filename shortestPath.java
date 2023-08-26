public class shortestPath {
    public static void shortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char ch = path.charAt(i);
            if (ch == 'W') {
                x--;
            } else if (ch == 'E') {
                x++;
            } else if (ch == 'N') {
                y++;
            } else if (ch == 'S') {
                y--;
            }
        }
        double shortest = Math.sqrt(((y - 0) * (y - 0)) + ((x - 0) * (x - 0)));
        System.out.println(shortest);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        shortestPath(path);
    }
}
