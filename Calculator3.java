package studying.Ŭ����;		//�޼ҵ�, �޼ҵ� �����ε�

public class Calculator3 {
											//�޼ҵ� �����ε�
	double areaRectangle(double width) {				//���簢�� ����
		return width*width;
	}
	
	double areaRectangle(double width, double height) {	//���簢�� ����
		return width*height;
	}
	
	public static void main(String[] args) {
	
		Calculator3 myCalc = new Calculator3();
		
		double result1 = myCalc.areaRectangle(10);		//���簢�� ����
		
		double result2 = myCalc.areaRectangle(10, 20);	//���簢�� ����
		
		System.out.println("���簢�� ����: " + result1);
		System.out.println("���簢�� ����: " + result2);

	}

}
