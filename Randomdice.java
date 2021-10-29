package studying.조건문과반복문;

public class Randomdice {
	public static void main(String[] args) {
	int num = (int)(Math.random()*6) + 1;
//if문을 사용해서 만든 주사위 프로그램	
	if(num==1) {
		System.out.println("1");
		}else if(num==2) {
		System.out.println("2");
		}else if(num==3) {
		System.out.println("3");
		}else if(num==4) {
		System.out.println("4");
		}else if(num==5) {
		System.out.println("5");
		}else {
		System.out.println("6");
		}
//switch문을 사용해서 만든 주사위 프로그램	
	switch(num) {
	case 1:
		System.out.println("1");
		break;
	case 2:
		System.out.println("2");
		break;
	case 3:
		System.out.println("3");
		break;
	case 4:
		System.out.println("4");
		break;
	case 5:
		System.out.println("5");
		break;
	default:
		System.out.println("6");
		break;
	}
	}
}