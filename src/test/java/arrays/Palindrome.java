package arrays;

public class Palindrome {

	public static void main(String[] args) {
		int num=121;
		System.out.println(isPalindrome(num));
		

	}
	
	public static boolean isPalindrome(int num) {
		int originalNum = num;
		boolean isPalindrome = false;
		int reverseNum = 0;
		while(num > 0) {
			reverseNum = (10*reverseNum) +  num%10;
			num=num/10;
		}
		System.out.println("num: " + originalNum);
		System.out.println("temp: " + reverseNum);
		if(reverseNum == originalNum) {
			isPalindrome = true;
		}
		return isPalindrome;
	}

}
