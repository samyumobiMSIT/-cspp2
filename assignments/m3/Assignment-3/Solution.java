import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() { }
    /**
     * { This is main method reads the input for finding the gcd of
     *  given numbers}.
     *
     * @param      args  The arguments are final here
     */
    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int gcdo;
        gcdo = gcd(n1, n2);
        System.out.println(gcdo);
    }
    /*
    Need to write the gcd function and print the output.
    */
    /**
     * { This is the method for finding the Gcd of the given numbers }.
     *
     * @param      a     { a is the integer varibale}
     * @param      b     { b is integer variable }
     *
     * @return     { retuns the Gcd of the given numbers as integer }
     */
    public static int gcd(final int a, final int b) {
        int[] c;
        int j = 0;
        c = new int[Math.max(a, b)];
        for (int i = 1; i < Math.max(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                c[j] = i;
                // System.out.println(j);
                j++;
            }
        }
        // System.out.println(j);
        if (j == 0) {
            return 1;
        }
        return c[j - 1];
    }
}