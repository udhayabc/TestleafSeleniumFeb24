package week1.day2.assignments;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num = 34343, temp=num;
		int reverse = 0,reminder;
		
		for(;num!=0;) {
			reminder = num%10;
			reverse = (reverse*10)+reminder;
			num=num/10;
		}
		System.out.println(reverse);
		if(temp==reverse) {
			System.out.println("The given number is Palindrome");
		}
		else {
			System.out.println("The given number is not palindrome");
		}

	}

}
