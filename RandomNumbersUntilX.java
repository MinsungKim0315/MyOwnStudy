package studying.���ǹ����ݺ���;

public class RandomNumbersUntilX {
	//6�� ���ö����� ���� ����
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
