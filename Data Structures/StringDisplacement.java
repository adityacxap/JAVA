import java.util.Scanner;
public class StringDisplacement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Directions");
        String dir = sc.nextLine(), dir2 = "";
        int x=0, y=0;
        for (int i=0; i<dir.length(); i++) {
            dir2 += Character.toUpperCase(dir.charAt(i));
        }
        for (int i=0; i<dir.length(); i++) {
            char ch = dir2.charAt(i);
            if (ch == 'N' || ch == 'S')
                y = ch=='N'? y+1 : y-1;
            else if(ch == 'E' || ch =='W')
                x = ch=='E'? x+1 : x-1;
            else{
                System.out.println("Invalid character used");
                System.exit(1);
            }
        }
        System.out.println("Displacement: "+(float)Math.sqrt((x*x)+(y*y)));
    }
}
