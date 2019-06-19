/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

import java.util.Scanner;

/**This class for
 * printing final salary including bonus
 * @author srinivsi
 */
public class PayrollPrint 
{
public static void main(String[] args) 
{
/* here assumed that 50 employee accounts can be created
 for the given bank */
Payroll ac[]=new Payroll[50];
Scanner sc=new Scanner(System.in);
System.out.println("Please enter the employee name:");
//add code
String str = sc.nextLine();
System.out.println("Please enter the salary: salary <=3000");
double salary = sc.nextDouble();
if(salary > 3000){
System.out.println("No bonus added as salary is more than 3000, try running again");         
}
else{
    double newSalary = 10.0/100.0 * salary + salary;
    System.out.println("New salary amount is " + newSalary);
}

}
}
