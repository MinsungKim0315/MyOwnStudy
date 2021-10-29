package studying.클래스;			//메소드, 클래스 내부에서 메소드 호출

public class Calculator2 {
													//객체 내부에서 호출
	int plus(int x, int y) {//-------------1
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {//-----------2
		double sum = plus(x, y);//1호출
		double result = sum/2;
		return result;
	}
	
	void execute() {//---------------------3
		double result = avg(7,10);//2호출
		println("실행결과: " + result);//4호출
	}
	
	void println(String message) {//-------4
		System.out.println(message);
	}
	
	public static void main(String[] args) {
	
		Calculator2 myCalc = new Calculator2();
		myCalc.execute();//execute() 메소드 호출
	}

}
