import java.util.Scanner;
/**
 * Class for solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //unused.
    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = reverseString(s);
        System.out.println(reverse);
    }
    /**
     * { function_description }.
     *
     * @param      s     { String }.
     *
     * @return     { reverse of s }.
     */
    public static String reverseString(final String s) {
        String reverse = "";
        int n = s.length();
        for (int i = n - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        return reverse;
    }

}
