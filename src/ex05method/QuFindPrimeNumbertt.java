package ex05method;

public class QuFindPrimeNumbertt
{

	public static void main(String[] args)
	{
		// int num = 7; // 7이 소수인지 판단하기위한 테스트
				// 1~100까지의 정수중 소수인지 판단하는 로직
				for (int num = 1; num <= 100; num++)
				{
					boolean result = isPrimeNumber(num);
					if (result == true)
					{
						System.out.println("소수:" + num);
					}
				}
			}
			public static boolean isPrimeNumber(int n)
			{
				// 정수 7일때 소수인지 판단하는 로직(2~6까지 나눠보면됨)-테스트
				
				
				//정수 1은 소수가 아니므로 무조건 flase 반환
				if(n==1) return false;
				
				//정수 n일때는 n-1까지 나눠보면 됨
				for (int i = 2; i <= (n-1); i++)
				{
					// 만약 1과 자신을 제외한 숫자로 나누어 떨어지면 소수가 아닌것으로 판단
					if (n % i == 0)
					{
						return false;
					}
				}
				// 위의 반복문을 벗어나면 소수로 판단한다.
				return true;

	}

}
