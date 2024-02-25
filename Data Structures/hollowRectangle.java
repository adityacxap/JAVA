import java.util.Scanner;

public class hollowRectangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows and columns");
        int rows = sc.nextInt(), columns = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            if (i == 0 || i == columns - 1) {
                for(int j=1; j<columns; j++)
                    System.out.print("*");
            }
            else {
                for (int j = 0; j < columns; j++) {
                    if (j == 0 || j == columns - 1)
                        System.out.print("*");
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
