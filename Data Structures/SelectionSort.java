import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int arr[], int n){
        for (int i=0; i<n-1; i++) {
            int minPos = i;
            for (int j=i+1; j<n; j++) {
                if (arr[minPos] > arr[j])
                    minPos = j;
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
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
        selectionSort(array, n);
    }
}
