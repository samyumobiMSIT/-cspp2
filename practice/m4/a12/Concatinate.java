import java.util.Scanner;
/**
 * Class for concatinate.
 */
final class Concatinate {
    /**
     * Constructs the object.
     */
    private Concatinate() {
        //unused.
    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println("Hello" + " " + str + "!");
    }
}
