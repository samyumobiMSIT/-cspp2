//Average.java
import java.util.Scanner;
class Average{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		System.out.println(avg(a));
	}
	static float avg(int[] a){
		int s=0;
		for(int i=0;i<a.length;i++){
			s+=a[i];
		}
		return s/a.length;
	}
}
