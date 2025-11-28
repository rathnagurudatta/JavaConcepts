package arrays;
/* 
 * Write a function that returns largest number in an array
 * Write a function that returns smallest number in an array
 * Write a function that returns second largest number in an array
 * 
 * corner case - 
 *   if array is empty, 
 *   if array has only one element, 
 *   if array has negative numbers
 *   if array has duplicate numbers
 */

public class LargestNumberInAnArray {

	public static void main(String[] args) {
		int[] arr = {-11, -45, -23, -76, -54, -98, -72};
		int[] arr1 = {11, 45, 23, 76, 54, 98, 72};
		int[] arr2 = {};
		int[] arr3 = {1};
		int[] arr4 = {6, 9};
		int[] arr5 = {10, 20, 20, 8};
		
//		System.out.println("max number in arr " + largestNumInArray(arr));
//		System.out.println("max number in arr1 " + largestNumInArray(arr1));
//		
//		System.out.println("min number in arr " + smallestNumInArray(arr));
//		System.out.println("min number in arr1 " + smallestNumInArray(arr1));
		
		System.out.println("second largest number in arr " + secondLargestNum(arr));
		System.out.println("second largest number in arr1 " + secondLargestNum(arr1));
		System.out.println("second largest number in arr2 " + secondLargestNum(arr2));
		System.out.println("second largest number in arr3 " + secondLargestNum(arr3));
		System.out.println("second largest number in arr4 " + secondLargestNum(arr4));
		System.out.println("second largest number in arr5 " + secondLargestNum(arr5));

	}
	
	public static int largestNumInArray(int[] arr) {
		//int largestNum = Integer.MIN_VALUE;
		if(arr.length == 0) return -1;
		if(arr.length == 1) return arr[0];
		
		int largestNum = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > largestNum) {
				largestNum=arr[i];
			}
		}
		return largestNum;
		
	}
	
	public static int smallestNumInArray(int[] arr) {
		if(arr.length == 0) return -1;
		if(arr.length == 1) return arr[0];
		
		//int largestNum = Integer.MAX_VALUE;
		int smallestNum = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < smallestNum) {
				smallestNum=arr[i];
			}
		}
		return smallestNum;
		
	}
	
	public static int secondLargestNum(int[] arr) {
		if(arr.length == 0) return -1;
		if(arr.length == 1) return arr[0];
		
		int firstLargest  = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]>firstLargest) {
				secondLargest = firstLargest;
				firstLargest  = arr[i];
				
			}else if(arr[i]>secondLargest && arr[i] != firstLargest) {
				secondLargest=arr[i];
			}
		}
		
		return secondLargest;
	}

}
