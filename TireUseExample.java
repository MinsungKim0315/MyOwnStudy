package studying.상속;

public class TireUseExample {

	public static void main(String[] args) {
		TireCar tirecar = new TireCar();		//TireCar 객체 생성
		
		for(int i=1;i<=5;i++) {			//TireCar 객체의 run()메소드 5번 반복 실행
			int problemLocation = tirecar.run();
		
		
		switch(problemLocation) {
		case 1:														//앞왼쪽 타이어가 펑크날 시 TireHankook로 교체
			System.out.println("앞왼쪽 HankookTire로 교체");
			tirecar.frontLeftTire = new TireHankook("앞왼쪽", 15);
			break;
		case 2:
			System.out.println("앞오른쪽 KumhoTire로 교체");
			tirecar.frontRightTire = new TireKumho("앞오른쪽", 13);
			break;
		case 3:
			System.out.println("뒤왼쪽 HankookTire로 교체");
			tirecar.backLeftTire = new TireHankook("뒤왼쪽", 14);
			break;
		case 4:
			System.out.println("뒤오른쪽 KumhoTire로 교체");
			tirecar.backRightTire = new TireKumho("뒤오른쪽", 17);
			break;
		}
		System.out.println("-------------------------");
		}
	}
}
