
public class InputDataCheckNaNExample2 {

	public static void main(String[] args) {
		String userInput = "NaN";
		double va1 = Double.valueOf(userInput);
		
		
		double currentBalance = 10000.0;
		
		
		if(Double.isNaN(va1)) {
			System.out.println("NaN이 입력되어 처리할 수 없음");
			va1 = 0.0;
		}

		
		currentBalance += va1;
		System.out.println(currentBalance);
	}

}
