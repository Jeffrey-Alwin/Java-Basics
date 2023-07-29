package Packageone;

public class Assignment03 {

	public int Method1(int d){
		
		int f = Method2(10, 5) - d;
	    System.out.println("(a + b) - d is " + f);
		return f;
		
             		             
		
	}
	
	public int Method2(int a,int b) {
		
		int c = a+b;
		System.out.println("Addition of a+b is " + c);		
		return c;
	}
	public static void main(String[] args) {
		
		Assignment03 calculation = new Assignment03();
		
		calculation.Method1(1);
	}

}
