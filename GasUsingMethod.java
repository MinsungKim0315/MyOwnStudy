package studying.Ŭ����;		//�޼ҵ�, return��

public class GasUsingMethod {
	
	int gas;				//�ʵ�
	
	void setGas(int gas) {	//�޼ҵ�
		this.gas = gas;		//���ϰ��� ���� �޼ҵ�� �Ű����� �޾Ƽ� gas �ʵ尪�� ����
	}
	
	boolean isLeftGas() {	//���ϰ��� boolean�� �޼ҵ�� gas �ʵ尪�� 0�̸� false��, 0�� �ƴϸ� true�� ����
		if(gas == 0) {
			System.out.println("not enough gas");
			return false;	//false�� ����
		}
		System.out.println("enough gas");
		return true;		//true�� ����
	}
	
	void run() {			//���ϰ��� ���� �޼ҵ�� gas �ʵ尪�� 0�̸� return������ �޼ҵ� ���� ����
		while(true) {
			if(gas>0) {
				System.out.println("keep going.(gas rate:" + gas + ")");
				gas -=1;
			}else {
				System.out.println("stop going.(gas rate:" + gas + ")");
				return;		//�޼ҵ� ���� ����
			}
		}
	}
	public static void main(String[] args) {
		
		GasUsingMethod myGas = new GasUsingMethod();
		
		myGas.setGas(10);	//setGas() �޼ҵ� ȣ��
		
		boolean gasState = myGas.isLeftGas();	//isLeftGas() �޼ҵ� ȣ��
			if(gasState) {
				System.out.println("go.");
				myGas.run();	//run() �޼ҵ� ȣ��
			}
			
			if(myGas.isLeftGas()) {	//isLeftGas() �޼ҵ� ȣ��, if���ȿ� �޼ҵ� ȣ���� �� �ִµ� �̰��� ������ ������ idLeftGas() �޼ҵ尡 boolean ���� �����ϱ� �����̴�.
				System.out.println("need more gas.");
			}else {
				System.out.println("fill in gas");
			}
		}
	}
