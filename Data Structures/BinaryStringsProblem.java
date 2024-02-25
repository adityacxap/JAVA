import java.util.Scanner;
class BinaryStringsProblem {
    static void binaryStrings(int n, int lastPlace, String str)  {
        if(n==0) {
            System.out.println(str);
            return;
        }
        binaryStrings(n-1, 0, str+"0");
        if(lastPlace == 0)
            binaryStrings(n-1, 1, str+"1");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of places: ");
        int n = sc.nextInt();
        binaryStrings(n, 0, "");
    }
}