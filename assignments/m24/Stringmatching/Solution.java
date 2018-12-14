import java.util.Scanner;
import java.io.File;
/**
 * Solution Class.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * Main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            String line = scan.nextLine();
            File dir = new File(line);
            File[] files = dir.listFiles();
            double maxVal = 0;
            String file1 = null;
            String file2 = null;
            System.out.print("             ");
            for (int i = 0; i < files.length - 1; i++) {
                System.out.print(files[i].getName() + "    ");
            }
            System.out.print(files[files.length - 1].getName());
            System.out.print(" ");
            System.out.println();
            for (int i = 0; i < files.length; i++) {
                System.out.print(files[i].getName());
                for (int j = 0; j < files.length; j++) {
                    Distance map1 = new Distance(files[i], files[j]);
                    //Distance map2 = new Distance(files[j]);
                    double similar = map1.getSimilarity();
                    if (similar > maxVal && !files[i].getName().equals(
                                files[j].getName())) {
                        maxVal = similar;
                        file1 = files[i].getName();
                        file2 = files[j].getName();
                    }
                    // System.out.print(" ");
                    //System.out.print(similar + "\t\t");
                }
                System.out.print(" ");
                System.out.println();
            }
            System.out.println("Maximum similarity is between " + file1
                               + " and " + file2);
        } catch (Exception e) {
            System.out.println("Empty Directory");
        }
    }
}
