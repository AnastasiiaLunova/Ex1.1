public class Main {

	public static void main(String[] args) {
		
		double result = 0;
		Function func = new Function();
		
		try {
			result = func.getFunction(1,5);
			System.out.println("Result: " + result); 	
		} catch (ArithmeticException error) {
			System.out.println( error.getMessage() );
		
		}

	}
}
