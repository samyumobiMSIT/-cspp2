import java.util.Scanner;
/**
 * Class for first last six.
 */
final class FirstLastSix {
    /**
     * Constructs the object.
     */
    private FirstLastSix() {
        //unused.
    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        final int six = 6;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        if (a[0] == six || a[a.length - 1] == six) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
