public class RotSorted {
    public static int search(int[] arr, int x, int si, int ei) {
        // BASE CASE
        if (si > ei)
            return  -1;
        //  RECURSION
        int mid = si + (ei-si)/2;

        //CASE FOUND
        if(x == arr[mid]) return mid;
        // MID ON L1
        else if(arr[si] < arr[mid]) {
            //case a:
            if(arr[si] <= x && x <= arr[mid])
                return search(arr, x, si, mid);
            //case b:
            else 
                return search(arr, x, mid+1, ei);
        }
        // MID ON L2
        else {
            //case c:
            if(arr[mid]<=x && x<arr[ei] )
                return search(arr, x, mid+1, ei);
            //case d:
            else
                return search(arr, x, si, mid);
        }
    } 
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 6, 7, 0, 1, 2};  //Rotatated sorted array
        int target = 7; //Output -> 5                       //Target element to be searched in the rotated sorted array.
        System.out.println("Given target index: "+search(arr, target, 0, arr.length-1));
    }
}
