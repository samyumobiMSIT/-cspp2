import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
/* Fill the main function to print the number of 7's between 1 to n*/
    /**
     * Constructs the object.
     */
    private Solution() { }
    /**
     * { This is main method to find the number of 7's bewtween 1 to N}.
     *
     * @param      args  The arguments are final
     */
    public static void main(final String[] args) {
        /**
         * { var_description }.
         */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0, individualNumber = 0, n2 = 0;
        final int ten = 10, seven = 7;
        for (int i = 0; i < n; i++) {
            n2 = i;
            while (n2 > 0) {
            individualNumber = n2 % ten;
            if (individualNumber == seven) {
                count++;
            }
            n2 = n2 / ten;
            }
        }
        System.out.println(count);
    }
}