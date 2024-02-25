public class StrMergeSort {
    public static void merge(String[] arr, int si, int mid, int ei) {
        String temp[] = new  String[ei-si+1]; int i = si; int j = mid+1; int k = 0;
        while(i <= mid && j<= ei){
            if(arr[i].compareTo(arr[j]) < 0){
                temp[k] = arr[i];
                i++;
            }
            else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid)
            temp[k++] = arr[i++];
        while(j <= ei)
            temp[k++] = arr[j++];
        for(int lo=0, m=si; lo<temp.length; lo++, m++)
            arr[m] = temp[lo];
    }
    public static void mergeSort(String[] arr, int si, int ei) {
        if (si > ei)
            return;
        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid-1);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }
    public static void main(String[] args) {
        String arr[] = {"earth", "mars", "mercury", "jupiter"};
        System.out.println("Original array: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        mergeSort(arr, 0, arr.length-1);
        System.out.println("\n\nSorted array: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
