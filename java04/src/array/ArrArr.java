package array;

public class ArrArr {
	public static void main(String[] args) {
		// 2차원 배열
		// 배열을 전체 사용(출력)하려면 반복문을 사용
		// 2차원 배열을 전체 사용하려면 이중반복문을 사용

		int second_arr[][] = { { 10, 20 }, { 100, 200 } };// 2행2열 배열
		for (int i = 0; i < second_arr.length; i++) {
			for (int j = 0; j < second_arr[i].length; ++j) {
				System.out.println(second_arr[i][j]);
			}
		}
		
		//배열 꺼내기
		System.out.println("===================");
	
		System.out.println(second_arr[0][1]);//0번째 방에서 (0.1)중 1번째 꺼내기 =>20
		System.out.println(second_arr[1][0]);//1번째 방에서 (0.1)중 0번째 꺼내기 >100
	}
}
