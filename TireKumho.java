package studying.���;

public class TireKumho extends Tire{
	
		//�ʵ�
		//������
		public TireKumho(String location, int maxRotation) {
			super(location, maxRotation);
		}
		
		//�޼ҵ�
		public boolean roll() {			//�ٸ� ������ ����ϱ� ���� �������� roll()�޼ҵ�
			++accumulatedRotation;
			if(accumulatedRotation<maxRotation) {
				System.out.println(location + "TireKumho ����: " + (maxRotation-accumulatedRotation) + "ȸ");
				return true;
			}else {
				System.out.println("***" + location + "TireKumho PUNK ***");
				return false;
			}
		}
}