package DB;

public class HptlVO {
	private String hptlNm;
	private String addr;
	private int docNum;


	public void setHptlNm(String hptlNm) { 
		this.hptlNm = hptlNm; 
	// ���� �����ϰ� �ִ� �� �̸��� �ð��� �α׷� �״´�.
	}	
	public void setAddr(String addr) { this.addr = addr; }
	public void setDocNum(int docNum) { this.docNum = docNum; }
	
	public String getHptlNm() {return hptlNm; }
	public String getAddr() {return addr; }
	public int getDocNum() {return docNum; }
}
