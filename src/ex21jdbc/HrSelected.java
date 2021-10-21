package ex21jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HrSelected
{

	public static void main(String[] args)
	{
    try {
    	Class.forName("oracle.jdbc.OracleDriver");
    	
    	String url="jdbc:oracle:thin:@localhost:1521:xe";
    	String id = "hr";
    	String pass = "1234";
    	
    	Connection con = DriverManager.getConnection(url,id,pass);
    	if(con!=null) {
    		System.out.println("Oracle 연결성공");
    		/*
    		 1.쿼리문작성 : 작성시 주의할점은 줄바꿈을 할때 앞뒤로
    		    스페이스를 삽입하는게 좋다. 그렇지 않으면 서로 문장이
    		    이어지게 되어 SyntaxError가 발생한다.
    		 */
    		String sql = " SELECT * FROM employees WHERE department_id=30 ORDER BY employee_id DESC";
    		/*
    		 2.쿼리문전송을 위한 Statement 인터페이스를 통한 객체를
    		 생성한다. 주로 정적쿼리문을 실행할때 사용한다.
    		 */
    		Statement stmt = con.createStatement();
    		/*
    		 3. 쿼리문을 전송한 후 실행한 결과를 ResultSet 객체를 통해
    		 반환받는다. 해당 객체는 select쿼리를 실행했을때만 사용한다.
    		 */
    		ResultSet rs = stmt.executeQuery(sql);
    		/*
    		 4. 반환된 결과를 갯수만큼 반복한다. next()메서드는 출력할
    		 레코드가 있는지 확일할때 사용한다. 만약 남은 레코드가
    		 없다면 false를 반환한다.
    		 */
    		while(rs.next()) {
    			
    			/*
    			 getXXX() 메서드를 통해 각 컬럼에 접근한다. 오라클의
    			 자료형은 숫자, 문자, 날짜 3가지 형태이므로 각 메서드도
    			 그와 동일하다. 각 컬럼에 접근시 인덱스, 컬럼명 두가지 
    			 모두 사용할 수 있다.
    			 */
    			String emp_id = rs.getString(1);//인덱스로 접근
    			String f_name = rs.getString("first_name");///컬럼명으로 접근
    			String l_name = rs.getString("last_name");
    			java.sql.Date h_date = rs.getDate("hire_date");
    			int sal = rs.getInt("salary");
    			System.out.printf("%s %s %s %s %s\n",
    					emp_id, f_name, l_name, h_date, sal);
    		}
    		/*
    		 5. 자원반납 : 모든 작업을 마친후에는 메모리 절약을 위해
    		 연결했던 자원을 반납한다.
    		 */
    		rs.close();
    		stmt.close();
    		con.close();
    	}
    	else {
    		System.out.println("Oracle 연결실패");
    	}
    }
    catch(Exception e) {
    	System.out.println("Oracle 연결시 예외발생");
    	e.printStackTrace();
    }
	}

}
