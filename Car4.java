package studying.클래스;		//메소드, 클래스 외부에서 메소드 호출

public class Car4 {
								//클래스 외부에서 메소드 호출
	int speed;
	
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("turn the key,");
	}
	
	void run() {
		for(int i=0;i<=50;i+=10) {
			speed = i;
			System.out.println("run.(velocity: " + speed + "km/h");
		}
	}
	
	public static void main(String[] args) {
		
		Car4 myCar = new Car4();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("current speed: " + speed + "km/h");
	}

}
