 /**
 * 
 */
package com.bridgelabz;

/**
 * @author ASUS
 *
 */
public class StaticVariableMethodBlock {
	
	static int x = 30;
	  
	   static void display() {
		   System.out.println("Inside static method");
	   }
	   
	   static {
	    System.out.println("Inside static block");
	   }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();
		System.out.println(x);
	
	}

}
