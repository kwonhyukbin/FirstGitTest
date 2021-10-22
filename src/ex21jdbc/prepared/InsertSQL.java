package ex21jdbc.prepared;

import java.sql.Date;
import java.util.Scanner;

import ex21jdbc.connect.IConnectImpl;

public class InsertSQL extends IConnectImpl {

	public InsertSQL() {
		super(ORACLE_DRIVER, "kosmo","1234");
	}
	public void execute() {
		try {
			//1.쿼리문준비 : 값의 세팅이 필요한 부분을 ?(인파라미터)로 대체한다.
			String query = "INSERT INTO member VALUES (?, ?, ?, ?)";
			
			//2.prepared객체생성 : 생성시 준비한 쿼리문을 인자로 전달한다.
			psmt = con.prepareStatement(query);
			
			//3.입력할 내용을 사용자로부터 입력받는다.
			Scanner scan = new Scanner(System.in);
			System.out.print("아이디:");
			String id = scan.nextLine();
			System.out.print("패스워드:");
			String pw = scan.nextLine();
			System.out.print("이름:");
			String name = scan.nextLine();
			
			/*
			 4.인파라미터 설정 : ?의 순서대로 설정하고, 인덱스는 1부터 시작한다.
			 	인파라미터 설정시 사용하는 메서드
			 	자료형이
			 		숫자면 setInt()
			 		문자면 setString()
			 		날짜면 setDate()
			 	입력값이 문자이거나 날짜면 싱글쿼테이션이 자동으로 삽입된다.	
			 */
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			
			//날짜를 문자열로 입력하는 경우
			psmt.setString(4, "2021-12-24");
			
			//날짜를 date타입으로 입력하는 경우
			/*
			 	현재날짜를 java단에서 입력하는 경우 아래와 같은 변환과정을 거쳐야한다.
			 	util패키지로 시간을 가져온 후 sql패키지로 타입을 변환한다.
			 	이때는 date형으로 입력되므로 setDate()로 인파라미터를 설정해야한다.
			 */
//			java.util.Date utilDate = new java.util.Date();
//			java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
//			psmt.setDate(4, sqlDate);
			
			int affected = psmt.executeUpdate();
			System.out.println(affected +"행이 입력되었습니다.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}


	public static void main(String[] args)
	{
		new InsertSQL().execute();
	}

}
