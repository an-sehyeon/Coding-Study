package DB;

public class HospitalVO {										// HospitalVO Ŭ���� ����
	String hptl_nm;												// ������ �̸��� �����ϴ� ���� 
	String sido_cd;												// ������ ��ġ�� ���� �ڵ带 �����ϴ� ����
	int doc_num;												// ������ �ǻ� ���� �����ϴ� ����
	
	public void setVO(String name, String sido, int num) {		// ���� ������ �����ϴ� �޼���
		hptl_nm = name;											// ������ �̸��� �Ű����� name���� ����			
		sido_cd = sido;											// ������ ���� �ڵ带 �Ű����� sido���� ����
		doc_num = num;											// ������ �ǻ� ���� �Ű����� num���� ����
	}
	
	// Object Ŭ������ �ļ�
	// toString �޼��带 �ڿ������� �����ϰ� ��
	// toString�� ������ ���� �ȵ�ٸ�(������ �ȵ�)
	// Overriding
	public String toString() {
		return "������ �̸��� " + hptl_nm + ", ��ġ�� " + sido_cd + ", �ǻ� ���� " + doc_num + "�Դϴ�.";		// �޼��� ȣ�� �� �ش� ���ڿ� ��ȯ
	}
	
}
