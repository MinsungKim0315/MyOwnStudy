package studying.클래스;			//생성자의 오버로드

public class Car2 {

	String company = "Hyundai";
	String model;
	String color;
	int maxSpeed;
	
	Car2(){}                                             //생성자1
	Car2(String model){									 //생성자2
		this.model = model;
	}
	Car2(String model, String color){					 //생성자3
		this.model = model;
		this.color = color;
	}
	Car2(String model, String color, int maxSpeed){		 //생성자4
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public static void main(String[] args) {
		
		Car2 car1 = new Car2();						//생성자1 선택
		System.out.println(car1.company);
		System.out.println(car1.model); //NULL 생성 
		System.out.println();
		
		Car2 car2 = new Car2("자가용");				//생성자2 선택
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println();
		
		Car2 car3 = new Car2("자가용", "빨강");			//생성자3 선택
		System.out.println(car3.company);
		System.out.println(car3.model);
		System.out.println(car3.color);
		System.out.println();
		
		Car2 car4 = new Car2("자가용", "빨강", 200);	//생성자4 선택
		System.out.println(car4.company);
		System.out.println(car4.model);
		System.out.println(car4.color);
		System.out.println(car4.maxSpeed);
		System.out.println();
	}

}
