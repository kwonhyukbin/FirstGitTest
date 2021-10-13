package ex05method;

import java.util.Scanner;
/*
 시나리오] 여러개의 숫자를 입력받은후 최대값을 구하는
 메소드를 정의하시오.단, 숫자의 개수는 매개변수로 전달받고
 숫자의 갯수만큼 Scanner클래스를 통해 입력받는다.
 입력받은 숫자중 최대값을 찾아서 반환하도록 정의한다.
 */
public class E05MethodType04_2 {

	public static void main(String[] args) {
		// 정수 4개중 최대값 찾기
		int maxValue1 = returnMaxNumber(4);
		System.out.println("최대값1:" + maxValue1);

		int maxValue2 = returnMaxNumber(6);
		System.out.println("최대값2:" + maxValue2);

	}

	// main에서 전달한 인자 4는 매개변수 numberCnt가 받아서 사용함.
	static int returnMaxNumber(int numberCnt) {
		Scanner scanner = new Scanner(System.in);
		// 최대값을 저장하기 위한 변수 선언
		int maxVal = 0;
		// 매개변수로 전달된 인자만큼 반복 입력받음
		for (int i = 1; i <= numberCnt; i++) {
			System.out.print("정수를 입력하세요");
			int inputNum = scanner.nextInt();

			if (i == 1) {
				// 입력받은 정수 중 첫번째값을 기준값으로 설정한다.
				maxVal = inputNum;// 첫번째값을 일단 최대값으로 지정한다.

			} else {
				// 두번째 입력부터는 기준값인 maxVal과 입력값을 비교한다.
				if (maxVal < inputNum) {
					// 만약 maxVal보다 입력값이 크다면 입력값으로 교체한다.
					maxVal = inputNum;
				}
				//maxVal이 더 크다면 기존값을 유지하면 되므로 else는 필요없다.
			}
		}
		return maxVal;
	}

}
