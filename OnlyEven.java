package studying.���ǹ����ݺ���;

public class OnlyEven {

	public static void main(String[] args) {
		for(int i = 1;i<=20;i++) {
			if(i%2 != 0) {
				continue;    //Ư�� ������ �������� ������ �ݺ����� ���� ��Ű�� �ʰ� ��� �ݺ� ���� ��Ų��
			}
			System.out.println(i);
		}
	}
}
