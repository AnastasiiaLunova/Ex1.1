public class Function {

	public double getFunction(int x, int y) {
		double result = 0;
		
		if(y == 0) {
			throw new ArithmeticException("������� �� 0 ����������");
		} 
	
		result = (double)(x+5)/y;
				
		return result;
	}
}
