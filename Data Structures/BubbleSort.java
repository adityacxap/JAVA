import java.util.*;
public class BubbleSort {

    public static void bubbleSort(int arr[], int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<n-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
        bubbleSort(array, n);
    }
    
}
