package studying.Ŭ����;				//������

public class Korean {

	String nation = "Korea";  //�ʵ� ����
	String name;			  //�ʵ� ����
	String ssn;				  //�ʵ� ����

	Korean(String name, String ssn) {
		this.name=name;   //�ʵ� �տ� this. �� ���̸� �ʵ�� ������ �̸��� ���� �Ű����� ���� ����
		this.ssn=ssn;
	}
	public static void main(String[] args) {
		
		Korean k1 = new Korean("Kim Minsung", "011225-1234567");
		System.out.println(k1.nation);
		System.out.println("k1.name: " + k1.name);
		System.out.println("k1.ssn: " + k1.ssn);
		
		Korean k2 = new Korean("Kim", "930525-0654321");
		System.out.println(k2.nation);
		System.out.println("k2.name: " + k2.name);
		System.out.println("k2.ssn: " + k2.ssn);

	}

}
