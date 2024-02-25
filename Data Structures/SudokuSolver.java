class SudokuSolver{
    public static boolean isSafe(int s[][], int row, int col, int digit) {
        //  ROW CHECK
        for(int i=0; i<9; i++)
            if(s[i][col] == digit)
                return false;
        //  COLUMN CHECK
        for(int j=0; j<9; j++)
            if(s[row][j] == digit)
                return false;
        //  GRID CHECK
        int sr = (row/3) * 3, sc = (col/3)*3;
        for (int i=sr; i<sr+3; i++)
            for (int j=sc; j<sc+3; j++)
                if(s[i][j] == digit)
                    return false;
                    
        return true;
    }
    public static boolean sudokuSolver(int s[][], int i, int j){
        //  BASE CASE
        if (i == 9)
            return true;
        //  RECURSION
        int nextRow = i, nextCol = j+1;
        if(j+1 == 9) {
            nextRow = i + 1; nextCol = 0;
        }
        if(s[i][j] != 0) {
            return sudokuSolver(s, nextRow, nextCol);
        }
        for (int digit=1; digit<=9; digit++) {
            if(isSafe(s, i, j, digit)) {
                s[i][j] = digit;
                if(sudokuSolver(s, nextRow, nextCol)) {  //solution exists
                    return true;
                }
                s[i][j] = 0;
            }
        }
        return false;
    }
    public static void print(int s[][]) {
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                System.out.print(s[i][j] + " ");
            }
            System.out.println("\n------------------");
        }
    }
    public static void main(String args[]) {
        int sudoku[][] = {  {3, 0, 6, 5, 0, 8, 4, 0, 0},
                            {5, 2, 0, 0, 0, 0, 0, 0, 0},
                            {0, 8, 7, 0, 0, 0, 0, 3, 1},
                            {0, 0, 3, 0, 1, 0, 0, 8, 0},
                            {9, 0, 0, 8, 6, 3, 0, 0, 5},
                            {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
                            {1, 3, 0, 0, 0, 0, 2, 5, 0},
                            {0, 0, 0, 0, 0, 0, 0, 7, 4},
                            {0, 0, 5, 2, 0, 6, 3, 0, 0} };
        if(sudokuSolver(sudoku, 0, 0)){
            System.out.println("Solution exists");
            print(sudoku);
        }
        else
            System.out.println("Solution doesn't exists");
    }
}