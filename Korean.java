package studying.클래스;				//생성자

public class Korean {

	String nation = "Korea";  //필드 생성
	String name;			  //필드 생성
	String ssn;				  //필드 생성

	Korean(String name, String ssn) {
		this.name=name;   //필드 앞에 this. 를 붙이면 필드와 동일한 이름을 갖는 매개변수 설정 가능
		this.ssn=ssn;
	}
	public static void main(String[] args) {
		
		Korean k1 = new Korean("Kim Minsung", "011225-1234567");
		System.out.println(k1.nation);
		System.out.println("k1.name: " + k1.name);
		System.out.println("k1.ssn: " + k1.ssn);
		
		Korean k2 = new Korean("Kim", "930525-0654321");
		System.out.println(k2.nation);
		System.out.println("k2.name: " + k2.name);
		System.out.println("k2.ssn: " + k2.ssn);

	}

}
