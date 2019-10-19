package classproj;

public class Ex03 {
	
	public static void calc(int a, int b, char op) { // 매개변수 3개
		switch (op) {
		case '+' :
			System.out.println(a+ "+"+b+"="+(a+b));
			break;
		case '-' :
			System.out.println(a+ "-"+b+"="+(a-b));
			break;
		case '*' :
			System.out.println(a+ "*"+b+"="+(a*b));
			break;
		case '/' :
			System.out.println(a+ "/"+b+"="+((double)a/b));
			break;
		default : System.out.println("알수없는 연산입니다.");
		}
	}

	public static void main(String[] args) {
		calc(10, 20, '+'); // calc method 호출
		calc(20, 30, '/'); // calc method에 전달하는 값: 인수, 인자, argument, parameter

	}

}
