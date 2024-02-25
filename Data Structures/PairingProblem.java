import java.util.Scanner;
class PairingProblem {
    /*static int pair(int n) {
        if(n==1 || n==2) {
            return n;
        }
        int fnm1 = pair(n-1), fnm2 = pair(n-2);     //single and pair count
        int pairWays = (n-1) * fnm2;                //ways in pair
        return fnm1 + pairWays;                     //net totalWays
    }*/
    public static int pair(int n){
        if(n==1 || n==2) {
            return n;
        }
        return pair(n-1) + (n-1)*pair(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of people: ");
        int n = sc.nextInt();
        System.out.println("Total no. of ways: "+pair(n));
    }
}