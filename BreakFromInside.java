package studying.���ǹ����ݺ���;

public class BreakFromInside {
	public static void main(String[]args) {
		
		//��ø�� �ݺ������� �ٱ��� �ݺ��� �����Ű��
		Outter: for(char upper = 'A';upper<='Z';upper++) {    //Outter�� �ܼ��� �̸�
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