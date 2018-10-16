//Write a program to calculate the area of Circle with radius r
import java.util.Scanner;
public class area_of_Circle{
	public static double pi(){
		return 3.14;
	}
	public static double area(float r){
		double area=(pi()*r*r);
		return area;
	}
	public static void main(String[] a){
		Scanner s=new Scanner(System.in);
		float rad=s.nextFloat();
		System.out.println(area(rad));
	}
}