import java.io.File;
import java.io.IOException;
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
     * @param      args         The arguments
     *
     * @throws     IOException  { exception_description }
     */
    public static void main(final String[] args) throws IOException {
        try {
            Scanner scan = new Scanner(System.in);
            File file = new File(scan.nextLine());
            File[] files = file.listFiles();
            System.out.print("\t\t");
            for (int k = 0; k < files.length - 1; k++) {
                System.out.print(files[k].getName() + "\t");
            }
            System.out.print(files[files.length - 1].getName());
            System.out.println();
            for (int i = 0; i < files.length; i++) {
                System.out.print(files[i].getName() + "\t");
                for (int j = 0; j < files.length; j++) {
                    String line = null;
                    String line1 = null;
                    BagOfWords bags = new BagOfWords();
                    Scanner s = new Scanner(files[i]);
                    while (s.hasNext()) {
                        line = s.useDelimiter("\\A").next();
                    }
                    if (line != null) {
                        String[] tokens = line.toLowerCase().split(" ");
                        bags.addDictn1(tokens);
                    }
                    Scanner s1 = new Scanner(files[j]);
                    while (s1.hasNext()) {
                        line1 = s1.useDelimiter("\\A").next();
                    }
                    if (line1 != null) {
                        String[] tokens1 = line1.toLowerCase().split(" ");
                        bags.addDictn2(tokens1);
                    }
                    bags.getDistance();
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("empty directory");

        }
    }
}
