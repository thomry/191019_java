package classproj;

public class Trimain {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		
		// 하드코딩 - 곧 사용못함
		t1.width  = 2;
		t1.height = 3;
		
		t1.output();
		
		// 자연스럽.
		t1.setFields(1, 3);
		t1.output();

	}

}
