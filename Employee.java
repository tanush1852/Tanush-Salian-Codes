/*Ankit works at ABC Company. He noticed that differentr oles(positions) have different salaries and bonuses.

        The 1st Role is an ‘Intern’ which has 3/4th of the base salary of an Employee.Then there is ‘Clerk’ which has ½ of base salary.And then there are ‘Manager’ who have twice the base salary of that of an employee.

        Help him write a program in Java as follows.

        Create a class ‘Employee’ which has a method named ‘getSalary’which returns a base salary of Rs. 10,000. It also has methods named ‘getBonus’ which returns the bonus amount for that role(initially set to Rs. 0).

        Make 3 subclasses for different roles which inherit the ‘Employee’ class and each has functions named ‘getSalary’ and ‘getBonus’.(You Can assume values for ‘getBonus’ method). Display the output for all cases. Also print the total salary received by each Employee after getting the bonus.

        Note : Solve using method overriding*/

import java.util.*;
class Employee{
  public double baseSalary;
  public int bonus;
  public double getSalary()
  {
    baseSalary=10000;
    return baseSalary;
  }
  public int getBonus()
  {
    
  bonus=0;
  return bonus;
  }
  
 }
 
 class Intern extends Employee{
 
  public double getSalary()
  {
     baseSalary=((3.0/4.0)*10000);
     return baseSalary;
  }
  public int getBonus()
  {
     bonus=1000;
     return bonus;
  }
}

class Clerk extends Employee
{
   public double getSalary()
   {
     baseSalary=(0.5*10000);
     return baseSalary;
   }
   public int getBonus()
   {
      bonus=2000;
      return bonus;
   }
}

class Manager extends Employee
{
  public double getSalary()
  {
     baseSalary=2*10000;
     return baseSalary;
   }
   public int getBonus()
   {
       bonus=3000;
       return bonus;
   }
}

public class Prog6a
{
   public static void main(String agrs[])
   {
     Intern i1=new Intern();
     double internsal=i1.getSalary();
     int internbon=i1.getBonus();
     System.out.println("for intern base salary is:"+internsal+" bonus is:"+internbon);
     System.out.println("TOTAL SALARY OF INTERN:"+(internsal+internbon));
     
     Clerk c1=new Clerk();
     double clerksal=c1.getSalary();
     int clerkbon=c1.getBonus();
     System.out.println("for clerk base salary is:"+clerksal+" bonus is:"+clerkbon);
     System.out.println("TOTAL SALARY OF CLERK :"+(clerksal+clerkbon));
     
     Manager m1=new Manager();
     double managersal=m1.getSalary();
     int managerbon=m1.getBonus();
     System.out.println("for manager base salary is:"+managersal+" bonus is:"+managerbon);
     System.out.println("TOTAL SALARY OF MANAGER:"+(managersal+managerbon));
   }
  } 
                         
    
