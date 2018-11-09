/**
 * 
 */

/**
 * @author User
 *
 */
public class SumOfArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 1, 2, 3, 1, 8,9, 3, 1, 2, 3, 1 };
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println(sum);
	}

}
