public class Function {

	public double getFunction(int x, int y) {
		double result = 0;
		
		if(y == 0) {
			throw new ArithmeticException("Деление на 0 невозможно");
		} 
	
		result = (double)(x+5)/y;
				
		return result;
	}
}
