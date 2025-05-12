package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DBConnect {

	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// Constructor
	DBConnect(){
		try {															// ����ó��
			Class.forName("org.mariadb.jdbc.Driver");					// MariaDB jdbc ����̹� �ε�
			conn = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3399/test",				// MariaDB ���� �ּ�, ��Ʈ��ȣ, DB ���̺��
					"root",												// �����ͺ��̽� ���̵�			
					"3416"												// ��й�ȣ
					);
			
			if(conn != null) {											
				System.out.println("Congratulations!! Connect OK");		// ���� ���� �� �޽��� ���
			}
			
		}
		catch(Exception e) {e.printStackTrace(); }						// ���� �߻� �� ���� �޽��� ���
	}
	
	public static void main(String[] args) {												// ���α׷� ���� �� ȣ��Ǵ� ���� �޼���
		// TODO Auto-generated method stub
		
		System.out.println("DB Connect Program");											// ���ڿ� ���
		DBConnect dbconn = new DBConnect();													// DBConnect ��ü ���� �� dbconn������ ����
		
		// for Test
		HospitalVO vo = new HospitalVO();													// HospitalVo Ŭ������ ��ü�� ���� �� vo������ ����
		vo.setVO("�׽�Ʈ����","�ϴ�", 12534);													// �׽�Ʈ�� ���� ���� ����
		System.out.println(vo.toString());													// vo ��ü�� toString() �޼��� ȣ���Ͽ� ���� ���� ���
		
		dbconn.select1("����").forEach(System.out::println);									// ����function, select1 �޼��� ���� ��� ���
		System.out.println("--------------------------------------------------------");
		dbconn.select2("����").forEach(System.out::println);									// select2 �޼��� ���� ��� ���
	}

	// Statement�� ����� ���� SQL �� ���
	public ArrayList<HospitalVO> select1(String region){									// select1 �ż���  
		
		ArrayList<HospitalVO> arr = new ArrayList<>();										// ���� ����� ������ ArrayList 
		
		// SQL �� �ۼ�
		String sql = "";
		sql += "select * from hptl_mast_bak ";												// hptl_mast_bak ���̺���
		sql += "where sido_cd_nm = '" + region + "' ";										// sido_cd_nm �÷� ���� rehion�� �����͸�
		sql += "limit 5";																	// �ִ� 5���� ����� ��ȸ
		
		System.out.println(sql);															// ������ SQL �� ���
		
		try {
			stmt = conn.createStatement();													// Statement ��ü ����
			rs = stmt.executeQuery(sql);													// rs������ SQL �� ���� ��� ����	
			
			
			while(rs.next()) {																// ����� ���� ������ �ݺ�
				HospitalVO vo = new HospitalVO();											
				vo.setVO(rs.getString("hptl_nm"),											// ���� �̸�
						 rs.getString("sido_cd_nm"),										// ���� �ڵ�	
						 rs.getInt("doc_num"));												// �ǻ� ��
				arr.add(vo);																// HospitalVO ��ü�� ArrayList�� �߰�
						
			}
			
			rs = null;																		// ������� ���� rs���� �ʱ�ȭ
			
		}
		catch(Exception e) {e.printStackTrace();}											// ���� �߻� �� ���� �޽��� ���
		
		return arr;																			// ��ȸ ��� ��ȯ
	}
	
	
	
	
	
	
	// PreparedStament
public ArrayList<HospitalVO> select2(String region){										// select2 �޼���
		
		ArrayList<HospitalVO> arr = new ArrayList<>();										// ���� ����� ������ ArrayList	
		
		
		// PreparedStatement�� ���� �κ��� ?�� ����
		String sql = "";
		sql += "select * from hptl_mast_bak ";
		sql += "where sido_cd_nm = ? ";														// ���� �κп� ? ���
		sql += "limit 5";
		
		System.out.println(sql);
		
		try {
			pstmt = conn.prepareStatement(sql);												// PreparedStatement ��ü ����
			pstmt.setString(1, region);														// ù��° ? �ڸ��� region �� ����
			rs = pstmt.executeQuery();														// SQL �� ���� �� ��� ����
			
			
			while(rs.next()) {
				HospitalVO vo = new HospitalVO();
				vo.setVO(rs.getString("hptl_nm"),
						 rs.getString("sido_cd_nm"),
						 rs.getInt("doc_num"));
				arr.add(vo);
						
			}

			rs = null;
			
		}
		catch(Exception e) {e.printStackTrace();}
		
		return arr;
	}
}
			
	



















