package ex15usefulclass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class E05DateCalendar1
{

	public static Date date;
	
	/*
	  Calendar 클래스를 통해 얻은 객체로 현재시간을 초로 반환받은후
	  날짜를 원하는 포맷의 문자열로 반환한다.
	 */
	
	public static String myDateFormat(Calendar c, String formatStr) {
		Date date = c.getTime();//1970년 1월1일부터 지금까지의 시간을 초로 반환
		return new SimpleDateFormat(formatStr).format(date);
	}
	/*
	 특정 날짜를 지정하여 남은 날짜를 계산하여 반환하는 메서드.
	 여러개의 값을 반환하고 싶을때는 배열을 이용할 수 있다.
	 */
	public static String[] myDiffDate() throws ParseException {
		
		//우리가 사용하는 날짜의 포맷 형식
		String today= "2021/10/11";
		String future = "2021/12/25";
		
		//날짜의 포맷을 이용해서 우리가 사용하는 날짜를 Date객체로 변환한다.
		Date formatToday = new SimpleDateFormat("yyyy/MM/dd").parse(today);
		Date formatFuture = new SimpleDateFormat("yyyy/MM/dd").parse(future);
		/*
		 getTime()으로 얻어오는 시간은 총 13자리의 정수값인데
		 1~10자리까지는 순수한 초이고, 11~13자리까지는 밀리세컨즈를 의미한다.
		 즉 1000으로 나눠서 뒤의 3자리를 제거하면 순수한 초가 반환된다.
		 */
		long diffSec = (formatFuture.getTime()- formatToday.getTime())/1000;//1초
		long diffMin = (formatFuture.getTime()- formatToday.getTime())/60000;//1분
		long diffHor = (formatFuture.getTime()- formatToday.getTime())/360000;//1시간
		long diffDays = diffSec/(24*60*60);//하루는 86400초이므로 나눠서 일수를 계산한다.
		
		String[] strArr = new String[4];
		strArr[0]= diffSec + "초 남음";
		strArr[1]= diffMin + "분 남음";
		strArr[2]= diffHor + "시간 남음";
		strArr[3]= diffDays + "일 남음";
		return strArr;
	}
	
	public static void main(String[] args) throws ParseException
	{
		//Calendar클래스는 대표적인 싱글톤이므로 new로 생성하지 않는다.
       Calendar calendar = Calendar.getInstance();
       
       //여러가지 서식문자 활용하기
       System.out.println("오늘날짜:"+ myDateFormat(calendar, "yyyy-MM-dd"));
       System.out.println("현재시간:"+ myDateFormat(calendar, "HH-mm:ss"));
       System.out.println(myDateFormat(calendar, "오늘은 yyyy년의 w주차 D번째날"));
       System.out.println(myDateFormat(calendar, "오늘은 M월의 W번째주,d번째날,F번째 E요일"));
       
       //내일날짜 : 오늘 날짜에 1을 add한다.
       Calendar calendar2 = Calendar.getInstance();
       calendar2.add(Calendar.DATE,1);
       //myDateFormat()을 호출하면 아래 코드의 중복을 제거할수 있다.
       date= calendar2.getTime();
       String dateStr5 = new SimpleDateFormat("yyyy-MM-dd").format(date);
       System.out.println("내일날짜:"+ dateStr5);
       
       //월을 정의한 상수: 1을 더해야 정상적인 월이 된다.
       System.out.println("1월:"+(Calendar.JANUARY+1));
       System.out.println("12월:"+(Calendar.DECEMBER+1));
       
       //올해 X-mas까지의 남은 날짜
       String[] returnArr= myDiffDate();
       System.out.println("올해 크리스마스까지..");
       for(String s : returnArr) {
    	   System.out.println(s);
       }
       
		
	}

}
