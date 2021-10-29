package studying.조건문과반복문;

public class RandomNumbersUntilX {
	//6이 나올때까지 난수 생성
	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random() * 100) + 1;
			System.out.println(num);
			if(num==6) {
				break;
			}
		}
		System.out.println("exit program");
	}

}
