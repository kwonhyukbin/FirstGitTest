package ex04controlstatement;

/*
 if문
     형식2
         if(조건문){
                조건문이 참일때 실행문장;
                }
                else{
                    조건문이 거짓일때 실행문장;
                    }
 */
public class E01If02 {

	public static void main(String[] args) {
		int num = 1019;

		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}

		/*
		 * 삼항연산자(조건연산자) if~else문과 동일하지만 짧은코드로 포현이 가능하므로 실무에서 자주 사용되는 연산자이다. 형식] 변수 =
		 * (조건식) ? 참일때값 : 거짓일때값 ;
		 */
		String numberResult = (num % 2 == 0) ? "짝수임" : "홀수임";
		System.out.println("숫자" + num + "은" + numberResult);

		/*
		 * 시나리오] 숫자를 홀/짝인지 먼저 판단한 후 100이상인지를 판단하는 프로그램을 if~else문으로 작성하시오.
		 */

		int num2 = 120;
		if (num2 % 2 == 0) { // 짝수일때..
			if (num2 >= 100) { // 100이상인지 판단
				System.out.println("짝수이면서 100이상");
			} else {
				System.out.println("짝수이면서 100미만");
			}
		}   else { // 홀수일때...
					// 실행문장이 하나일때는 중괄호 생략이 가능하다.

			if (num2 >= 100) {
				System.out.println("홀수이면서 100이상");
			} else {
				System.out.println("홀수이면서 100미만");
			}
		}
	}
}
