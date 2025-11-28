package arrays;

/* Write a function that searches for an element in an array and returns the index
	if element is not present return -1 */

public class SearchInArray {

	public static void main(String[] args) {
		int[] arr = {11, 45, 23, 76, 54, 98, 72};
        System.out.println("index=" + searchinArrReturnIndex(arr, 76));
        System.out.println("index=" + searchinArrReturnIndex(arr, 6));
	}
	
	
	public static int searchinArrReturnIndex(int[] arr, int searchEle) {
		for(int i=0; i<arr.length; i++){
	        if(arr[i] == searchEle){
	            return i;
	        }
	    }
	    
	    return -1;
	}

}
