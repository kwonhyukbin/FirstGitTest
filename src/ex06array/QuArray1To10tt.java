package ex06array;

public class QuArray1To10tt
{

	public static void main(String[] args)
	{
		//크기가 10인 배열 선언
	     int[]arr= new int[10];
	     
	        //배열을 1~10까지 초기화
		  for(int i=0 ; i <arr.length; i++) {
			  //i가 0부터 시작이므로 +1 해준다.
			  arr[i] =i+1;
		  }
		  //arr 배열의 0번 인덱스 요소부터 마지막 요소까지 변수 sum에 누적해서 더함
		  int sum = 0;
		  for(int i =0; i<arr.length;i++) {
			  //배열 확인용 출력
			  System.out.printf("%d " , arr[i]);
			  //누적합
			  sum += arr[i];
		  }
		  System.out.println("\n배열 전체 요소의합:"+ sum);

	}

}
