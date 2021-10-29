package studying.상속;

public class TireHankook extends Tire{
	
	//필드
	//생성자
	public TireHankook(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//메소드
	public boolean roll() {			//다른 내용을 출력하기 위해 재정의한 roll()메소드
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "TireHankook 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("***" + location + "TireHankook PUNK ***");
			return false;
		}
	}
}