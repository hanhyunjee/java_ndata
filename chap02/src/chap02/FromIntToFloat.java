package chap02;

public class FromIntToFloat {

	public static void main(String[] args) {
		int num1 =123456780;
		int num2 =123456780;
		
		double num3 =num2;
		num2 =(int)num3;
		
		int result =num1-num2; //여기서부터 num1과 num2는 동일값이 아니다.
		System.out.println(result);
	}

}