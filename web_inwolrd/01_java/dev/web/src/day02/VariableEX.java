


package day02;		// ��Ű�� ����

public class VariableEX {		// Ŭ���� ����

	public static void main(String[] args) {		// ���� �޼���, ���� ���� ����Ǵ� �޼��� 
		System.out.println("Variable Example");
		p("Variable Example II");		// �Ʒ� ���ǵ� p �޼��带 ȣ���ϸ鼭  "Variable Example II"��� ���ڿ��� �μ��� ����
		
		// 1. int, long, float, double
		int var1 = 30;	// int�� ���� var1�� 30�� ����, ������ ������	
		long var2 = 100;	// long�� ���� var2�� 100�� ����, ������ �������� ū ����
		
		//float var3 = 3.13564987;	// �Ҽ��� �Է��ϸ� �⺻ Ÿ���� double�� �ν� -> ����
		float var3 = 3.13564987f;	// F�� �ָ� float�� �ν�
				
		double var4 = 3.1;
		
		float var5 = (float)3.1;  // float�� ����ȯ, explicit cast, ����� ����ȯ
		int var6 = (int)var4;	// �Ҽ��� ���ϸ� �����ϰ� ������ ���
		
		p("var 6 = " + var6);
		
		float var7 = 3.12341654644654f;
		double var8 = 3.12314346512313;
		
		p("var7 ="+ var7); 
		p("var8 ="+ var8); 
	
		// 2. char - ������ ����Ÿ������ ����, ���� ���� ���ڷ� ����
		char ch1 = 'a';		// ASCII (American Standard Code for International Interchange)
		char ch2 = 97;		
		char ch3 = 0x61;	// 0x �� 16�������� �ǹ�
		p("ch1, 2, 3 = " + ch1 + ch2 + ch3);
		
		// 3. String
		String myName = "BTS";
		p("My name is " + myName);
		
		// 4. boolean : true �Ǵ� false
		boolean b1 = true;
		boolean b2 = 3 > 5;
		p("b1, b2 = " + b1 +" "+ b2);
	}
	
	public static void p(String str) {		// p �޼��� : ���ڿ��� �Ű������� �޾� �ֿܼ� ����ϴ� �޼���
		System.out.println(str);		// ���޵� ���ڿ��� �ֿܼ� ���
	}
	
}
