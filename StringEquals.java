/**
 * 
 */
package com.bridgelabz;

/**
 * @author ASUS
 *
 */
public class StringEquals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String stmtOne = "This is my Laptop."; //Create new statement
		String stmtTwo = "This is my Laptop.";  // Create new SAME statement
		
		boolean checkEqual = stmtOne.equals(stmtTwo);
		
		System.out.println("The statement is = " + checkEqual);
	}

}
