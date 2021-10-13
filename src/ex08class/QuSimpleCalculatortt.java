package ex08class;

class CalculatorEx {
	
	//계산의 횟수 카운트위한 멤버변수
	int addNum;
	int minNum;
	int mulNum;
	int divNum;
	//멤버변수 초기화 메서드
	
	void init() {
		 addNum=0;
		 minNum=0;
		 mulNum=0;
		 divNum=0;
		
	}
	//사칙연산 수행
	double add(double num1, double num2) {
		addNum++;
		return num1 + num2;
	}
	double min(double num1, double num2) {
		minNum++;
		return num1 - num2;
	}
	double mul(double num1, double num2) {
		mulNum++;
		return num1 * num2;
	}
	double div(double num1, double num2) {
		divNum++;
		return num1 / num2;
	}
	void showOpCount(){
		
		System.out.println("덧셈횟수:"+ addNum);
		System.out.println("뺄셈횟수:"+ minNum);
		System.out.println("곱셈횟수:"+ mulNum);
		System.out.println("나눗셈횟수:"+ divNum);
	}
	
}

public class QuSimpleCalculatortt
{

	public static void main(String[] args)
	{
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();

	}

}
