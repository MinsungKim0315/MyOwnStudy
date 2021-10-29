package studying.조건문과반복문;

public class SumOfNumbers {

	public static void main(String[] args) {
	//1~100까지 합
		int sum = 0;
		int i = 0; //변수 i를 for문 밖에서도 사용가능하다
		
		for(i=1;i<=100;i++) {  //i가 for문에서만 필요하다면 for(int i=1;1<=100;i++)로 쓰면 된다
			sum+=i;
		}
		System.out.println("1~100 sum: " + sum);
		/*or*/
		System.out.println("1~" + (i-1) + " sum: " + sum);
		
		while(i<+100) {   //while문 이용하기
			sum+=1;
			i++;
		}
		System.out.println("1~"+(i-1) + " sum: "+ sum);
	}
}
