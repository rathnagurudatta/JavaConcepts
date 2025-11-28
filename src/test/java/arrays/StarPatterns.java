package arrays;

public class StarPatterns {

	public static void main(String[] args) {
		pattern1(4);
		System.out.println("");
		
		pattern2(4);
		System.out.println("");
		
		pattern3(5);
		System.out.println("");
		
		pattern4(5);
		System.out.println("");
		
		pattern5(7);
		System.out.println("");
		
		pattern6(7);
		System.out.println("");
		
		pattern7_1(9);
		System.out.println("");
		
		pattern7_2(9);
		System.out.println("");

	}
	
	/*
	 *  * * * *
	 *  * * * *
	 *  * * * *
	 *  * * * *
	 *  
	 */
	public static void pattern1(int n) {
		/*
		 * i will decide number of rows
		 * j will decide number of columns
		 */
		for(int i=0; i<n; i++) {
			String row = "";
			for(int j=0; j<n; j++) {
				row = row + " *";
			}
			System.out.println(row.trim());
		}
	}
	
	/*
	 *  * 
	 *  * * 
	 *  * * * 
	 *  * * * *
	 *  
	 */
	public static void pattern2(int n) {
		/*
		 * i will decide number of rows
		 * j will decide number of columns
		 */
		for(int i=0; i<n; i++) {
			String row = "";
			for(int j=0; j<=i; j++) {
				row = row + " *";
			}
			System.out.println(row.trim());
		}
	}
	
	/*
	 * 1
	 * 12
	 * 123
	 * 1234
	 * 12345
	 * 
	 */
	public static void pattern3(int n) {
		for(int i=1; i<=n; i++) {
			String row="";
			for(int j=1; j<=i; j++) {
				row = row + j;
			}
			System.out.println(row);
		}
	}
	
	/*
	 * 1
	 * 22
	 * 333
	 * 4444
	 * 55555
	 */
	public static void pattern4(int n) {
		for(int i=1; i<=n; i++) {
			String row="";
			for(int j=1; j<=i; j++) {
				row = row + i;
			}
			System.out.println(row);
		}
	}
	
	/*
	 * 12345
	 * 1234
	 * 123
	 * 12
	 * 1
	 */
	public static void pattern5(int n) {
		for(int i=1; i<=n; i++) {
			String row="";
			for(int j=1; j<=(n+1)-i; j++) {
				row = row + j;
			}
			System.out.println(row);
		}
	}
	
	/*
	 *  *****
	 *  ****
	 *  ***
	 *  **
	 *  *
	 */
	
	public static void pattern6(int n) {
		for(int i=1; i<=n; i++) {
			String row="";
			for(int j=1; j<=(n+1)-i; j++) {
				row = row + "*";
			}
			System.out.println(row);
		}
	}
	
	/*
	 *     *
	 *    **
	 *   ***     
	 *  ****
	 * ***** 
	 * 
	 */
	
	public static void pattern7_1(int n) {
		for(int i=1; i<=n; i++) {
			String row="";
			for(int j=1; j<=n; j++) {
				if(j<=n-i) {
					row = row + " ";
				}else {
					row = row + "*";
				}
			}
			System.out.println(row);
		}
	}
	
	public static void pattern7_2(int n) {
		for(int i=1; i<=n; i++) {
			String row="";
			
			//adding empty spaces
			for(int j=1; j<=n-i; j++) {
				row = row + " ";
			}
			
			//adding *
			for(int k=1; k<=i; k++) {
				row = row + "*";
			}
			
			System.out.println(row);
		}
	}
	
	
	

}
