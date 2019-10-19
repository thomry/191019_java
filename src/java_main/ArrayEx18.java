package java_main;

public class ArrayEx18 {

	public static void main(String[] args) {
		
		//2차원 배열 사용해보기
		
		int[][] score = {
				{100, 100, 100}
				,{20, 20, 20}
				,{30, 30, 30}
				,{40, 40, 40}
		};
		int sum = 0;
		
		for(int i =0; i < score.length; i++) { // 점수 출력 반복문
			for(int j = 0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d] = %d%n", i, j, score[i][j]);
			}
		}
		
		for(int[] tmp : score) { // 총 점수 계산할 반복문. score의 각 요소를 tmp에 저장
			for (int i : tmp) {  // tmp는 1차원 배열을 가리키는 참조변수
				sum += i;
			}
		}
		
		System.out.println("sum="+sum);

	}

}
