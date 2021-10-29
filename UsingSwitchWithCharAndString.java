package studying.조건문과반복문;

public class UsingSwitchWithCharAndString {

	public static void main(String[] args) {
	//char를 이용한 switch 예시
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
		
	//String을 이용한 switch 예시	
		String position = "과장";
		switch(position) {
		case "부장": System.out.println("700$");
			break;
		case "과장": System.out.println("500$");
			break;
		default:	System.out.println("300$");
		}
		
	}

}
