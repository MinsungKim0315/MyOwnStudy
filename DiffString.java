package studying.����Ÿ��;

public class DiffString {

	public static void main(String[] args) {
		String strvar1 = "William";
		String strvar2 = "William";
		
		if (strvar1==strvar2) {
			System.out.println("strvar1�� strvar2�� ������ ����");      // ^^
			System.out.println("strvar1�� strvar2�� ������ �ٸ���");
		}else {
		}
		
		if(strvar1.equals(strvar2)) {
			System.out.println("strvar1�� strvar2�� ���ڿ��� ����");     //������ String ��ü�̰� �ٸ� String ��ü�̰� ������� ���� ���ڿ��� ���� �� ���
		}
		
		String strvar3 = new String("William");
		String strvar4 = new String("William");
		
		if (strvar3==strvar4) {
			System.out.println("strvar3�� strvar4�� ������ ����");
		}else {
			System.out.println("strvar3�� strvar4�� ������ �ٸ���");     // ^^
		}
		
		if(strvar3.equals(strvar4)) {
			System.out.println("strvar3�� strvar4�� ���ڿ��� ����");
		}
	}

}
