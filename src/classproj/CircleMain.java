package classproj;

public class CircleMain {

	public static void main(String[] args) {
		// Circle 생성 방법
		// Circle 클래스를 통해 "객체(인스턴스)"를 생성하는 방법
		
		
		Circle circle = new Circle(); // circle : 객체(인스턴스)
		
		circle.setFields(1.5, "야구공");
		circle.output();

	}

}
