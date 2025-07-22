public class GridWays {
    static int cnt=0;
    public static int findWays(int grid[][], int x, int y) {
        if(x == grid.length-1 && y == grid[0].length-1){
            cnt++;
            return 1;
        }else if(x == grid.length || y == grid[0].length){
            return 0;
        }
        int w1 = findWays(grid, x+1, y);
        int w2 = findWays(grid, x, y+1);
        return w1+w2;
    }

    public static void main(String[] args) {
        int grid[][] = new int[5][4];
        // findWays(grid, 0, 0);
        System.err.println(findWays(grid, 0, 0));
        System.out.println(cnt);
    }
}

// By mathematical formulla :- (n-1+m-1)!/((n-1)!(m-1)!);
