import java.util.Scanner;

public class MergeSort {
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei-si+1];
        int i = si;     //iterator for left part
        int j = mid+1;  //iterator for right part
        int k = 0;      //iteraor for temp arr

        while(i <= mid && j<=ei) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
            //left part
            while(i <= mid) {
                temp[k++] = arr[i++];
            }

            //right part
            while(j <= ei) {
                temp[k++] = arr[j++];
            }

            //copy temp to original array
            for(k=0, i=si; k<temp.length; k++, i++) {
                arr[i] = temp[k];
            }

    }
    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = (si + ei)/2;

        mergeSort(arr, si, mid);       //left part solving
        mergeSort(arr, mid+1, ei);     //right part solving
        merge(arr, si, mid, ei);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter elements");
        for (int i=0; i<n; i++)
            array[i] = sc.nextInt();
        sc.close();
        System.out.print("Original Array: ");
        for (int i=0; i<n; i++)
            System.out.print(array[i]+" ");
        mergeSort(array, 0, array.length-1);
        System.out.print("\nSorted Array: ");
        for (int i=0; i<n; i++)
            System.out.print(array[i]+" ");
    }
}
