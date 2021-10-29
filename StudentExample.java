package studying.상속;

public class StudentExample {		//자식 클래스 이용

	public static void main(String[] args) {
		
		Student student = new Student("김민성", "010-9720-5579", 2019253077);
		System.out.println("name: " + student.name);	//부모에게 상속받은 필드 출력
		System.out.println("ssn: " + student.ssn);		//부모에게 상속받은 필드 출력
		System.out.println("studentNo: " + student.studentNo);
		
	}

}
