package studying.클래스;		//메소드, return문

public class GasUsingMethod {
	
	int gas;				//필드
	
	void setGas(int gas) {	//메소드
		this.gas = gas;		//리턴값이 없는 메소드로 매개값을 받아서 gas 필드값을 변경
	}
	
	boolean isLeftGas() {	//리턴값이 boolean인 메소드로 gas 필드값이 0이면 false를, 0이 아니면 true를 리턴
		if(gas == 0) {
			System.out.println("not enough gas");
			return false;	//false를 리턴
		}
		System.out.println("enough gas");
		return true;		//true를 리턴
	}
	
	void run() {			//리턴값이 없는 메소드로 gas 필드값이 0이면 return문으로 메소드 강제 종료
		while(true) {
			if(gas>0) {
				System.out.println("keep going.(gas rate:" + gas + ")");
				gas -=1;
			}else {
				System.out.println("stop going.(gas rate:" + gas + ")");
				return;		//메소드 실행 종료
			}
		}
	}
	public static void main(String[] args) {
		
		GasUsingMethod myGas = new GasUsingMethod();
		
		myGas.setGas(10);	//setGas() 메소드 호출
		
		boolean gasState = myGas.isLeftGas();	//isLeftGas() 메소드 호출
			if(gasState) {
				System.out.println("go.");
				myGas.run();	//run() 메소드 호출
			}
			
			if(myGas.isLeftGas()) {	//isLeftGas() 메소드 호출, if문안에 메소드 호출이 들어가 있는데 이것이 가능한 이유는 idLeftGas() 메소드가 boolean 값을 리턴하기 때문이다.
				System.out.println("need more gas.");
			}else {
				System.out.println("fill in gas");
			}
		}
	}
