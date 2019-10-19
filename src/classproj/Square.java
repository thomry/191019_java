package classproj;

public class Square {
	//field
	int width;
	int height;
	
	//method
	int area() {
		return width * height;
	}
	
	void output() {
		System.out.println("너비= "+width);
		System.out.println("높이= "+height);
		System.out.println("넓이= "+area());
	}

}
