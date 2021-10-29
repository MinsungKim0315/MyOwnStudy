package studying.조건문과반복문;

public class BreakFromInside {
	public static void main(String[]args) {
		
		//종첩된 반복문에서 바깥쪽 반복문 종료시키기
		Outter: for(char upper = 'A';upper<='Z';upper++) {    //Outter는 단순한 이름
			for(char lower = 'a';lower<='z';lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='y') {
					break Outter;
					}
				}
		}
	System.out.println("exit program");
	}
}