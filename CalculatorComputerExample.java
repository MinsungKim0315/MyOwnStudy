package studying.상속;

public class CalculatorComputerExample {		//자식 클래스 이용

	public static void main(String[] args) {

		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원면적: " + calculator.areaCircle(r));
		System.out.println();
		
		CalculatorComputer computer = new CalculatorComputer();
		System.out.println("원면적: " + computer.areaCircle(r));	//재정의된 메소드 호출
	}

}
