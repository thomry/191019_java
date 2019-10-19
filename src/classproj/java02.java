package classproj;

public class java02 {
	
	// show method 정의
	public static void show(int[] jackPot) {
		for(int i = 0; i<jackPot.length; i++) {
			System.out.println(jackPot[i]);
		}
	}
	
	public static void main(String[] args) {
		
		int[] jackPot = {3, 6, 8, 12, 45, 2};
		
		show(jackPot); // show method 호출

	}

}
