package studying.���;

public class TireHankook extends Tire{
	
	//�ʵ�
	//������
	public TireHankook(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//�޼ҵ�
	public boolean roll() {			//�ٸ� ������ ����ϱ� ���� �������� roll()�޼ҵ�
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "TireHankook ����: " + (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		}else {
			System.out.println("***" + location + "TireHankook PUNK ***");
			return false;
		}
	}
}