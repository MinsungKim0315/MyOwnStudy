package studying.���;

public class AirplaneSupersonic extends Airplane{	//�ڽ� Ŭ����
	
		public static final int NORMAL = 1;
		public static final int SUPERSONIC = 2;
		
		public int flyMode = NORMAL;
		
		public void fly() {
			if(flyMode==SUPERSONIC) {
				System.out.println("�����Ӻ����Դϴ�.");
			}else {
				super.fly();	//super ���� ����ϼ� �θ� Ŭ������ fly() �޼ҵ� ȣ��
			}
		}
}
