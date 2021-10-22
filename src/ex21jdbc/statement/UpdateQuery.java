package ex21jdbc.statement;

import java.sql.SQLException;

//추상클래스를 상속하여 정의
public class UpdateQuery extends ConnectDB {
	
	public UpdateQuery(String user, String pass) {
		//인자를 가진 부모의 생성자를 호출
		super(user,pass);
	}
	@Override
	public void excute() {
		try {
			//statement객체 생성 및 쿼리작성, 실행
			stmt = con.createStatement();
			
			String sql = "UPDATE member"
					+ "  SET  "
					+"  pass='0000',  "
					+ " name='커리', "
					+ " regidate=sysdate "
					+ " WHERE id = 'test2' ";
			System.out.println("sql="+sql);
			/*
			 쿼리실행시 사용하는 메서드 종류
			 executeUpdate()
			 	: 쿼리문이 insert/update/delete와 같이 기존레코드에
			 	영향을 미치는 경우 사용한다. 실행후 영향을 받은 행의
			 	갯수를 int형으로 반환한다.
			 executeQuery()	
			 	: select쿼리를 실행할때 호출하는 메서드로 레코드에
			 	영향을 미치지 않고 조회만 하는 경우 사용한다.
			 	조회한 레코드를 반환값으로 받아야 하므로 ResultSet객체를
			 	반환타입으로 사용한다.
			 */
			
			int affected = stmt.executeUpdate(sql);
			System.out.println(affected +"행이 업데이트 됨");
}
		catch(SQLException e) {
			System.out.println("쿼리오류");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("알수없는 예외발생");
			e.printStackTrace();
		}
		finally	{
			close();
		}
}

	public static void main(String[] args)
	{
		new UpdateQuery("kosmo","1234").excute();
	}
	}

