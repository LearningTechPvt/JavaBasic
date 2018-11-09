/**
 * 
 */
package simplePrograms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author User
 *
 */
public class LargestNumfromArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestANotherClass obj = new TestANotherClass();
		 obj.LarCheck();
		 obj.PrintHello();
		int[] arr = { 1, 6, 4, 3, 7, 49, 9 };
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the value from array which you want to search-");
		int a = in.nextInt();
		boolean result = obj.arrayExistInCheck(arr, a);
		if (result == true) {
			System.out.println("Array found");
		} else {
			System.out.println("Not found");
		}
		int[] reversearray = obj.arrayrReverseWithoutarray(arr);
		System.out.println("Array reverse " + Arrays.toString(reversearray));
	}
}
