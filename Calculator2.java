package studying.Ŭ����;			//�޼ҵ�, Ŭ���� ���ο��� �޼ҵ� ȣ��

public class Calculator2 {
													//��ü ���ο��� ȣ��
	int plus(int x, int y) {//-------------1
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {//-----------2
		double sum = plus(x, y);//1ȣ��
		double result = sum/2;
		return result;
	}
	
	void execute() {//---------------------3
		double result = avg(7,10);//2ȣ��
		println("������: " + result);//4ȣ��
	}
	
	void println(String message) {//-------4
		System.out.println(message);
	}
	
	public static void main(String[] args) {
	
		Calculator2 myCalc = new Calculator2();
		myCalc.execute();//execute() �޼ҵ� ȣ��
	}

}
