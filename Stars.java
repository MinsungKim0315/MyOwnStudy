package studying.���ǹ����ݺ���;

public class Stars {

	public static void main(String[] args) {
		//*
		//**
		//***
		//****
		for(int i=1;i<5;i++) {         //�� ��° ��
			for(int j=1;j<=i;j++) {    //*����
				System.out.print("*");
				if(j==i) {
					System.out.println();
				}
			}
			
		}
		//   *
		//  **
		// ***
		//****
		for(int i=1;i<5;i++) {
			for(int j=4;j>0;j--) {
				if(i<j) {
					System.out.print(" "); //i=1 -> j=4,3,2  3�� �̹Ƿ� " "3�� ����  j=2�� else�� �ش���
				}
				else {
					System.out.print("*"); 
				}
			}
			System.out.println();
		}
	}
}
