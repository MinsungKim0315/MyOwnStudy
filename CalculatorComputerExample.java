package studying.���;

public class CalculatorComputerExample {		//�ڽ� Ŭ���� �̿�

	public static void main(String[] args) {

		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("������: " + calculator.areaCircle(r));
		System.out.println();
		
		CalculatorComputer computer = new CalculatorComputer();
		System.out.println("������: " + computer.areaCircle(r));	//�����ǵ� �޼ҵ� ȣ��
	}

}
