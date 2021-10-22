package ex21jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//객체생성이 목적이 아닌 상속의 목적으로 정의한 추상클래스
public abstract class ConnectDB
{
        /*
         멤버변수 : 상속받은 하위클래스에서의 접근을 허용하기 위해
         	접근지정자는 protect로 선언함.
         */
  	
         protected Connection con;
         protected Statement stmt;
         protected ResultSet rs;
         //생성자1 : 인자가 없는 기본생성자
       public ConnectDB()
       {
    	   try {
   			Class.forName("oracle.jdbc.OracleDriver");
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
    	   
    	   public ConnectDB(String id, String pw)
           {
        	   try {
       			Class.forName("oracle.jdbc.OracleDriver");
       			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
       					id,
       				     pw);
       			System.out.println("오라클 DB 연결성공");
       		}
       		catch (ClassNotFoundException e) {
       			System.out.println("오라클 드라이버 로딩 실패");
       			e.printStackTrace();
       		}
       		catch(SQLException e) {
       			System.out.println("DB 연결 실패");
       			e.printStackTrace();
       		}
       		catch(Exception e) {
       			System.out.println("알수 없는 예외 발생");
       		}	   
	
       //생성자2 : 인자가 있는 생성자
       try {
			//드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
					"kosmo",
					"1234");
			System.out.println("오라클 DB 연결성공");
		}
		catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 로딩 실패");
			e.printStackTrace();
		}
		catch(SQLException e) {
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("알수 없는 예외 발생");
		}  
}
       public void close()	{
   		try {
   			if(stmt!=null) stmt.close();
   			if(con!=null) con.close();
   			if(rs!=null) rs.close();
   			System.out.println("DB자원반납완료");
   		}
   		catch(SQLException e) {
   			System.out.println("자원반납시 오류가 발생하였습니다.");
   		}
   	}
       
       /*
        상속관계에서 오버라이딩을 목적으로 생성한 추상메서드
        하위 클래스에서 각 목적에 따라 재정의 한다.
        */
       abstract void excute();
}
