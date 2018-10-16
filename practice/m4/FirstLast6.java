//FirstLast6
import java.util.Scanner;
class FirstLast6{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=s.nextInt();
		}
		System.out.println(FirstLast6(a));
	}
	static boolean FirstLast6(int[] a){
		if(a[0] == 6 || a[a.length-1] == 6){
			return true;
		}
		return false;
	}
}