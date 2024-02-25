public class BackSubsets {
    public static void findSubsets(StringBuilder str, int i, StringBuilder ans) {
        if (i == str.length()) {
            if (ans.length() == 0)
                System.out.println("Null");
            else
                System.out.println(ans);
            return;
        }
        findSubsets(str, i+1, new StringBuilder(ans).append(str.charAt(i)));
        findSubsets(str, i + 1, new StringBuilder(ans));
    }
    public static void main(String args[]) {
        StringBuilder str = new StringBuilder("abc");
        System.out.println("Subsets of " + str);
        findSubsets(str, 0, new StringBuilder());
    }
}