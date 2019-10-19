package classproj;

import java.util.Scanner; // java.lang을 제외한 패키지의 클래스는 import 후에 사용이 가능

public class Ex01 {
	
	/*
	 * Method
	 * 1. 자판기
	 * 커피 자판기(돈){
	 * 	return 아메리카노;
	 * 2. 오락기
	 * 오락기(돈){
	 * 	return 없음;
	 * 메소드 일반화
	 * 1) 메소드 정의 : 메소드를 만든다.
	 * 2) 메소드 호출 : 메소드를 사용한다.
	 */
	
	//메소드 정의부
	// 3000원이면 아메리카노, 4000원이면 라떼
	public static String coffeeMachine(int money) {
		String coffee = null;
		if (money == 3000) {
			return "아메리카노";
		}else if (money == 4000) {
			return "카페라떼";
		}
		return coffee;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("돈을 넣으세요 >> ");
		int money = scanner.nextInt();
		
		String coffee = coffeeMachine(money);
		System.out.println("주문한 커피는 "+coffee+ "이다.");
		
		scanner.close();

	}

}
