public class ShortestPath {
    public static void shortestPath(String s) {
        int x = 0, y = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'N')
                y++;
            else if (s.charAt(i) == 'S')
                y--;
            else if (s.charAt(i) == 'E')
                x++;
            else if (s.charAt(i) == 'W')
                x--;
        }
        double displmt = Math.sqrt(x*x + y*y);
        System.out.println("Shortest path : " + displmt);
    }

    public static void main(String[] args) {
        String s = "WNEENESENNN";
        shortestPath(s);
    }
}
