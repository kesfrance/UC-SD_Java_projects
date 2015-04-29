/*
 * EmployeeTest.java
 */

/** A test class to run Employee.java
 *  Computes and dsiplay the yearly salary of employees
 *  Allows for pay raises but does not accept negative salaries
 *
 * @author Francis Kessie
 */
public class EmployeeTest {
   
    public static void main(String args[]){
        	
    	double benSalary = 1234.56;
    	double paulSalary = 2345.67;
    	double payRaise = 1.1;
    	
    	// Create two Employee objects   
    	Employee emp1 = new Employee("Benjamin", "Bernanke", benSalary);
    	Employee emp2 = new Employee("Paul", "Volcker", paulSalary);
    
    	
        // Display the employees' info (including yearly salary)
        System.out.printf("%s %s yearly salary: $%.2f%n",emp1.getFirstName(), emp1.getLastName(), emp1.getMonthlySalary()*12);
        System.out.printf("%s %s yearly salary: $%.2f%n",emp2.getFirstName(), emp2.getLastName(), emp2.getMonthlySalary()*12);
        System.out.println("Giving raises...");
        
        // Give each employee a 10% raises.
        emp1.setMonthlySalary(emp1.getMonthlySalary() * payRaise);
        emp2.setMonthlySalary(emp2.getMonthlySalary() * payRaise);
        System.out.printf("%s %s yearly salary: $%f%n",emp1.getFirstName(), emp1.getLastName(), emp1.getMonthlySalary()*12);
        System.out.printf("%s %s yearly salary: $%.3f%n", emp2.getFirstName(), emp2.getLastName(), emp2.getMonthlySalary()*12);
        
        
        System.out.println("Attempting to set a negative salary value...");
        // Attempt to set Bernanke's salary to a negative value...
        // Display Bernanke's info (including yearly salary)
        emp1.setMonthlySalary(-1234.56);
        System.out.printf("%s %s yearly salary: $%f%n",emp1.getFirstName(), emp1.getLastName(), emp1.getMonthlySalary()*12);
        
    }
}  
