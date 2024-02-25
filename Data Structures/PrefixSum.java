public class PrefixSum {

    public static void prefixSum(int arr[]) {
        int currentSum = 0, len = arr.length;
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[len];
        prefix[0] = arr[0];
        for (int i=1; i<prefix.length; i++)
            prefix[i] = prefix[i-1] + arr[i];

        for (int i=0; i<len; i++) {
            int start = i;
            for (int j=i; j<len; j++) {
                int end = j;
                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[end-1];

                if (maxSum == currentSum)
                    maxSum = currentSum;
            }
        }
        System.out.println("Max sum: "+currentSum);
    }
    public static void main(String args[]) {
        int array[] = {1, -2, 6, -1, 3};
        prefixSum(array);
    }
}
