//m1-a13 Program to find Quotient And Remainder
import java.util.Scanner;
class quotient_remainder{
	public static void main(String ar[]){
		int q,r,a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter dividend : a, divisor : b");
		a=s.nextInt();
		b=s.nextInt();
		q=a/b;
		r=a%b;
		System.out.println(q+ " "+ r);
	}
}