package studying.���;

public class Tire {
	
	//�ʵ�
	public int maxRotation;			//�ִ� ȸ����(Ÿ�̾� ����)
	public int accumulatedRotation;	//���� ȸ����
	public String location;			//Ÿ�̾� ��ġ
	
	//������
	public Tire(String location, int maxRotation) {
		this.location = location;		//Ÿ�̾� ��ġ �ʱ�ȭ
		this.maxRotation = maxRotation;	//�ִ� ȸ���� �ʱ�ȭ
	}
	
	//�޼ҵ�
	public boolean roll() {
		++accumulatedRotation;		//ȸ���� 1 ����
		if(accumulatedRotation<maxRotation) {	//���� ȸ���� ��� ����
			System.out.println(location + "Tire ����: " + (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		}else {									//��ũ�� ��� ����
			System.out.println("***" + location + "Tire PUNK ***");
			return false;
		}
	}
}
