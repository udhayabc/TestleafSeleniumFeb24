package week1.day2.assignments;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		
		int[] num = {2,5,7,7,5,9,2,3};
		int totalLen = num.length;
		System.out.println("Total Length:" +totalLen);
		Arrays.sort(num);
		System.out.println("Duplicate Elements are:");
		for(int i=0; i<totalLen-1;i++) {
			if(num[i]==num[i+1]) 
				System.out.println(num[i]);
			
		}

	}

}
