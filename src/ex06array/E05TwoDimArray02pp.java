package ex06array;

public class E05TwoDimArray02pp
{

	public static void main(String[] args)
	{
    int[][] arr2Dim = new int[3][4];
    
    for(int i=0 ; i<3; i++) {
    	for(int j=0;j<4;j++) {
    		arr2Dim[i][j] =i+j;
    	}
    	for(int n=0;n<arr2Dim.length ; n++) {
    		for(int m=0; m<arr2Dim[n].length;m++) {
    			System.out.print(arr2Dim[n][m]+" ");
    		}
    		System.out.println();
    	}
    }
	}

}
