public class KnightTour {
    public static boolean findWays(int board[][], int row, int col) {
        int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

        board[0][0] = 0;

        if (!util(0, 0, 1, board, xMove, yMove)) {
            System.out.println("No solution");
            return false;
        } else {
            printBoard(board);
        }
        return true;
    }

    public static boolean isSafe(int x, int y, int board[][]) {
        return (x >= 0 && x < 8 && y >= 0 && y < 8 && board[x][y] == -1);
    }

    public static boolean util(int x, int y, int movei, int board[][], int xMove[], int yMove[]) {
        int xNext, yNext;
        if (movei == 8 * 8) {
            return true;
        }

        for (int k = 0; k < 8; k++) {
            xNext = x + xMove[k];
            yNext = y + yMove[k];
            if (isSafe(xNext, yNext, board)) {
                board[xNext][yNext]= movei;
                if(util(xNext, yNext, movei+1, board, xMove, yMove)){
                    return true;
                }else{
                    board[xNext][yNext]= -1;
                }
            }
        }

        return false;
    }

    public static void printBoard(int board[][]) {
        System.out.println("------------------------------------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 8;
        int board[][] = new int[n][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = -1;
            }
        }
        findWays(board, 0, 0);
    }
}

// SO i have to check for which move(s) of the knight is it possible to visit each and evry block on board once. So first i initialized evry block on board as -1 to indicate they are not visited yet. than i created the array of x and y possible moves combinations for evry block that i will be standing upon. After that first i marked my first position as 0. Than for every block i ran a loop for all 8 positions , and in each iteration on the loop i traversed the whole board checking if that block is safe that within the board and is still unvisited(-1). And if on any block the condition become false i backtrack to the loop and goes to next iteration for it's previous block, This way I checked all combinations of all postions of all blocks and if the condition become false i backtrack to the block and try next move (or iteration). I check all this until my move is 64th because on each block i am checking if that block is safe and there are total 64 blocks(8*8) so if i reached 64th block i return true and get my board printed and exit the program.. Am i right..??
