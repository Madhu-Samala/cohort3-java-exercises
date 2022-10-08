package com.qa.java.arrays;

public class PrimitivesArray {

	public static void main(String[] args) {

		/*
		 * 1.1 Array Of Primitives
		 */
		int[] nos;
		nos = new int[]{1,6,2,8,3,9,15,0};
		
		System.out.println("Sum of Array Elements : " + ArrayUtil.sumOfArrayElements(nos));
		System.out.println("Smallest Number in Array :" + ArrayUtil.smallestNumberInArray(nos));
		System.out.println("Highest Number in Array :" + ArrayUtil.highestNumberInArray(nos));
		
		
	}

}
