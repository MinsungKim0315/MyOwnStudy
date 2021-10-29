package studying.상속;

public class CalculatorComputer {		//자식 클래스

	//부모 메소드 재정의
	double areaCircle(double r) {
		System.out.println("CalculatorComputer 객체의 areaCircle() 실행");
		return Math.PI*r*r;	//정확한 파이 상수 이용 Math.PI
	}
}
