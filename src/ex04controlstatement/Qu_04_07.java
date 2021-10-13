package ex04controlstatement;

public class Qu_04_07 {
	public static void main(String[] args) 
	{
		int sum=0;
		//1~100까지반복
		for(int i =1 ; i <=100 ; i++) {
			//3의 배수 혹은 7의배수
			if(i%3==0 || i%7==0) {
				//3과 7의 공배수가 아닌 정수
				if(i%(3*7)!=0) 
				sum+= i;//누적합
				if(i!=99)
				System.out.print(i+"+");
				else
			    System.out.print(i);
			}
		}
         System.out.println("="+sum);//결과출력
	}

}
