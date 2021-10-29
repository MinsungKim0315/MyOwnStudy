package studying.참조타입;

public class DiffString {

	public static void main(String[] args) {
		String strvar1 = "William";
		String strvar2 = "William";
		
		if (strvar1==strvar2) {
			System.out.println("strvar1과 strvar2는 참조가 같다");      // ^^
			System.out.println("strvar1과 strvar2는 참조가 다르다");
		}else {
		}
		
		if(strvar1.equals(strvar2)) {
			System.out.println("strvar1과 strvar2는 문자열이 같다");     //동일한 String 객체이건 다른 String 객체이건 상관없이 내부 문자열을 비교할 때 사용
		}
		
		String strvar3 = new String("William");
		String strvar4 = new String("William");
		
		if (strvar3==strvar4) {
			System.out.println("strvar3과 strvar4는 참조가 같다");
		}else {
			System.out.println("strvar3과 strvar4는 참조가 다르다");     // ^^
		}
		
		if(strvar3.equals(strvar4)) {
			System.out.println("strvar3과 strvar4는 문자열이 같다");
		}
	}

}
