package studying.���;

public class ParentChildExample {		//�ڽ� Ŭ���� �̿�

	public static void main(String[] args) {
		ParentChild child = new ParentChild();
		
		Parent parent = child;	//�ڵ� Ÿ�� ��ȯ
		parent.method1();
		parent.method2();
		//parent.method3();		//ȣ�� �Ұ���
	}

}
