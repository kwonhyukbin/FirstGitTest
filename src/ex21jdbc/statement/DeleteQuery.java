package ex21jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteQuery
{

//멤버변수	
private Connection con;
private Statement stmt;

//생성자 : 드라이버 로드만 진행
public DeleteQuery() {
	try {
		Class.forName("oracle.jdbc.OracleDriver");
	}
	catch(ClassNotFoundException e) {
		System.out.println("드라이버 로딩 실패");
		e.printStackTrace();
	}
}
//오라클에 대한 연결을 처리
public void connect() {
	try {
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","kosmo","1234");
	}
	catch(SQLException e	 ) {
		System.out.println("데이터베이스 연결 오류");
		e.printStackTrace();
	}
}
//오라클 연결, 쿼리작성, 전송 및 실행
private void execute() {
	
	connect();
	try {
		/*
		 test99와 같이 실존하지 않는 레코드에 대한 삭제를
		 진행하면, 에러가 발생하지는 않고 삭제만 되지 않는다.
		 */
		Statement stmt = con.createStatement();
	String query = "DELETE FROM member WHERE id='test'";
	int affected = stmt.executeUpdate(query);
	
	System.out.println(affected + "행이 삭제됨");
	}
	catch(SQLException e) {
		System.out.println("쿼리실행 오류");
		e.printStackTrace();
	}
	finally {
		close();
	}
}
private void close() {
	try {
		if(stmt!=null) stmt.close();
		if(con!=null) con.close();
		System.out.println("자원 반납 완료");
	}
	catch(Exception e) {
		System.out.println("자원 반납시 오류발생");
		e.printStackTrace();
	}
}
	public static void main(String[] args)
	{    //객체생성과 메서드 호출을 한번에 진행
         new DeleteQuery().execute();
	}

}
