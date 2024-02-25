public class MajorityElement {
    public static int count(int arr[], int ca, int si, int ei){
        int count = 0;
        for(int i=si; i<=ei; i++) {
            if(arr[i] == ca)
                count++;
        }
        return count;
    }
    public static int majorEle(int arr[], int si, int ei) {
        //BASE CASE
        if(si == ei)
            return arr[si];
        //RECURSION
        int mid = si + (ei-si)/2;
        int left = majorEle(arr, si, mid-1);
        int right = majorEle(arr, mid+1, ei);

        if(left == right)
            return left;
        int lcount = count(arr, left, si, ei);
        int rcount = count(arr, right, si, ei);

        return lcount > rcount ? left : right;
    }
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println("Majority element: "+majorEle(nums, 0, nums.length-1));
    }
}