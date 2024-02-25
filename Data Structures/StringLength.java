import java.util.Scanner;
class StringLength {
    public static void strLen(StringBuilder str, int i){
        if(i == str.length()){
            System.out.println(i);
            return;
        }
        else {
            char ch = str.charAt(i);
            strLen(str, ++i);
        }
    }
    public static void main(String[] args) {
    // Create a Scanner object
           Scanner sc = new Scanner(System.in);
           // Prompt the user to enter a string
           System.out.print("Please enter a string: ");   
           // Read the user's input as a string
           String input = sc.nextLine();
           StringBuilder str = new StringBuilder(input);
           strLen(str, 0);

    }
}
   