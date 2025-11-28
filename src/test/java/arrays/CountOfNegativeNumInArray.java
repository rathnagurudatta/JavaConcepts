package arrays;
/*
 * Write a function that returns number of negative numbers in an array
 */
public class CountOfNegativeNumInArray {

	public static void main(String[] args) {
		int[] arr = {11, 45, -23, 76, -54, 98, 72};
		System.out.println(countOfNegativeNumInArray(arr));

	}
	
	public static int countOfNegativeNumInArray(int[] arr) {
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<0) {
				count ++;
			}
		}
		return count;
	}

}
