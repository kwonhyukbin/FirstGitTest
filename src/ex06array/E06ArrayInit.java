package ex06array;

public class E06ArrayInit
{

	public static void main(String[] args)
	{
		/*
		 1차원,2차원 배열은 크기가 지정된 경우에는 전체요소가
		 0으로 초기화 된다.
		 */
     System.out.println("배열 선언후 초기화 하지 않은상태");
     int[] arr = new int[3];
     System.out.println("arr[0]="+ arr[0]);//0출력
     
     int[][] arr2 = new int[3][4];
     System.out.println("arr2[0][0]="+ arr2[0][0]);//0출력

     /*
      1차원 배열의 경우 요소의 갯수에 의해 전체 크기가 결정된다.
      2차원 배열도 마찬가지이나 다른점은 가장 큰 요소의 갯수에 의해
      크기가 결정되므로 빈 공간이 발생할 수 있다.이때 빈 공간은
      0으로 채울수 없고,null로 채워지게 된다.
      즉, 배열의 크기에서 제외되는 부분이 발생된다.
      */
     System.out.println("배열 선언과 동시에 초기화 한 상태");
     int[] arrDim = {1,2,3};
     System.out.println("arr[0]="+ arrDim[0]);//1출력
     
     int[][] arr2Dim= {
    		 {1},
    		 {2,3}
     };
     System.out.println("arr2Dim[0][0]="+ arr2Dim[0][0]);
     System.out.println("arr2Dim[0][1]="+ arr2Dim[0][1]);/*
                                  null값이므로 출력이 불가능하다.
                                  예외가 발생된다.
     */
	}

}
