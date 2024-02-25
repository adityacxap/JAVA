import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int arr[], int n){
        for (int i=1; i<n; i++) {
            int curr = arr[i], prev = i-1;
            while (prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        System.out.print("\nSorted array: ");
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter elements");
        for (int i=0; i<n; i++)
            array[i] = sc.nextInt();
        System.out.print("Original Array: ");
        for (int i=0; i<n; i++)
            System.out.print(array[i]+" ");
        insertionSort(array, n);
    }
}
