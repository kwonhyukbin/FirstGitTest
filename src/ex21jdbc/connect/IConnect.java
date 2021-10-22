package ex21jdbc.connect;

public interface IConnect
{
	/*
	 멤버상수
	 	: 인터페이스에 선언된 변수는 무조건public static final이
	 	붙어 정적 상수로 선언된다.
	 */
	String ORACLE_DRIVER = "oracle.jdbc.OracleDriver";
	String ORACLE_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	
	/*
	 멤버추상메서드
	 	: public abstract 가 붙어 추상메서드로 선언된다.
	 */
	void connect(String user, String pass);//DB 연결
	void execute();//쿼리 실행
	void close();//자원 반납
	
	//사용자 입력을 위한 추상메서드 선언
	String scanValue(String title);
	
}