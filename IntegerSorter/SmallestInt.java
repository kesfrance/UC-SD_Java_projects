/**
* SmallestInt.java
*
* @author Francis Kessie
*
* A application that finds the smallest of several integers entered by user. 
* The App prompts user to first of all indicate expeceted number of enteries. 
* The Smallest integer is determined from entry and printed to screen.
*/

import java.util.Scanner;

public class SmallestInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        // Initialization step 
        int intNumber = 1;
        int counter = 1;
        int smallest = 0;
        int value1;
        Scanner input1 = new Scanner(System.in);
        
    	
    	// Prompt the user and validate their input to ensure they've entered 
    	// a positive (greater than zero) integer. Discard/ignore any other data.         
        while (counter != 0){
        System.out.print("How many integers shall we compare? (Enter a positive integer): ");
        intNumber = input1.nextInt(); 
         
            if (intNumber > 0){      	    
 	        counter -= 1;
 	        break;
           }else 
     	        System.out.println("Invalid input!"); 
     	        continue;          
        }
        	
        // Prompt for candidates and determine smallest integer        
        for(int ii = 1; ii <= intNumber; ++ii ) {           	        		
            	System.out.print("Enter value " + ii + ": ");
            	value1 = input1.nextInt();
            	
            	if (ii == 1)
            	    smallest += value1;            	
            		
            	if (smallest >= value1)
            		smallest = value1;     		
        }
                
        System.out.println("The smallest number entered was: " + smallest);
    }
}
    


