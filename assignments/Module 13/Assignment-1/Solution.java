import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for set.
 * @author : Pranav Surampudi
 * Date: 08 Aug 2018
 */
class Set {
    /**
     * size of the ADT set.
     */
    private int size;
    /**
     * array to act as a Set ADT.
     */
    private int[] set;
    /**
     * Constructs the object.
     */
    Set() {
        size = 0;
        final int ten = 10;
        set = new int[ten];
    }
    /**
     * { function_description }.
     *
     * @return     { returns the size of the array}
     */
    public int size() {
        return size;
    }
    /**
     * {increase the size of the Set ADT}.
     */
    public void resize() {
        set = Arrays.copyOf(set, 2 * size);
    }
    /**
     * {Adds an element to the set}.
     *
     * @param      item  The item
     */
    public void add(final int item) {
        if (size == set.length) {
            resize();
        }
        if (!(contains(item))) {
            set[size] = item;
            size++;
        }
    }
    /**
     * {Adds an array of values to the set}.
     *
     * @param      items  The items
     */
    public void add(final int[] items) {
        for (int i = 0; i < items.length; i++) {
            add(items[i]);
        }
    }
    /**
     * {Checks whether a given element is present in the set or not}.
     *
     * @param      item  The item
     *
     * @return     { description_of_the_return_value }
     */
    public boolean contains(final int item) {
        // Replace the code below
        for (int i = 0; i < size; i++) {
            if (item == set[i]) {
                return true;
            }
        }
        return false;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
     public String toString() {
        // Replace the code below
        if (size == 0) {
            return "{}";
        }
        String str = "{";
        int i = 0;
        for (i = 0; i < size - 1; i++) {
            str = str + set[i] + ", ";
        }
        str = str + set[i] + "}";
        return str;
    }
        /**
         * { function_description }.
         *
         * @param      items  The items
         *
         * @return     { returns a set }
         */
    public Set retainAll(final int[] items) {
        Set s1 = new Set();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < items.length; j++) {
                if (set[i] == items[j]) {
                    s1.add(set[i]);
                }
            }
        }
        return s1;
    }
        /**
         * {Intersection}.
         *
         * @param      items  The items
         *
         * @return     {Returns a set containing common elements from 2 sets}.
         */
    public Set intersection(final Set items) {
        Set s2 = new Set();
        for (int i = 0; i < size; i++) {
            if (items.contains(set[i])) {
                s2.add(set[i]);
            }
        }
        return s2;
        }
        /**
         * {cartesian Product}.
         *
         * @param      item  The item of type set
         *
         * @return     {array of the ordered paris of the product}
         */
    public int[][] cartesianProduct(final Set item) {
        if (size == 0 || item.size() == 0) {
            return null;
        }
        int[][] c = new int[size * item.size()][2];
        int k = 0;
        for (int i = 0; i < size(); i++) {
            for (int j = 0; j < item.size(); j++) {
                c[k][0] = set[i];
                c[k][1] = item.set[j];
                k++;
            }
        }
        return c;
    }
}
/**
 * Solution class for code-eval.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
    }
    /**
     * helper function to convert string input to int array.
     *
     * @param      s     { string input from test case file }
     *
     * @return     { int array from the given string }
     */
    public static int[] intArray(final String s) {
        String input = s;
        if (input.equals("[]")) {
            return new int[0];
        }
        if (s.contains("[")) {
            input = s.substring(1, s.length() - 1);
        }
        return Arrays.stream(input.split(","))
                            .mapToInt(Integer::parseInt)
                            .toArray();
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // instantiate this set
        Set s = new Set();
        // code to read the test cases input file
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "size":
                System.out.println(s.size());
                break;
                case "contains":
                System.out.println(s.contains(Integer.parseInt(tokens[1])));
                break;
                case "print":
                System.out.println(s);
                break;
                case "add":
                int[] intArray = intArray(tokens[1]);
                if (intArray.length == 1) {
                    s.add(intArray[0]);
                } else {
                    s.add(intArray);
                }
                break;
                case "intersection":
                s = new Set();
                Set t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(s.intersection(t));
                break;
                case "retainAll":
                s = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                System.out.println(s.retainAll(intArray));
                break;
                case "cartesianProduct":
                s = new Set();
                t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
                break;
                default:
                break;
            }
        }
    }
}

