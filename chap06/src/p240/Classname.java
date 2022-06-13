package p240;

public class Classname {
	//인스턴스 필드와 메소드
	static int field1;
	static void method1() {}
	
	//정적 필드와 메소드
	static int field2;
	static void method2() {}
	
	//정적 블록
	static {
		field1 = 10;
		method1();
		field2 = 10;
		method2();
	}
	
	//정적 메소드
	static void Method3() {
//		this.field1 = 10;       //this는 정적메소드에 사용불가
//		this.method1();
		field2 = 10;
		method2();
	}

}
