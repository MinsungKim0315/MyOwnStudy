package studying.Ŭ����;            //�ʵ�

public class Car {

		String company = "���� �ڵ���"; //�ʵ� ����
		String model = "�׷���";  	//�ʵ� ����
		String color = "����";  		//�ʵ� ����
		int maxSpeed = 350;  		//�ʵ� ����
		int speed;					//�ʵ� ����
		
	public static void main(String[] args) {
		
		Car myCar = new Car();		//��ü ����
		
		System.out.println("���� ȸ��: " + myCar.company);		//�ʵ尪 �б�
		System.out.println("�𵨸�: " + myCar.model);			//�ʵ尪 �б�
		System.out.println("����: " + myCar.color);			//�ʵ尪 �б�
		System.out.println("�ְ� �ӵ�: " + myCar.maxSpeed);		//�ʵ尪 �б�
		System.out.println("���� �ӵ�: " + myCar.speed);		//�ʵ尪 �б�, �ʵ� ���� �� �ʱⰪ�� ���� �ʾұ� ������ �⺻���� 0���� �ʵ� �ڵ� �ʱ�ȭ��
		
		myCar.speed = 60;								//�ʵ尪 ����
		System.out.println("������ �ӵ�: " + myCar.speed);
	}

}
