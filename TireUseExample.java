package studying.���;

public class TireUseExample {

	public static void main(String[] args) {
		TireCar tirecar = new TireCar();		//TireCar ��ü ����
		
		for(int i=1;i<=5;i++) {			//TireCar ��ü�� run()�޼ҵ� 5�� �ݺ� ����
			int problemLocation = tirecar.run();
		
		
		switch(problemLocation) {
		case 1:														//�տ��� Ÿ�̾ ��ũ�� �� TireHankook�� ��ü
			System.out.println("�տ��� HankookTire�� ��ü");
			tirecar.frontLeftTire = new TireHankook("�տ���", 15);
			break;
		case 2:
			System.out.println("�տ����� KumhoTire�� ��ü");
			tirecar.frontRightTire = new TireKumho("�տ�����", 13);
			break;
		case 3:
			System.out.println("�ڿ��� HankookTire�� ��ü");
			tirecar.backLeftTire = new TireHankook("�ڿ���", 14);
			break;
		case 4:
			System.out.println("�ڿ����� KumhoTire�� ��ü");
			tirecar.backRightTire = new TireKumho("�ڿ�����", 17);
			break;
		}
		System.out.println("-------------------------");
		}
	}
}
