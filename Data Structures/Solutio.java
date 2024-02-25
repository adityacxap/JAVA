import java.util.*;
class Solutio {
    public static int[] twoSum(ArrayList<Integer> nums, int target) {
        int result[] = new int[2];
        for (int i=0; i<nums.size(); i++) {
            for(int j=i+1; j<nums.size(); j++) {
                if (nums.get(i) + nums.get(j) == target) {
                    result[0] = i; result[1] = j;
                    return result;
                }
            }
        }
        result[0] = -1; result[1] = -1;
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1); arr.add(8); arr.add(6); arr.add(2); arr.add(5); arr.add(4); arr.add(8); arr.add(3); arr.add(7);
        int newArr[] = twoSum(arr, 16);
        for (int i=0; i<2; i++)
            System.out.print(newArr[i]+" ");
    }
}