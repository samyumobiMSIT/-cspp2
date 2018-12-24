//m4-ag2
import java.util.Scanner;
/**.
    * scanner function for taking inputs
*/
public final class Solution {
    /* Fill the main function to print resultant of addition of matrices*/
    /**.
        *constructor
    */
    private Solution() {
        // zero argument constructor
    }
    /**.
        * @param args of type string : command line arguments
    */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        int[][]mat1 = new int[row1][col1];
        for (int c = 0; c < row1; c++) {
            for (int d = 0; d < col1; d++) {
                mat1[c][d] = sc.nextInt();
            }
        }
        //System.out.println(mat1);

        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        int[][]mat2 = new int[row2][col2];
        for (int c = 0; c < row2; c++) {
            for (int d = 0; d < col2; d++) {
                mat2[c][d] = sc.nextInt();
            }
        }
        if (row1 == row2 && col1 == col2) {
            int[][]c = new int[row2][col2];
            String res = "";
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    c[i][j] = mat1[i][j] + mat2[i][j];
                    res += c[i][j] + " ";
                }
                res = res.trim() + "\n";
            }
            System.out.print(res);
        } else {
            System.out.println("not possible");
        }
    }
}