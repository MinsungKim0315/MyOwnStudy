package studying.Ŭ����;		//�ν��Ͻ� ����� this
						
public class Car5 {
	
	String model;
	int speed;
	
	Car5(String model){
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i=10;i<=50;i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "�� �ٸ��ϴ�.(�ü�:" + this.speed + "km/h)");
		}
	}

	public static void main(String[] args) {

		
		Car5 myCar = new Car5("Porchse");
		Car5 yourCar = new Car5("Benz");
		
		myCar.run();
		yourCar.run();
	}

}
