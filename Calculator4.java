package studying.클래스;			//정적 멤버 사용
								
public class Calculator4 {

	static double pi = 3.141592;
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
	
	public static void main(String[] args) {

		double result1 = 10*10*Calculator4.pi;		//객체가 없어도 실행이 가능하다
		int result2 = Calculator4.plus(10,5);
		int result3 = Calculator4.minus(10,5);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
