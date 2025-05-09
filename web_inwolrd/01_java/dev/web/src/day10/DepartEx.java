
package day10;

import java.util.Random;

import util.MyUtil;

public class DepartEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Department[] d = new Department[5];		// ��ȭ�� 5, 5ũ���� �迭 ����
		
		d[0] = new Department("������");			// 0��° �ε����� "������" ����
		d[1] = new Department("����");			// 1��° �ε����� "����" ����
		d[2] = new Department("USE��");			// 2��° �ε����� "USE��" ����
		d[3] = new Department("�Ϻ���");			// 3��° �ε����� "�Ϻ���" ����
		d[4] = new Department("�Ӹ�����");			// 4��° �ε����� "�Ӹ�����" ����
		
		d[0].setOpenInd(true); 					// setOpenInd�� true�� �ʱ�ȭ
		Department.setPranOpenInd(true);		// setPranOpenInd�� true�� �ʱ�ȭ
		
		Random rd = new Random();
		for(int i = 0; i < d.length; i++) { 	// d�迭�� ũ�⸸ŭ �ݺ�
			if(rd.nextInt(2) == 1) 				// �������� 0�� 1�� �޾Ƽ� 1�̶��?
				d[i].setOpenInd(true);			// ���� i��° �ε����� ���� true
			else								// 0�̶��?
				d[i].setOpenInd(false);			// false ����
		}
			
		MyUtil.p("���� ���� ���� üũ ���");
		for(int i = 0; i < d.length; i++) {		// d�� ������ �ִ� �迭 ������ ������� �ϳ��� ���
			MyUtil.p("[" + d[i].name + "]" + (d[i].getOpenStatus()? "������":"�ݾҾ�"));
		}										// ���� �迭�� getOpenStatus ���� true��� ������, false��� �ݾҾ� ���
		
		System.out.println("\n");

		// 1�� ������ ������ �ݾ��� ���� �� 1000���� ���ϸ� �����Ͽ� amt�� �߰�
		for(int i = 0; i < 10; i++) {								// 10�� �ݺ� 'd'�� ���� 10�� �ݺ��ϸ� ���� ������� ���ϱ� ����
			for(int j = 0; j < d.length; j++) {						// i�� 1�� �ݺ��� ������ j�� 5�� �ݺ��ϸ�, �̴� ������ �ε����� ������� �������� �޾� �����ϱ� ���� 
				int todayAmt = rd.nextInt(100000001) / 1000 * 1000;	// 0���� 100000000���� �� �������� �ϳ��� ���� ���� (1000 * 1000)������� ���� �� todayAm	t�� ����
				d[j].addAmt(todayAmt);								// ���� �ε����� ������� �����ְ� ����(�Ѹ������ ����ϱ� ����)
		
//				MyUtil.p(d[j].name + "�� ���� ������� : " + d[j].getAmt());		// ��ø�ݺ����� ����ɶ����� ���� ������ �ε����� ������ ���
			}
//			System.out.println("\n");
		}
		
		System.out.println("\n");
		
		
		for(Department dd : d) {						// �迭�� �ε����� �ϳ��� �����ͼ�
			MyUtil.p(dd.name + " : " + dd.getAmt());	// dd�� �̸��� �Ѹ���� ���
		}
		
		// ���� ������ ���� ������?
		String topName = null;							// StringŸ�� ���� ���� �� null�� �ʱ�ȭ, �ְ� ���� ������ ���� ���� 
		int topAmt = 0;									// intŸ�� ���� ���� �� �ʱ�ȭ, �ְ� ����� ���� ����						
		
		for(Department dd : d) {						// �迭�� �ε����� �ϳ��� �����ͼ�
			if(dd.getAmt() > topAmt) {					// �ش� �ε����� �Ѹ������ topAmt���� ũ�ٸ�?
				topName = dd.name;						// topName�� �ش� �ε����� name�� ����	
				topAmt = dd.getAmt();					// topAmt�� �ش� �ε����� �Ѹ������ ����
			}
		}
		
		MyUtil.cp("�ִ� ���� ����");
		MyUtil.p(MyUtil.RED + MyUtil.BOLD + topName + " : " + topAmt + MyUtil.END);
		
		
		
		
	}

}

class Department{
	// 1. name : ��ȭ�� ���� �̸�, ������ �� ���� ����
	// 2. pranName : �귣�� �̸�, ���� �Ұ�, ���ʿ� "����ȭ��"���� ����
	// 3. amt : ������ �����, �ʱⰪ�� 0, ���� ���� �Ұ�
	// 4. openInd : ���� ������ ���� ���� ����(true or false)
	// 5. pranOpenInd : ��ü(�귣��) ��ȭ���� ���� ���� ����
	// 6. getOpenStatus() : ���� ������ ���� �������� ����
	// 7. addAmt(int amt) : ������� ���ϴ� �޼���
	
	// Step 0. Ŭ���� ����ֱ�
	// ��ȭ�� ���� ������ ��ü�� ���� Ŭ����
	
	// step 1. �ʵ� ����
	String name;
	static final String pranName = "����ȭ��";			// ��� ���� ����
	int amt;
	private boolean openInd;
	private static boolean pranOpenInd;
	
	
	// step 2. Constructor
	// ���� �̸��� ���� �̸� ����, ���ϸ� "����" ����
	Department(){
		//name = "����";
		this("����");
	}
	
	Department(String name){
		this.name = name;
	}
	
	
	// step 3. getOpenStatus ����
	public boolean getOpenStatus() {
		
		// 1�� ���
//		if(openInd == true) {
//			if(pranOpenInd == true) {
//				return true;
//			}
//			else {
//				return false;
//			}
//		}
		
		
		// 2�� ���		
//		if(openInd == true && pranOpenInd == true) {
//			return true;
//			}
//		return false;

		
		// 3�� ���
//		if(openInd && pranOpenInd) {
//			return true;
//		}
//		return false;
		
		
		// 4�� ���
		return openInd && pranOpenInd;
		}
		
		
		// step 4. Getter/Setter
		public void setOpenInd(boolean status) {
			openInd = status;
		}
	
		public static void setPranOpenInd(boolean status) {
			pranOpenInd = status;
		}
		
		public int getAmt() {
			return amt;
		}
		
		
		// step 5. User Function
		// ������� ���ϴ� �޼���
		public void addAmt(int amt) {
//			this.amt = this.amt + amt;
			this.amt += amt;
		}
		
		
				
	}
	
	