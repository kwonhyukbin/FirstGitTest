package ex04controlstatement;

public class Practice
{

	public static void main(String[] args)
	{
     
	int kor =98, eng=88, math=90 ;	
	
	int result = (kor+eng+math)/3;
	
	System.out.printf("국어:%d,수학:%d,영어:%d\n",kor,eng,math);
	System.out.println("평균점수:"+result);
	
	if(result>=90) {
		System.out.println("A학점");
	   }
	else if(result >=80) {
		System.out.println("B학점");
	}
	
	}

}
