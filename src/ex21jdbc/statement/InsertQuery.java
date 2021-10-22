package ex21jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class InsertQuery
{

	//멤버변수
	private Connection con; //DB 연결을 위한 객체
	private Statement stmt;//정적쿼리문을 전송 및 실행하기 위한 객체
	
	//생성자
	public InsertQuery() {
		try {
			//드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			//오라클 DB에 연결 : 정상적으로 연결되면 Connection객체 반환
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
					"kosmo",
					"1234");
			System.out.println("오라클 DB 연결성공");
		}
		catch (ClassNotFoundException e) {
			//ojdbc6.jar 파일이 없거나 연동되지 않았을때 예외발생
			System.out.println("오라클 드라이버 로딩 실패");
			e.printStackTrace();
		}
		catch(SQLException e) {
			//커넥션URL이나 접속정보가 잘못되었을때 예외발생 
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("알수 없는 예외 발생");
		}
	}
	//쿼리작성 및 전송, 실행
	private void execute() {
		try {
			//Statement 객체 생성을 위한 메서드 호출
			stmt = con.createStatement();
			//쿼리문(SQL) 작성 
			String sql = "INSERT INTO member VALUES ('test7','7777','사오정', SYSDATE)";
			//쿼리문 실행 및 결과값 반환
			int affected = stmt.executeUpdate(sql);
			//insert문에 대한 결과 출력
			System.out.println(affected+"행이 입력되었습니다.");
		}
		catch (SQLException e) {
			System.out.println("쿼리실행에 문제가 발생하였습니다.");
		}
		finally {
			/*
			 try문으로 진입했다면 예외가 발생하더라도 무조건 실행되는 구문으로
			 자원해제를 위한 close()메서드를 호출한다.
			 */
			close();
		}
	}
	
	private void close()	{
		try {
			if(stmt!=null) stmt.close();
			if(con!=null) con.close();
			System.out.println("DB자원반납완료");
		}
		catch(SQLException e) {
			System.out.println("자원반납시 오류가 발생하였습니다.");
		}
	}
	public static void main(String[] args)
	{
     InsertQuery iSQL = new InsertQuery();
     iSQL.execute();
	}

}
