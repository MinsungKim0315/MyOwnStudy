package studying.상속;

public class ParentChildExample {		//자식 클래스 이용

	public static void main(String[] args) {
		ParentChild child = new ParentChild();
		
		Parent parent = child;	//자동 타입 변환
		parent.method1();
		parent.method2();
		//parent.method3();		//호출 불가능
	}

}
