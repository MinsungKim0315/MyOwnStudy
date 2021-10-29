package studying.클래스;		//메소드

public class Calculator {
		
	void powerOn() {
		System.out.println("start program");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x/(double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("exit System");
	}
	
	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();		//외부 클래스에서 Calculator 클래스의 메소드를 호출하기 때문에 Calculator객체를 생성하고 참조 변수인 myCalc를 이용해야 한다
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println(result1);
		
		byte x =10;
		byte y =4;
		double result2 = myCalc.divide(x,y);
		System.out.println(result2);
		
		myCalc.powerOff();		
	
}
}