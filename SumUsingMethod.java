package studying.Ŭ����;			//�޼ҵ�, �Ű� ������ ������ �� ���

public class SumUsingMethod {

	int sum1(int[] values) {
		int sum = 0;
		for(int i=0;i<values.length;i++) {
			sum +=values[i];
		}
		return sum;
	}
	
	int sum2(int ...values) {
		int sum = 0;
		for(int i=0;i<values.length;i++) {
			sum +=values[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		SumUsingMethod mySum = new SumUsingMethod();
		
		int[] values1 = {1, 2, 3};
		int result1 = mySum.sum1(values1);
		System.out.println(result1);
		
		int result2 = mySum.sum1(new int[] {1,2,3,4,5});
		System.out.println(result2);
		
		int result3 = mySum.sum2(1,2,3);
		System.out.println(result3);
		
		int result4 = mySum.sum2(1,2,3,4,5);
		System.out.println(result4);
	}

}
