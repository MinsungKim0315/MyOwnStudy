package studying.조건문과반복문;

public class Stars {

	public static void main(String[] args) {
		//*
		//**
		//***
		//****
		for(int i=1;i<5;i++) {         //몇 번째 줄
			for(int j=1;j<=i;j++) {    //*개수
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
					System.out.print(" "); //i=1 -> j=4,3,2  3개 이므로 " "3개 생성  j=2은 else에 해당함
				}
				else {
					System.out.print("*"); 
				}
			}
			System.out.println();
		}
	}
}
