package ex15usefulclass;

import java.util.Calendar;
import java.util.Scanner;

class CalendarPrint{
	//사용자가 입력한 년/월
	public int year;
	public int month;
	//해당월의 마지막날, 1일의 요일
	public int lastDay;
	public int startWeek;
	//생성자
	public CalendarPrint(int year, int month) {
		this.year = year;
		this.month = month;
		Calendar c= Calendar.getInstance();
		//사용자가 지정한 년/월로 설정한다. 단 월에서는 1을 빼야한다.
		c.set(year, month-1,1);
		//해당 월의 마지막날을 구함(28,30일..)
		this.lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		//1일의 요일을 구함
		this.startWeek = c.get(Calendar.DAY_OF_WEEK);
	}
	//실제 달력을 출력하는 메서드
	public void display() {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		//만약 1일이 수요일이면 4이므로 tab은 3번 추가된다.
		for(int i=1; i<startWeek;i++)
			System.out.print("  \t");
		//그 다음부터 마지막날까지 날짜를 출력해 나간다.
		int countDay = startWeek;
		for(int i=1;i<=lastDay;i++) {
			System.out.print(i+"\t");
			//토요일이 되었을때 줄바꿈 처리
			if(countDay%7==0) {
				System.out.println();
			}
			countDay++;
		}
	}
}

public class E05DateCalendar2
{

	public static void main(String[] args)
	{
       System.out.println("달력 출력하기");
       Scanner sc = new Scanner(System.in);
       System.out.print("년도 및 월 입력 (스페이스로구분):");
       int year = sc.nextInt();
       int month = sc.nextInt();
       new CalendarPrint(year,month).display();
	}

}
