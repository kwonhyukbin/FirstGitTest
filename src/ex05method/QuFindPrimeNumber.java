package ex05method;

/*
 전달된 값이 소수인지 아닌지를 판단하여 소수인 경우 true를 아니면 false를 반환하는
  메소드를 정의하고, 이를 이용해서 1부터 100사이의 소수를 전부 출력하는 main메소드를 정의하자.
메소드명 : isPrimeNumber()
소수란 : 특정 정수를 나눌수 있는것이 1과 자기자신밖에 없는 수.


 */
public class QuFindPrimeNumber
{

	public static void main(String[] args)
	{
		for (int i = 1; i <= 100; i++)
		{
			boolean result = isPrimeNumber(i);
			if (result == true)
			{
				System.out.println("소수는" + i);
			}
		}
	}

	public static boolean isPrimeNumber(int n)
	{
		if (n==1) {
			return false;
		}
     for(int i =2;i <=(n-1);i++) {
    	 if(n % i==0) {
    		 return false;
    	 }
    	
     }
		

     return true;
	}
	
}
