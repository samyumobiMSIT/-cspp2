import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * { Constructor of the class solution }.
     */
    private Solution() { }
    /**
     * { This is main method, it reads input and prints power of it }.
     *
     * @param      args  The arguments are final
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        int exponent = s.nextInt();
        long result = power(base, exponent);
        System.out.println(result);
    }
    /**
     * { Funtion to return the power of the given number }.
     *
     * @param      b     { b is the integer type variable }
     * @param      e     { e is integer type variable passed as exponent }
     *
     * @return     { returns the b power e }
     */
    public static long power(final int b, final int e) {
        if (e == 0) {
            return 1;
        }
        return b * power(b, e - 1);
    }
}