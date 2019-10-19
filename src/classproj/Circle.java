package classproj;

// 멤버
// 변수+메소드
// 필드+메소드

public class Circle {
	//Field
		double radius;
		String name;
		
		// Method
		double area() {
			return 3.14 * radius * radius;
		}
		
		void setFields(double r, String n) {
			radius = r;
			name   = n;
		}
		
		void output() {
				System.out.println("반지름= " + radius);
				System.out.println("넓이= " + area());
				System.out.println("이름= " + name);
		}

}
