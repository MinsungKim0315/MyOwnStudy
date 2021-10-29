package studying.클래스;		//다른 생성자 호출: this()

public class Car3 {

	String company = "Hyundai";
	String model;
	String color;
	int maxSpeed;
	
	Car3(){}
	Car3(String model){
		this(model, "silver", 250);						//중복 코드 줄이기
		}
	Car3(String model, String color){					//중복 코드 줄이기
		this(model, color, 250);
		}
	Car3(String model, String color, int maxSpeed){		
		this.model = model;								//공통 실행 코드
		this.color = color;								//공통 실행 코드
		this.maxSpeed = maxSpeed;						//공통 실행 코드
	}
	
	public static void main(String[] args) {
		Car3 car1 = new Car3();						
		System.out.println(car1.company);
		System.out.println();
		
		Car3 car2 = new Car3("자가용");				
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println();
		
		Car3 car3 = new Car3("택시", "노랑");			
		System.out.println(car3.company);
		System.out.println(car3.model);
		System.out.println(car3.color);
		System.out.println();
		
		Car3 car4 = new Car3("경주용", "검정", 300);	
		System.out.println(car4.company);
		System.out.println(car4.model);
		System.out.println(car4.color);
		System.out.println(car4.maxSpeed);
		System.out.println();

	}

}
