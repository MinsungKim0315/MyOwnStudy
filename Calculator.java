package studying.Ŭ����;		//�޼ҵ�

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
		
		Calculator myCalc = new Calculator();		//�ܺ� Ŭ�������� Calculator Ŭ������ �޼ҵ带 ȣ���ϱ� ������ Calculator��ü�� �����ϰ� ���� ������ myCalc�� �̿��ؾ� �Ѵ�
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