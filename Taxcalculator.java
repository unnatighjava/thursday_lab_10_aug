package thursday_lab_10_july;

import java.util.Scanner;

public class Taxcalculator {

	Scanner sc=new Scanner(System.in);
	public double  calculateTax(String empname,boolean isindian,double empsal) 
			throws employeenameinvalidationException, contrytrynotvalidexception, TaxnoteligibleException{
	
	
			
	 double taxamount=0;
	 System.out.println("ENTER YOUR NAME");
	 empname=sc.nextLine();
	 if(empname.isEmpty()) {
		 throw new employeenameinvalidationException("the emploee name cannot be emty");
		 }
	 else {
		 System.out.println("you are indian or not");
		 isindian=sc.nextBoolean();
	 }
	 if(isindian==false) {
		 throw new contrytrynotvalidexception("the employ should be an idian citizen for calculating tax");
	 }
	 else if(isindian==true) {
		 System.out.println("enter your salary");
		 empsal=sc.nextDouble();
		 if(empsal>100000) {
			 taxamount=empsal*8/100;
		 }
		 else if(empsal>=50000) {
			 taxamount=empsal*6/100;
		 }
		 else if(empsal>=30000) {
			 taxamount=empsal*5/100;
		 }
		 else if(empsal>=10000)
		 {
			 taxamount=empsal*4/100;
		 }
		 else {
			 throw new TaxnoteligibleException("The employee does not need to pay tax”");
		 }
		 
	 }
	
	 return taxamount;
	 
	}
	}


	
