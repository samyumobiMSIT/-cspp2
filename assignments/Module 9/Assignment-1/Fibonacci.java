import java.util.Scanner;
/**
 * Class for fibonacci.
 */
final class Fibonacci {
    /**
     * Constructs the object.
     */
    private Fibonacci() {

    }
    /*
     * fib is a static method takes a argument n
     * n is the count of the fibonacci numbers to be generated.
     * The method returns a List with the n fibonacci numbers.
     *
     * Look for the hint.txt if some of the testcases fail.
     */
    /**
     * { function_description }.
     *
     * @param      n     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static List fib(final int n) {
        // todo - complete this method
        List l = new List(n);
        int a = 0;
        int b = 1;
        int c;
        l.add(a);
        l.add(b);
        for (int i = 2; i < n; i++) {
            c = a + b;
            l.add(c);
            a = b;
            b = c;
        }
        return l;
    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fib(n));
    }
}
