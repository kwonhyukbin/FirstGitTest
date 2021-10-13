package ex04controlstatement;

import java.io.IOException;
/*
 if문(조건문)
    형식1
        if(조건문){
                실행문장;
                }
       -if문의 조건문은 반드시 비교식 혹은 논리식이어야 한다.
       -즉 결과값이 boolean형으로 true or false를 반환해야한다.
       -실행할 문장이 하나인 경우 중괄호 생략이 가능하다.          
 */
public class E01If01 
{

	public static void main(String[] args) throws IOException
	{
		int num=10;
		
		//아래 문장은 조건식이 아닌 산술식이므로 에러가 발생한다.
//		if(num%2) {
//			System.out.println("잘못된 조건식입니다.");
//		}
//        if(num) {
//        	System.out.println("이것도 잘못된 조건식입니다.");
//        }
		//if문의 조건은 아래와 같이boolean값을 반환하는 조건식이어야 한다.
        if(num%2==0) {
        	System.out.printf("%d는 짝수입니다", num);
        }
        if(num%2==0 && num>=10)  {
        	System.out.printf("%n%d는 짝수이고 10보다"
        			+ "크거나같다.%n", num);
        	//경우에 따라 무조건 실행되는 if문도 필요하다.
        if(true) {
        	System.out.println("무조건 실행되는 if문입니다.");
        }
        /*
         * if(조건식);
          => 조건식에 상관없이 다음 문장이 실행되는 형태로 세미콜론은
          문장의 끝을 나타내므로 사용에 주의해야 한다.
         */
        if(num%2 !=0);
        {
        	System.out.printf("%d는 홀수입니다.", num);
        		
        }
        /*
         조건검사 후 실행할 문장이 1개인 경우에는{}(중괄호)를 생략할수있다.
         단, 실행문이 2개 이상인 경우에는 한 문장만 실행되므로 반드시 중괄호를
         작성해야 한다.
         */
        if(num%2 == 0)
        	System.out.println("\n"+num+"은 짝수이다");
        if(num%2 != 0) {
        	System.out.println("num은"+ num +"입니다.");
        	System.out.println(num+"은 홀수입니다.");
        }
        	
        }
        
        /*
         시나리오 ] 사용자가 입력한 문자가 숫자인지 판단하는 프로그램을
         if문을 이용해서 작성하시오.
         */
      
        
        
        
        System.out.println("하나의 문자를 입력하세요");
        int asciiCode = System.in.read();
        System.out.println("입력한 문자는:"+ asciiCode);
        
        /*
         아스키코드를 알고있을때의 구현방법
         '0'=>48,'9'=>57 이므로 해당 구간안에 있다면 숫자로 판단할 수 있다.
         */
        if(asciiCode>=48 && asciiCode<=57) { //~이상 ~이하 일때 사용 &&
        	System.out.println("입력한 문자는 숫자입니다.");
        }
        else {
        	System.out.println("입력한 문자는 숫자가 아닙니다.");
        }
        // 아스키 코드를 모를때 구현방법
        }
        
        
        
        
        
        
	}


