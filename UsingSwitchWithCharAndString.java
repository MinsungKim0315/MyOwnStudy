package studying.���ǹ����ݺ���;

public class UsingSwitchWithCharAndString {

	public static void main(String[] args) {
	//char�� �̿��� switch ����
		char grade = 'a';
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("good");
			break;
		case 'B':
		case 'b':
			System.out.println("soso");
			break;
		default:
			System.out.println("nothing");
		}
		
	//String�� �̿��� switch ����	
		String position = "����";
		switch(position) {
		case "����": System.out.println("700$");
			break;
		case "����": System.out.println("500$");
			break;
		default:	System.out.println("300$");
		}
		
	}

}
