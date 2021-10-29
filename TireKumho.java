package studying.상속;

public class TireKumho extends Tire{
	
		//필드
		//생상자
		public TireKumho(String location, int maxRotation) {
			super(location, maxRotation);
		}
		
		//메소드
		public boolean roll() {			//다른 내용을 출력하기 위해 재정의한 roll()메소드
			++accumulatedRotation;
			if(accumulatedRotation<maxRotation) {
				System.out.println(location + "TireKumho 수명: " + (maxRotation-accumulatedRotation) + "회");
				return true;
			}else {
				System.out.println("***" + location + "TireKumho PUNK ***");
				return false;
			}
		}
}