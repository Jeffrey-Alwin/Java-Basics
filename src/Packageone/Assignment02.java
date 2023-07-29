package Packageone;

public class Assignment02 {
   
	public int Addition(int a, int b) {
		
		int c= a+b ;
		System.out.println("Addition of "+ c);
		return c;
	}
public int Multiplication(int a, int b) {
		
		int c= a*b ;
		System.out.println("Multiplication of "+ c);
		return c;
	}
public int Subtraction(int a, int b) {
	
	int c= a-b ;
	System.out.println("Subtraction of "+ c);
	return c;
}
public int division(int a, int b) {
	
	int c= a/b ;
	System.out.println("Division of "+ c);
	return c;
}

	
	
	

	public static void main(String[] args) {
		
		 Assignment02 Calculation = new Assignment02();
	       
	       Calculation.division(10, 5);
	       Calculation.Addition(0, 0);
	       
	}
	
}





