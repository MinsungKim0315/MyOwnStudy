package studying.����Ÿ��;

public class CopyArray {

	public static void main(String[] args) {
		
		int[] oldIntArray = {1,2,3};
		
		int[] newIntArray = new int[5];    //�迭�� �� �� �����ϸ� ũ�⸦ ������ �� ���� ������ �� ���� ���� ������ �ʿ��ϴٸ� �� ū �迭�� ���� ����� ���� �迭�κ��� �׸� ������ �����ؾ��Ѵ�
		
		for(int i=0;i<oldIntArray.length;i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int i=0;i<newIntArray.length;i++) {
			System.out.print(newIntArray[i] + ",");
		}
		
System.out.println(); //-------------------------------------

		String[] oldStrArray = {"java", "array", "copy"};
		
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length); //System.arraycopy(���� �迭 ��, ���� �迭���� �ϻ��� �׸��� ���� �ε���, �� �迭 ��, �� �迭���� �ٿ����� ���� �ε���, ������ ����)
		
		for(int i=0;i<newStrArray.length;i++) {
			System.out.print(newStrArray[i] + ",");
		}
	}

}
