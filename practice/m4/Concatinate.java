//Concatinate.java
import java.util.Scanner;
class Average{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String j=s.next();
		System.out.println(concat(j));
	}
	static String concat(String a){
		return "Hello "+a+"!";
	}
}