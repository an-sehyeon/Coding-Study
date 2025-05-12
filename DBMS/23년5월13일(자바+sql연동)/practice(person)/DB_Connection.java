import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB_Connection {
	
	private Connection con;//연결관련 Connection 인터페이스
	private Statement st;//SQL실행관련 (SQL을 실행하기 위한 객체로 이용된다.)
	private PreparedStatement pstmt;//미완성형 SQL실행 관련 (?포함한 SQL문)
	private ResultSet rs;//데이터베이스 결과 집합을 담는 테이블 형태의 데이터 (SQL실행결과 담는곳)
	
	public DB_Connection() {//디폴트 생성자
		//생성자는 객체가 생성되면 자동으로 실행
		String url="jdbc:mysql://127.0.0.1/practice?serverTimezone=UTC&useSSL=false";
		String id="root";
		String pw="1234";
		try {//오류처리 try~catch
			Class.forName("com.mysql.cj.jdbc.Driver");
			//드라이버가 뭔가?
			con = DriverManager.getConnection(url,id,pw);
			//getConnection메서드로 대상 데이터베이스에 연결
			st = con.createStatement();
			//데이터베이스에 SQL문을 보내기위한 Statement객체 생성한다.
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		//연결작업, Statement객체 생성
	}
	
	public void search() {//모두조회 기능 실행하는 함수
		//select * from person;
		String SQL = "select * from person";
		try {
			rs=st.executeQuery(SQL);
			while(rs.next()){
				//한행씩 이동시킨다.
				String name = rs.getString("name");
				//결과집합에서 name칼럼에 해당하는 데이터를 자바 String변수 name으로 옮긴다.
				int age = rs.getInt("age");
				double height = rs.getDouble("height");
				System.out.print(name+" ");
				System.out.print(age+" ");
				System.out.println(height+" ");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void searchByName(String input_name) {//조건조회 - 이름
		//select * from person where name='이민호';
		//String SQL = "select * from person where name="+input_name;
		String SQL = "select * from person where name="+"'"+input_name+"'";
		//select * from person where name=이민호
		//select * from person where name='이민호'
		try {
			rs=st.executeQuery(SQL);
			while(rs.next()){
				//한행씩 이동시킨다.
				String name = rs.getString("name");
				//결과집합에서 name칼럼에 해당하는 데이터를 자바 String변수 name으로 옮긴다.
				int age = rs.getInt("age");
				double height = rs.getDouble("height");
				System.out.print(name+" ");
				System.out.print(age+" ");
				System.out.println(height+" ");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void addPersonInfo(String name,int age,double height) {
		//String SQL = "insert into person(name,age,height) values(name,age,height)";
		//String SQL = "insert into person(name,age,height) values("+"'"+name+","+age+","+height+")";
		String SQL = "insert into person(name,age,height) values(?,?,?)";
		//미완성 SQL문
		//미완성 SQL문을 다루는게 PreparedStatement
		try {
			pstmt=con.prepareStatement(SQL);
			//파라미터화된 SQL문을 데이터베이스 보내기위한 PreparedStatement객체 생성
			// ?들어가있는 (인자를 설정할수있는) SQL문을 데이터베이스 보내기위한 PreparedStatement객체 생성
			pstmt.setString(1, name);
			//SQL문 첫번째 물음표에 name을 넣겠다.
			pstmt.setInt(2, age);
			pstmt.setDouble(3, height);
			//미완성형 SQL문의 인자에 값 설정 완료 - 물음표에 값 다 넣었다.
			pstmt.executeUpdate();//설정완료된 SQL문 실행
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updatePersonInfo(String name,int age) {
		String SQL = "update person set age=? where name=?";
		try {
			pstmt=con.prepareStatement(SQL);
			pstmt.setInt(1, age);
			pstmt.setString(2, name);
			pstmt.executeUpdate();//설정완료된 SQL문 실행
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
//1.MyMain클래스는 메인메서드를 포함하고, 사용자 선택받고
//DB_Connection클래스로 객체 생성해서, 기능을 사용하는 역할

//2.DB_Connection클래스는 MySQL과 연결하고, SQL문 실행하는
//실질적 기능이 있는 클래스