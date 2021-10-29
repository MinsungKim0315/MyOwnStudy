package studying.상속;

public class AirplaneSupersonicExample {	//자식 클래스 이용

	public static void main(String[] args) {
		
		AirplaneSupersonic sa = new AirplaneSupersonic();
		sa.takeOff();
		sa.fly();
		sa.flyMode = AirplaneSupersonic.SUPERSONIC;
		sa.fly();
		sa.flyMode = AirplaneSupersonic.NORMAL;
		sa.fly();
		sa.land();
		
	}
}
