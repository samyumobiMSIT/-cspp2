import java.util.Scanner;
class bigger_equal_smaller{
	public static void main(String[] a){
		Scanner s=new Scanner(System.in);
		int varA=s.nextInt();
		int varB=s.nextInt();
		if(varA > varB){
			System.out.println("Bigger") ;
		}
		if(varA < varB){
			System.out.println("Smaller");
		}
		else{
			System.out.println("Equal");
		}	
	}
}