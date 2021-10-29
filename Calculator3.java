package studying.클래스;		//메소드, 메소드 오버로딩

public class Calculator3 {
											//메소드 오버로딩
	double areaRectangle(double width) {				//정사각형 넓이
		return width*width;
	}
	
	double areaRectangle(double width, double height) {	//직사각형 넓이
		return width*height;
	}
	
	public static void main(String[] args) {
	
		Calculator3 myCalc = new Calculator3();
		
		double result1 = myCalc.areaRectangle(10);		//정사각형 넚이
		
		double result2 = myCalc.areaRectangle(10, 20);	//직사각형 넓이
		
		System.out.println("정사각형 넓이: " + result1);
		System.out.println("직사각형 넓이: " + result2);

	}

}
