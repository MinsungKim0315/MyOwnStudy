package studying.참조타입;

public class CopyArray {

	public static void main(String[] args) {
		
		int[] oldIntArray = {1,2,3};
		
		int[] newIntArray = new int[5];    //배열은 한 번 생성하면 크기를 변경할 수 없기 때문에 더 많은 저장 공간이 필요하다면 더 큰 배열을 새로 만들고 이전 배열로부터 항목 값들을 복사해야한다
		
		for(int i=0;i<oldIntArray.length;i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int i=0;i<newIntArray.length;i++) {
			System.out.print(newIntArray[i] + ",");
		}
		
System.out.println(); //-------------------------------------

		String[] oldStrArray = {"java", "array", "copy"};
		
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length); //System.arraycopy(원본 배열 명, 원본 배열에서 북사할 항목의 시작 인덱스, 새 배열 명, 새 배열에서 붙여넣을 시작 인덴스, 복사할 개수)
		
		for(int i=0;i<newStrArray.length;i++) {
			System.out.print(newStrArray[i] + ",");
		}
	}

}
