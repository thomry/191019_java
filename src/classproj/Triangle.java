package classproj;

public class Triangle {
	// field
	
	int width;
	int height;
	
	// method
	double area() {
		return width * height * 0.5;
		// return width * height / 2.0
	}
	
	void setFields(int w, int h) {
		width  = w;
		height = h;
	}
	
	void output() {
		System.out.println("너비= "+width);
		System.out.println("높이= "+height);
		System.out.println("넓이= "+area());
	}

}
