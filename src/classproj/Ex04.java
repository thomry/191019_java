package classproj;


public class Ex04 {
	
	public static String calc(int a, int b, char op) { // 매개변수 3개
		int result =0;
		switch (op) {
		case '+' :
			result = a+b;
			break;
		case '-' :
			result = a-b;
			break;
		case '*' :
			result = a*b;
			break;
		case '/' :
			result = a/b;
			break;
		default : System.out.println("알수없는 연산입니다.");
		}
		return "" + a + op + b + "="+ result;
	}

	public static void main(String[] args) {
		
		String result = calc(10, 20, '+');
		System.out.println(result);

	}

}
