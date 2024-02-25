public class quicksort {
    public static int partition(int arr[], int low, int high){
        /*int pivot = arr[high];
        int i = low-1;

        for(int j=low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                //SWAP
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i; //pivot index*/
        
        int x = arr[low];
        int down = low;
        int up = high;
        while(down < up){
            while(arr[down] <= x && down < high)
                down = down + 1;
            while(arr[up] > x)
                up = up - 1;
            if(down < up){
                int temp = arr[down];
                arr[down] = arr[up];
                arr[up] = temp;
            }
        }
        arr[low] = arr[up];
        arr[up] = x;
        
        return up;
    }
    public static void quickSort(int arr[], int low, int high){
            if(low < high){
                int pivot = partition(arr, low, high);

                quickSort(arr, low, pivot-1);
                quickSort(arr, pivot+1, high);
            }
    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};        
        int n = arr.length;
        System.out.println("Unsorted");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        quickSort(arr, 0, n-1);

        System.out.println("\nSorted:");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
