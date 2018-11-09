package simplePrograms;

public class TestANotherClass {

	public void PrintHello() {
		System.out.println("Hello World");
	}

	public void LarCheck() {
		int[] arrayOfNumbers = { 1, 290, 3, 4, 1, 23, 290, 3, 11 };
		int largestNumber = arrayOfNumbers[0];

		for (int i = 1; i < arrayOfNumbers.length; i++) {

			if (largestNumber < arrayOfNumbers[i]) {
				largestNumber = arrayOfNumbers[i];
			}
		}
		System.out.println("Largest number in array is:" + largestNumber);
	}

	public boolean arrayExistInCheck(int[] numberArray, int check) {
		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] == check) {
				return true;
			}
		}
		return false;
	}
	
	public int[] arrayReverse(int[] numberArray) {
		int[] revarray = new int[numberArray.length];
		int j = 0;
		for(int i=numberArray.length-1; i>=0; i--) {
				revarray[j]= numberArray[i];
				j++;
		}return revarray;
	}
	public int[] arrayrReverseWithoutarray (int[] numberArray) {
		int j= numberArray.length-1;
		int temp= 0;
		for( int i=0; i<= i/2; i++,j--) {
			temp= numberArray[i];
			numberArray[i]= numberArray[j];
			numberArray[j]= temp;
			}
		return numberArray;
	}
}
