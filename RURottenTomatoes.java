/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author: Vraj Patel, vpp36@scarletmail.rutgers.edu, vpp36
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {
 
	public static void main(String[] args) {
		int count = 2;
		int sum1 = 0;
		int sum2 = 0;
		int index = 0;
		int[][] arr = new int[Integer.parseInt(args[0])][Integer.parseInt(args[1])];
		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j<arr[i].length; j++){
				arr[i][j] = Integer.parseInt(args[count]);
				count++;
			}
		}
		for (int i = 0; i < arr[0].length; i++){
			sum1 = 0;
		for (int j = 0; j < arr.length; j++){
			sum1 += arr[j][i];
		}
		if (sum1 > sum2){
			index = i;
			sum2 = sum1;
		}
		}
		System.out.println("" + index);
	}
	//WRITE YOUR CODE HERE
}		
