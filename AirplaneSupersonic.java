package studying.상속;

public class AirplaneSupersonic extends Airplane{	//자식 클래스
	
		public static final int NORMAL = 1;
		public static final int SUPERSONIC = 2;
		
		public int flyMode = NORMAL;
		
		public void fly() {
			if(flyMode==SUPERSONIC) {
				System.out.println("초음속비행입니다.");
			}else {
				super.fly();	//super 변수 사용하서 부모 클래스의 fly() 메소드 호출
			}
		}
}
