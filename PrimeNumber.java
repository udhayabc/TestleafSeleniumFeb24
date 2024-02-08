package week1.day2.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=2; 
		int m = n/2;
		boolean flag = false;
		if(n==0||n==1) {
			System.out.println("Not a Prime number");
		}
		
			for(int i=2; i<=m; i++) {
				if(n%i==0) {
					System.out.println("Not a prime number");
					flag = true;
					break;
				}

			}
		

		if (flag==false) {
			System.out.println("Prime number");
		}
	}

}
