/*************************************************************************
 *  Compilation:  javac FindDuplicate.java
 *  Execution:    java FindDuplicate
 *
 *  @author: Vraj Patel, vpp36@scarletmail.rutgers.edu, vpp36
 *
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 10 8 5 4 1 3 6 7 9
 *  false
 *
 *  % java FindDuplicate 4 5 2 1 2
 *  true
 *************************************************************************/

public class FindDuplicate {

    public static void main(String[] args) {
		
		int[] array = new int[args.length];
	
		for (int i = 0; i < array.length; i++){
			array[i]= Integer.parseInt(args[i]);
		}
			
		boolean a = false;
		for (int i = 0; i < array.length; i++){
			for (int j = 0; j < array.length; j++)
				if (array[i] == array[j] && i != j){
				a = true;
			}
		}
			System.out.println(a);		
	}			
}
		//WRITE YOUR CODE HERE
	

