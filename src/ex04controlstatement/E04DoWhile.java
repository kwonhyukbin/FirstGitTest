package ex04controlstatement;

import java.io.IOException;
import java.util.Scanner;

/*
 do~while문
    : 반드시 한번은 실행해야 할 경우 사용하는 반복문.
    즉 조건검사없이 무조건 한번은 실행된다.
    형식]
        반복을위한변수;
        do{
            실행문장;
            반복문 탈출을 위한 증감식;
            }while(조건식);
 */
public class E04DoWhile {
	public static void main(String[] args) throws IOException {
		/*
		 * 시나리오] E03 예제의 1~10까지 더하는 
		 * 수열문제를 do~while문으로 변경하여 구현하시오.
		 */
		int sum = 0;// 합의 초기화
		int i = 1;// 반복을 위한 변수
		do { // 조건확인 없이 무적권 1번 실행
			sum += i; // 증가하는 변수 i를 누적해서 더함
			i++; // i를 증가시킴 반복문 탈출을 위함
		} while (i <= 10);// 탈출을 위한 조건체킹
		System.out.println("1~10까지의 누적합:" + sum);
		/*
		 * 시나리오]1부터 1000까지의 정수중 4의배수이거나 7의 배수인 수의 합을 구하여 출력하는 프로그램을 작성하시오. 단,
		 * do~while문을사용해야 한다.
		 */
		int total = 0; // 합을 구하기 위한 변수
		int j = 1; // 반복을 위한 변수
		do { // 조건검사 없이 진입
			if (j % 4 == 0 || j % 7 == 0) { // 4 또는 7의 배수일때..
				// System.out.println("j=" + j); //배수 확인용 출력
				total += j; // 증가하는 j의 값을 누적해서 더함
			}
			j++;
		} while (j <= 1000); // 탈출 조건 확인
		System.out.println("1~1000사이의 4 or7의 배수합:" + total);

		/*
		 * 시나리오] 국어,영어,수학 점수를 사용자로부터 입력받은 후 평균을 구해
		 *  A~F학점을 판단하여 출력하는 프로그램을 작성하시오. 단, 사용자가
		 * X,x(대소문자 구분없음)를 입력하면 
		 * 프로그램이 종료되어야 하며 do~while문으로 구현해야한다.
		 */
		
		//사용자로부터 키보드를 통해 입력값을 받기 위한 클래스
		Scanner scanner = new Scanner(System.in);
		//국,영,수,평균 점수를 입력하기 위한 변수
		int kor, eng, math, avg;
		//문자를 입력받기 위한 변수
		int exitCode;
		do {
			//국,영,수 점수를 정수형으로 입력받음
			System.out.print("국어점수:");
			kor = scanner.nextInt();
			System.out.print("영어점수:");
			eng = scanner.nextInt();
			System.out.print("수학점수:");
			math = scanner.nextInt();
            
			/*
			 평균점수의 구간을 정하기 위해 10으로 나눠주는 연산을 진행한다.
			 switch문은 조건식을 쓸수 없고 산술식만 쓸수 있기 때문에
			 99점이나 91점을 10으로 나눴을때의 몫이 9라는 사실을 통해
			 구간을 대체하는 산술결과를 얻을 수 있다.
			 */
			avg = (kor + eng + math) / (3 * 10);
			switch (avg) {
			case 10:case 9:
				System.out.println("A학점");break;
			case 8:
				System.out.println("B학점");break;
			case 7:
				System.out.println("C학점");break;
			case 6:
				System.out.println("D학점");break;
			default:
				System.out.println("F학점");
				break;
			}
			System.out.println("종료하려면 x(X)를 입력하세요!");
			System.out.println("계속하려면 아무키나 입력하세요!");
			exitCode = System.in.read();
		} while (!(exitCode == 'x' || exitCode == 'X'));
        /*
         X를 입력한 경우
          : ! (false) || (true) => !(true) => false 반환
            do~while문을 탈출한다.
         a를 입력한 경우
          : ! (false) || (false) => !(false) => true 반환       
            do~ while문을 반복한다.
         */
	}
}
