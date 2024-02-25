import java.util.Scanner;
class Occurences {
    public static void occurenceIndex(int a[], int st, int k){
        if(st == a.length)
            return;
        if(k == a[st])
            System.out.print(st+" ");            
        occurenceIndex(a, ++st, k);        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size for array: ");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter elements:");
        for (int i=0; i<n; i++) 
        {
            array[i] = sc.nextInt();
        }
        System.out.print("Enter key to find its indices: ");
        int key = sc.nextInt();
        occurenceIndex(array, 0, key);
    }
}