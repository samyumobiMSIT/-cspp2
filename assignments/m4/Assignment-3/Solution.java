import java.util.Scanner;
/**
 * Class for solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <= n - 1; i++) {
            String s = sc.nextLine();
            long res = binaryToDecimal(s);
            System.out.println(res);
        }
    }
    /**
     * { function_description }.
     *
     * @param      s     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static long binaryToDecimal(final String s) {
        int maxpow = s.length() - 1;
        double val = 0;
        for (int i = 0; i < s.length(); i++) {
            char k = s.charAt(i);
            int temp = Character.getNumericValue(k);
            val = val + (temp * Math.pow(2, maxpow));
            maxpow--;
        }
        // System.out.println(val);
        long finalval = Math.round(val);
        return finalval;
    }
}
