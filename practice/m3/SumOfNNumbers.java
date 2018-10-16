//SumOfNNumbers.java
import java.util.Scanner;
class SumOfNNumbers{
	 public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int sum=0;
		int n=s.nextInt();
		for(int i=1;i<=n;i++){
			sum+=i;
			System.out.println(sum);
		}
	}
}

