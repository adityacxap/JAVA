class RatMaze {
    static int count=0;
    public static boolean isSafe(int maze[][], int row, int column) {
        //    UP
        if(
        //    DOWN
        //    LEFT
        //    RIGHT
        
        return true;
    }
    public static int ratMaze(int maze[][], int i, int j, int rows, int columns) {
        // BASE CASE
        if (i == rows-1 && j == columns-1)
            return 1;
        else if(i==rows-1 || j==columns-1 || maze[i][j] == 0)
            return 0;
            
        // RECURSION USE        
        int count = ratMaze(maze, i+1, j, rows, columns) + ratMaze(maze, i, j+1, rows, columns);
        return count;
    }
    public static void main(String args[]) {
        int maze[][] = { { 1, 0, 0, 0 },{ 1, 1, 0, 1 },{ 0, 1, 0, 0 },{ 1, 1, 1, 1 } };
        int count = ratMaze(maze, 0, 0, maze.length, maze[0].length);
        System.out.println("No. of ways in grid: "+count);
    }
}