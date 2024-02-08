package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementArray {

	public static void main(String[] args) {
		
		int[] arr = {2,1,4,3,8,6,7};
		int totalLen = arr.length;
		System.out.println("Total length: " +totalLen);
		
		 Arrays.sort(arr);
		 int sumOfAll = (totalLen*(totalLen+1))/2;
	      int sumOfArray = 0;
	      for(int i=0; i<=totalLen-2; i++) {
	         sumOfArray = sumOfArray+arr[i];
	      }
	      int missingNumber = sumOfAll-sumOfArray;
	      System.out.println("Missing number is: "+missingNumber);
	}

}
