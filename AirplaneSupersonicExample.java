package studying.���;

public class AirplaneSupersonicExample {	//�ڽ� Ŭ���� �̿�

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
