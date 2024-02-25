import java.util.*;
class GridWays {
    public static int gridWays(int i, int j, int m, int n){
        // BASE CASE
        if(i==m-1 && j==n-1){
            return 1;
        }
        else if(i==m || j==m)
            return 0;
        int count = gridWays(i+1, j, m, n) + gridWays(i, j+1, m, n);
        return count;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------Grid Ways calculate---------------\nEnter rows and columns");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int count = gridWays(0, 0, rows, columns);
        System.out.println("No. of ways in grid: "+count);
    }
}