import java.util.Scanner;

public class Solution {
	/*
	Do not modify this main function.
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		rootsOfQuadraticEquation(a, b, c);
	}
	/*
	Need to write the rootsOfQuadraticEquation function and print the output.
	*/
	 public static void rootsOfQuadraticEquation(final int a,final int b,final int c){
		final int i = 4, j = 2;
        double r1 = (-b - Math.sqrt((b * b) - (i * a * c))) / (j * a);
        double r2 = (-b + Math.sqrt((b * b) - (i * a * c))) / (j * a);
        System.out.println(r2 + " " + r1);
	}
}
