package studying.Ŭ����;		//�ٸ� ������ ȣ��: this()

public class Car3 {

	String company = "Hyundai";
	String model;
	String color;
	int maxSpeed;
	
	Car3(){}
	Car3(String model){
		this(model, "silver", 250);						//�ߺ� �ڵ� ���̱�
		}
	Car3(String model, String color){					//�ߺ� �ڵ� ���̱�
		this(model, color, 250);
		}
	Car3(String model, String color, int maxSpeed){		
		this.model = model;								//���� ���� �ڵ�
		this.color = color;								//���� ���� �ڵ�
		this.maxSpeed = maxSpeed;						//���� ���� �ڵ�
	}
	
	public static void main(String[] args) {
		Car3 car1 = new Car3();						
		System.out.println(car1.company);
		System.out.println();
		
		Car3 car2 = new Car3("�ڰ���");				
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println();
		
		Car3 car3 = new Car3("�ý�", "���");			
		System.out.println(car3.company);
		System.out.println(car3.model);
		System.out.println(car3.color);
		System.out.println();
		
		Car3 car4 = new Car3("���ֿ�", "����", 300);	
		System.out.println(car4.company);
		System.out.println(car4.model);
		System.out.println(car4.color);
		System.out.println(car4.maxSpeed);
		System.out.println();

	}

}
