package studying.���;

public class TireCar {
	
	//�ʵ�
	Tire frontLeftTire = new Tire("�տ���", 6);	//�ڵ����� 4�� Ÿ�̾�
	Tire frontRightTire = new Tire("�տ�����", 2);	//�ڵ����� 4�� Ÿ�̾�
	Tire backLeftTire = new Tire("�ڿ���", 3);	//�ڵ����� 4�� Ÿ�̾�
	Tire backRightTire = new Tire("�ڿ�����", 4);	//�ڵ����� 4�� Ÿ�̾�
	
	//������
	
	//�޼ҵ�
	int run() {				//��� Ÿ�̾ 1ȭ ȸ����Ű�� ���� �� Tire ��ü�� roll()�޼ҵ� ȣ��, false�� �����ϴ� ��� stop()�޼ҵ� ȣ���ϰ� �ش� Ÿ�̾� ��ȣ �����Ѵ�	
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		if(frontLeftTire.roll()==false) {stop();return 1;}
		if(frontRightTire.roll()==false) {stop();return 2;}
		if(backLeftTire.roll()==false) {stop();return 3;}
		if(backRightTire.roll()==false) {stop();return 4;}
		return 0;
	}
	
	void stop() {			//��ũ�� �� ����
		System.out.println("[�ڵ����� ����ϴ�.");
	}
}
