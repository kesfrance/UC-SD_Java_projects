/**
* CommissionCalculator.java
*
* @author Francis Kessie
*
* A company pays its salespeople on a commission basis. The salespeople 
* receive $200 per week plus 9% of their gross sales for that week as commision.
* This App inputs one salesperson’s items sold for a week and calculates and 
* displays that salesperson’s earnings for the week. There’s no limit to the
* number of items that can be sold.
* 
*/

import java.util.Scanner;

public class CommissionCalculator {
    
    public static void main(String args[]) {
        // Initialize a Scanner to read input from the command line
        Scanner input = new Scanner(System.in);
        
        // initialize variables
        int itemSold = 1;
        double itemValue = 0, salary = 200.00;
        
        // Prompt and take input from the user (input should be an integer)
   	// and should correspond to item number (1 - 4) to record sale or should be 0 to exit
        // Display the user's current compensation   
        while (itemSold != 0){
            System.out.println("Item\tValue");
            System.out.println("1\t$239.99");
            System.out.println("2\t$129.75");
            System.out.println("3\t$99.95");
            System.out.println("4\t$350.89"); 
            System.out.printf("%s%s%.2f%n","Current Compensation is: ", "$", salary);
            System.out.printf("%s", "Please select an item from the list above (or enter 0 to exit): ");
            itemSold = input.nextInt();
       
        	
            if (itemSold < 0) {          		
       	         System.out.printf("%s%n", "ERROR: Invalid input!");
        	}
        	
            else if (itemSold > 0)
            	if (itemSold <= 4){
            		
         //Convert match item label names to values and calculate commission
                 	if (itemSold == 1)
                 	    itemValue = 239.99;
                 	else if(itemSold == 2)
                 	    itemValue = 129.75;
                 	else if(itemSold == 3)
                 	    itemValue = 99.95;
                 	else if(itemSold == 4)
                 	    itemValue = 350.89;
                 	else
                 	    itemValue = 0;                 	
             
                 	salary = salary + itemValue * 0.09;
            	}
            else if (itemSold > 4){            		
            		System.out.printf("%s%n", "ERROR: Invalid input!");
            }        	
         	
        }
        
    	//After the user enters 0, Display the salesperson's total earnings 
        System.out.printf("%s%s%.2f%n","Total earnings: ", "$", salary);
    }

}
    

