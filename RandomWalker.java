/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author: Vraj Patel, vpp36@scarletmail.rutgers.edu, vpp36
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int xPosition = 0;
        int yPosition = 0;
        double r = 0;
        for(int i = 0; i < a; i++){
            r = Math.random();
            System.out.println("(" + xPosition + "," + yPosition + ")");
            if (r < 0.25) {
                yPosition += 1;    
            } 
            else if (r < 0.5) {
                xPosition += 1;
            }
            else if (r < 0.75){
                xPosition -= - 1;
            }
            else {
                yPosition -= 1;
            }
            
        }
        System.out.println("(" + xPosition + "," + yPosition + ")");
        System.out.println("Squared Distance = " + (Math.pow(xPosition,2) + Math.pow(yPosition, 2)));
    }
}