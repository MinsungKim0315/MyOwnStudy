package studying.참조타입;

public class Array {

	public static void main(String[] args) {
		
		int[] scores1 = {83, 90, 87};
		
		System.out.println("scores1[0]=" + scores1[0]);
		System.out.println("scores1[1]=" + scores1[1]);
		System.out.println("scores1[2]=" + scores1[2]);
		
		int sum1 = 0;
		for(int i = 0;i<3;i++) {
			sum1 += scores1[i];
		}
		
		System.out.println("sum1=" + sum1);
		double avg = (double) sum1/3;
		System.out.println("avg=" + avg);
		
//------------------------------------------------------------		
System.out.println("---------------------------");		

		int[] scores2;
		scores2 = new int[] {83, 90, 87};    //배열 변수를 미리 선언한 후 값 목록들이 나중에 결정되는 상황이면 new연사자 사용  intArray = new int[] {...};
		int sum2 =0;
		for(int k = 0;k<3;k++) {
			sum2 += scores2[k];
		}
		
		System.out.println("sum=" + sum2);
		System.out.println("avg=" + avg);
		
//-------------------------------------------------------------		
System.out.println("---------------------------");
		
		int[] scores3;
		scores3 = new int[] {83, 90, 87, 12, 34, 45, 65, 26, 98, 34, 56};
		int sum3 = 0;
		for(int i = 0;i<scores3.length;i++) {   //배열 길이 나타낼 때 intArray.length; 사용
			sum3 += scores3[i];
		}
		double avg1 = (double) sum3/11;
		System.out.println("sum=" + sum3);
		System.out.println("avg=" + avg1);
		
//--------------------------------------------------------------
System.out.println("---------------------------");

		int[] arr1 = new int[3];   //값의 목록을 가지고 있지 않지만, 향후 값들을 저장할 배열을 미리 만들고 싶다면 new 연산자로 배열 객체를 생성할 수 있다 int[] intArray = new int[length];
		for(int i=0;i<3;i++) {
			System.out.println("arr1[" + i + "]: " + arr1[i]);
		}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0;i<3;i++) {
			System.out.println("arr1[" + i + "]: " + arr1[i]);
		}

//--------------------------------------------------------------
System.out.println("---------------------------");

		int scores4[] = {95, 71, 84, 93, 87};
		int sum4 = 0;
		for (int score : scores4) {    //향산된 for문 for(배열에서 꺼낸 항목을 저장할 변수 션언:배열)
			sum4 = sum4 + score;
		}
		System.out.println("점수 총합= " + sum4);
		
		double avg2 = (double) sum4 / scores4.length;
		System.out.println("점수 평균= " + avg2);
	}
}