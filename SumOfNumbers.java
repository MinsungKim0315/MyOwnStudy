package studying.���ǹ����ݺ���;

public class SumOfNumbers {

	public static void main(String[] args) {
	//1~100���� ��
		int sum = 0;
		int i = 0; //���� i�� for�� �ۿ����� ��밡���ϴ�
		
		for(i=1;i<=100;i++) {  //i�� for�������� �ʿ��ϴٸ� for(int i=1;1<=100;i++)�� ���� �ȴ�
			sum+=i;
		}
		System.out.println("1~100 sum: " + sum);
		/*or*/
		System.out.println("1~" + (i-1) + " sum: " + sum);
		
		while(i<+100) {   //while�� �̿��ϱ�
			sum+=1;
			i++;
		}
		System.out.println("1~"+(i-1) + " sum: "+ sum);
	}
}
