
public class CountOfDigits {

	public static void main(String[] args) {
			int num = 25789;
			System.out.println("Number of digits in " + num + " ---> " + countDigits(num));
			num = 0;
			System.out.println("Number of digits in " + num + " ---> " + countDigits(num));
			num = -298;
			System.out.println("Number of digits in " + num + " ---> " + countDigits(num));
			
//			System.out.println(Math.floor(10.9));
//			System.out.println(Math.ceil(10.2));
//			System.out.println(Math.round(10.4));
	}
	
	public static int countDigits(int num) {
		int count=0;
		num = Math.abs(num); //To handle negative numbers
		while(num>0) {
			if(num==0) return 1;
			//System.out.println(num%10);
			count++;
			num = num/10;
		}
		return count;
	}

}
