package studying.Ŭ����;			//�������� �����ε�

public class Car2 {

	String company = "Hyundai";
	String model;
	String color;
	int maxSpeed;
	
	Car2(){}                                             //������1
	Car2(String model){									 //������2
		this.model = model;
	}
	Car2(String model, String color){					 //������3
		this.model = model;
		this.color = color;
	}
	Car2(String model, String color, int maxSpeed){		 //������4
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public static void main(String[] args) {
		
		Car2 car1 = new Car2();						//������1 ����
		System.out.println(car1.company);
		System.out.println(car1.model); //NULL ���� 
		System.out.println();
		
		Car2 car2 = new Car2("�ڰ���");				//������2 ����
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println();
		
		Car2 car3 = new Car2("�ڰ���", "����");			//������3 ����
		System.out.println(car3.company);
		System.out.println(car3.model);
		System.out.println(car3.color);
		System.out.println();
		
		Car2 car4 = new Car2("�ڰ���", "����", 200);	//������4 ����
		System.out.println(car4.company);
		System.out.println(car4.model);
		System.out.println(car4.color);
		System.out.println(car4.maxSpeed);
		System.out.println();
	}

}
