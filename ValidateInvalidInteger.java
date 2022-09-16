/**
 * 
 */
package com.bridgelabz;

/**
 * @author ASUS
 *
 */
public class ValidateInvalidInteger {
	static int sum;
	
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		
		System.out.println("Sum for Integers");
		
		for(int i=0;i<args.length;i++){
		
		System.out.println(args[i]);
	
		sum = sum + Integer.parseInt(args[i]);
		}

		System.out.println("Sum :" + sum);
	}
}