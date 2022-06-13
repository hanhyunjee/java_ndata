package p245;

public class Person {
	final String nation = "Korea";  //MASK-ROM 제조회사에서 미리만들어져서 나온것
	final String ssn; //P-ROM 딱 한번만 들어가는 것
	String name; //EEP-ROM, EP-ROM 언제든지 변경가능
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}

}
