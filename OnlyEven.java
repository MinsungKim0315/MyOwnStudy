package studying.조건문과반복문;

public class OnlyEven {

	public static void main(String[] args) {
		for(int i = 1;i<=20;i++) {
			if(i%2 != 0) {
				continue;    //특정 조건이 충족되지 않으면 반복문을 종료 시키지 않고 계속 반복 수행 시킨다
			}
			System.out.println(i);
		}
	}
}
