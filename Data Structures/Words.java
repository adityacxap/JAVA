import java.util.Scanner;
public class Words {
    static void wordss(int n, String str[]){
        if(n/10 == 0){
            System.out.print(str[n]+" ");
            return;
        }
        else{
            int k=n%10;
            wordss(n/10, str);
            System.out.print(str[k]+" ");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int n = sc.nextInt();
        String str[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        wordss(n, str);
    }
}