package thursday_lab_10_july;

public class Final_method {
//called final method
	public static void main(String[] args) {
		//create object
		Taxcalculator obj=new Taxcalculator();
		//calling try method for fining exception
		try {
			System.out.println("your tax amount is"+obj.calculateTax(null, false, 0));
			
			//calling catch method for solving exception 
		} catch (employeenameinvalidationException e) {
			System.out.println(e.getMessage());
		} catch (contrytrynotvalidexception e) {
			System.out.println(e.getMessage());
		} catch (TaxnoteligibleException e) {
			System.out.println(e.getMessage());
		}
		//calling finnally method
		finally{
			System.out.println("________thank you_____________");
		}

	}
	
}
