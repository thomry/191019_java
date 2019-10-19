package classproj;

import java.util.Scanner;

public class Ex05 {
	
	public static int input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요. >>");
		int input = scanner.nextInt(); // 입력받은 내용을 input에 저장
		scanner.close();
		return input;
	}
	
	public static void output(int a) {
		System.out.println("입력받은 정수는 "+a+"이다.");
	}

	public static void main(String[] args) {
		
		/* 실행 예
		 * 정수 입력 >> 10
		 * 입력받은 정수는 10이다.
		 */

		int number = input();
		output(number);
	}

}
