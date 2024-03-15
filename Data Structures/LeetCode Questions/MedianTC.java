/*4. Median of Two Sorted Arrays

Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 

Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106*/

class MedianTC {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0.0d;
        int newA[] = new int[nums1.length + nums2.length];
        
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                newA[k++] = nums1[i++];
            } else {
                newA[k++] = nums2[j++];
            }
        }
        while (i < nums1.length) {
            newA[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            newA[k++] = nums2[j++];
        }
        
        if (newA.length % 2 == 0) {
            median = (newA[newA.length / 2 - 1] + newA[newA.length / 2]) / 2.0;
        } else {
            median = newA[newA.length / 2];
        }

        return median;
    }
}
