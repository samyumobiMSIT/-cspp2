//m1-a12 Program to swap two int's
import java.util.Scanner;
class swap{
	public static void main(String ar[]){
		int temp,a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a , b");
		a=s.nextInt();
		b=s.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.println(""+ a + " "+ b);
	}
}