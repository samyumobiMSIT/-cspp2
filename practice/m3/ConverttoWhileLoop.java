/**
 * Class for convertto while lop.
 */
public class ConverttoWhileLoop {
	/**
	 * Constructs the object.
	 */
	private ConverttoWhileLoop() {}
	
	/**
	 * { function_description }.
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		/**
		 * { item_description }.
		 */
		int i = 2;
		while(i <= 10) {
			System.out.println(i);
			if(i == 10) {
				System.out.println("GoodBye!");
			}
			i = i + 2;
		}
	}

}