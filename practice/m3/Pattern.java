//Pattern.java
// Write a java program to print the following pattern.
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
class Pattern{
	public static void main(String[] args) {
		for(int i=1;i<5;i++){
			System.out.println(i);
			for(int j=i;j<=i;j++){
				System.out.print(j + " ");
			}
		}
	}
}