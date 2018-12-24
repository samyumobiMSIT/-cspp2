//m4-ag1
import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution
{
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * main method.
     * @param      args  The arguments
     */
    public static void main(final String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            if (max<arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}