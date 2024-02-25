public class ArrBack {
    public static void printArr(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void changeArray(int a[], int i, int value) {
        //BASE CASE
        if (i == a.length){
            printArr(a);
            return;
        }
        a[i] = value;
        changeArray(a, i+1, value+1);
        a[i] = a[i] - 2;
    }
    public static void main(String args[]) {
        int arr[] = new int[10];
        changeArray(arr, 0, 1);
        printArr(arr);
    }
}
