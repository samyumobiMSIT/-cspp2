import java.util.Scanner;
/**
 * Class for average.
 */
final class Average {
    /**
     * Constructs the object.
     */
    private Average() {
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
        int[] a = new int[n];
        double avg = 0;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            sum += a[i];
        }
        avg = sum / (double) n;
        System.out.println(avg);
    }
}
