package ex07string;

import java.util.Scanner;

public class QuValidateIdtt
{
	
	
		public static boolean idValidate(String inputId)
		{
			// 아이디 유효성 검증 확인용 변수
			boolean idOk = true;
			// 아이디의 길이 확인(8~12자)
			if (inputId.length() >= 8 && inputId.length() <= 12)
			{
				// 영문,숫자의 조합인지 확인
				// 입력한 아이디의 길이만큼 반복해서...
				for (int i = 0; i < inputId.length(); i++)
				{
					// 각 문자가 영문 or 숫자인지 확인한다.
					char idChr = inputId.charAt(i);
					if ( !( (inputId.charAt(i) >= 'a' && idChr <= 'z') || (idChr >= 'A' && idChr <= 'Z')
							|| (idChr >= '0' && idChr <= '9')  )  )
					{
						//아이디가 영문 + 숫자 조합이 아니라면 false로 처리한다.
	                 idOk = false;
	                 //반복문을 탈출한다.
	                 break;
					}
				}
				 
			}
			else {
				idOk =false;
			}
			return idOk;
		}

		public static void main(String[] args)
		{
			Scanner scanner = new Scanner(System.in);
			System.out.print("아이디를 입력하세요:");
			String id = scanner.nextLine();
			boolean isOK = idValidate(id);
			if (isOK == true)
				System.out.println("사용가능한 아이디입니다.");
			else
				System.out.println("아이디 제대로 입력해");
		}
		
}
