package studying.클래스;            //필드

public class Car {

		String company = "현대 자동차"; //필드 선언
		String model = "그랜저";  	//필드 선언
		String color = "검정";  		//필드 선언
		int maxSpeed = 350;  		//필드 선언
		int speed;					//필드 선언
		
	public static void main(String[] args) {
		
		Car myCar = new Car();		//객체 생성
		
		System.out.println("제작 회사: " + myCar.company);		//필드값 읽기
		System.out.println("모델명: " + myCar.model);			//필드값 읽기
		System.out.println("색깔: " + myCar.color);			//필드값 읽기
		System.out.println("최고 속도: " + myCar.maxSpeed);		//필드값 읽기
		System.out.println("현재 속도: " + myCar.speed);		//필드값 읽기, 필드 선언 시 초기값을 주지 않았기 때문에 기본값인 0으로 필드 자동 초기화됨
		
		myCar.speed = 60;								//필드값 수정
		System.out.println("수정된 속도: " + myCar.speed);
	}

}
