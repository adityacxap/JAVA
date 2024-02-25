import java.util.*;
class ContainerMostWater {
    /*Time complexity = O(n²)
    public static int storeWaterBF(ArrayList<Integer> height) {
        int max = 0;
        for (int i=0; i<height.size(); i++) {
            for (int j=i+1; j<height.size(); j++) {
                int min = (int)Math.min(height.get(i), height.get(j));
                int width = j - i;
                int fill = width * min;
                if (fill > max)
                    max = fill;
            }
        }
        return max;
    }*/
    //Time complexity = O(n)
    public static int storeWaterPointer(ArrayList<Integer> height) {
        int max = 0, i=0, j=height.size()-1;
        while(j>i) {
            int min = (int)Math.min(height.get(i), height.get(j));
            int fill = min * (j-i); //width
            max = (int)Math.max(max, fill);
            
            if (height.get(i) < height.get(j))
                i++;
            else
                j--;
        }
        return max;
    }
    public static void main(String args[]) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1); height.add(8); height.add(6); height.add(2); height.add(5); height.add(4); height.add(8); height.add(3); height.add(7);
        //System.out.println("Container with maxWater using Brute Force: "+storeWaterBF(height)); 
        System.out.println("Container with maxWater using 2-pointer approach: "+storeWaterPointer(height));
    }
}