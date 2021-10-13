package quiz;

import java.util.Random;
import java.util.Scanner;

public class QuUpDownGame
{
     public static void upDownGameStart() {
    	 Random random = new Random();
    	 Scanner scan = new Scanner(System.in);
    	 int restart;
    	 boolean forEnd = false;//7번만에 맞추는지 확인하기 위한 변수
    	 
    	 // 무한루프안에서 사용자가 7번안에 맞추는지
    	 while (true) {
    		 
    		 int computerNum = random.nextInt(10000) % 100 +1;// 1~100까지 랜덤으로
    		 System.out.println("컴퓨터가 생성한 난수:"+ computerNum);
    		 
    		 for(int i=1 ;i<7;i++) {
    			 System.out.println();
    		 }
    	 }
     }
	public static void main(String[] args)
	{
          upDownGameStart();
	}

}
