package ex06array;

public class E05TwoDimArray01pp
{

	public static void main(String[] args)
	{
		int[][] arr= {
				{1,2},
				{3,4,5},
				{6,7,8,9}
		};
		
		System.out.println("배열의 세로크기"+arr.length);
		
		for(int i = 0;i<arr.length;i++) {
			System.out.printf("%d행의크기:%d\n",i,arr[i].length);
		}
        System.out.println("배열 출력하기");
        System.out.println("arr[0][1]="+arr[1][0]);
        System.out.println("arr[0][0]="+arr[0][0]);
	}

}
