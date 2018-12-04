import java.util.Scanner;
/**
 * Class for input validator.
 */
final class InputValidator {
    /**
     * { var_description }.
     */
    private String input;
    /**
     * Constructs the object.
     *
     * @param      inp  The input
     */
    InputValidator(final String inp) {
        this.input = inp;
    }
    /**
     * { function_description }.
     *
     * @return     { description_of_the_return_value }
     */
    public boolean validateData() {
        final int val = 6;
        if (input.length() >= val) {
            return true;
        }
        return false;
    }
}
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
     * { item_description }.
     * @param args of type string
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());
    }
}
