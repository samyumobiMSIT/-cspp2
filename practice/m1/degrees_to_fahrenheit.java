//m1-a14 Program to find Quotient And Remainder
import java.util.Scanner;
class degrees_to_fahrenheit{
	public static void main(String ar[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter degrees");
		float d=s.nextFloat();
		float f= d * (9f / 5) + 32;
		System.out.println("d: "+ d+ " f: "+ f);
	}
}