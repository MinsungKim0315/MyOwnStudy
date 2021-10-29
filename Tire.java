package studying.상속;

public class Tire {
	
	//필드
	public int maxRotation;			//최대 회전수(타이어 수명)
	public int accumulatedRotation;	//누적 회전수
	public String location;			//타이어 위치
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;		//타이어 위치 초기화
		this.maxRotation = maxRotation;	//최대 회전수 초기화
	}
	
	//메소드
	public boolean roll() {
		++accumulatedRotation;		//회전수 1 증가
		if(accumulatedRotation<maxRotation) {	//정상 회전일 경우 실행
			System.out.println(location + "Tire 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		}else {									//펑크일 경우 실행
			System.out.println("***" + location + "Tire PUNK ***");
			return false;
		}
	}
}
