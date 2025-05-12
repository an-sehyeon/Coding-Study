package day07;

import util.MyUtil;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyUtil.p("Array Example");
		
		String[] str = new String[5];		// StringŸ���� str �迭 ���� ũ��� 5
		str[0] = "Eliot";					// str�� ù��° �迭�� ���� "Eliot" ����
		str[3] = "Adbula";					// str�� �׹�° �迭�� ���� "Adbula" ����
		MyUtil.p("str.length?" + str.length);
		
		String[] stdName1 = new String[5];					// StringŸ���� stdName1 �迭 ���� ũ��� 5 
		String[] stdName2 = {"A","B","C","D","Federer"};	// StringŸ���� stdName2 �迭�� ������ �� ����
		
		// String�� ���뼺 
		String aaa = new String("James");
		String bbb = "David";
		String ccc = new String("James");
		String ddd = "David";
		
		MyUtil.p("aaa == ccc? " + (aaa == ccc));	// aaa�� ccc�� �޸���ġ�� ���� ��ġ�ϳ�?
		MyUtil.p("bbb == ddd? " + (bbb == ddd));	// bbb�� ddd�� �޸���ġ�� ���� ��ġ�ϳ�?
		MyUtil.p("aaa == ccc? " + aaa.equals(ccc)); // �������ִ� ���� ����?
		
		int score = 100;
		Integer score1 = new Integer(100);
		
		int[] score2 = {10,20,10,30,20};
		
		// �л��� �̸��� �������� ����غ�����.
		// �л��̸�1 : **��
		// �л��̸�2 : **��
		// ...
		
		for(int i = 0; i < score2.length; i++) {
			MyUtil.p(stdName2[i] + " : " +  score2[i]);
		}
		
		
		// 2-dimensional Array (2�����迭)
		String[][] classStd = {{"A","B"},{"C","D"}};
		// classStd[0][0] ~[1][1]
		// A�л��� ��ġ�� classStd[0][0]
		// C�л��� ��ġ�� classStd[1][0]
		// String[] class0 = classStd[0];		
		
		// �г�, ��, �л� => String[][][]
		// => �ѹ� �Ẹ�� �Ⱦ��� ��  
		
		// ��� �л� �̸� ����ϱ�
		MyUtil.p("");
		MyUtil.p("Display All Student's Name");
		MyUtil.p(MyUtil.GREEN + "General" + MyUtil.END);
		for(int i = 0; i < stdName2.length; i++) {
			MyUtil.p(stdName2[i]);
		}
		
		
		MyUtil.p("");
		MyUtil.p("Display All Student's Name");
		MyUtil.p(MyUtil.RED + "Enhanced For" + MyUtil.END);
		
		// stdName2���� �ϳ��� ������ name�� �ְ� �� ���� ����
		for(String name : stdName2) { 	// stdName2�� String�� ����
			MyUtil.p(name);
			// �̸��� "C"�̸� �׸���
			if(name.equals("C")) {
				break;
			}
		}
		
		
		// Enhanced For�� Ȱ���Ͽ� ������ ����Ͻÿ�.
		for(int sco : score2) {
			MyUtil.p("���� : " + sco);
		}
		
		
		// Enhanced For�� Ȱ���� Difficulty GOD ����
		// String [][] classStd = {{"A","B"},{"C","D"}};
		// Enhanced For�� Ȱ���Ͽ� ��� �л��� ����Ͻÿ�.
		
		
		// 2�� for��
		for(String[] cls : classStd) {			// classStd[0], classStd[1]
			for(String std : cls) {
				MyUtil.p("�л� �̸� : " + std );
			}
		}
		
		// day01 ��Ű���� Welcome Ŭ���� ȣ��
//		Welcome welcome = new Welcome();
//		String[] zzz = null;
//		welcome.main(zzz);
		

	}

}
