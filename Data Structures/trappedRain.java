public class trappedRain {
    public static int calculate(int height[]) {
        int n = height.length;
        //Calculate left max boundaries - in arrays
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i=1; i<n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //Calculate right max boundaries - in arrays
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i=n-2; i>=1; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        //loop
        for (int i=0; i<n; i++) {
            //waterLevel = min(leftMax - rightMax)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            //trappedWater = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String args[]) {
        int arr[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(calculate(arr));
    }
}
