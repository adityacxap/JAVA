import java.util.*;
class Tiling {
    
    public static int tiling(int n) {//2*n (floor size)
        if(n==0 || n==1)
            return 1;
        //kaam
        //vertical choice
        int vertical = tiling(n-1);
        //horizontal choice
        int horizontal = tiling(n-2);
        int totalWays = vertical + horizontal;
        return totalWays;
    }
    
    public static void main(String[] args) {
        System.out.println(tiling(0));
    }
}