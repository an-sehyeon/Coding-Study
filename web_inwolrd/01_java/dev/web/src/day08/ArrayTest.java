package day08;

import java.util.Random;

import util.MyUtil;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		MyUtil u = new MyUtil();					// NyUtil Ŭ������ �ν��Ͻ��� �����Ͽ� u�� ���� �޼��� ȣ�� ����	
		u.p("Array Test : Difficulty - GOD\n");			
		
		// �� ���� �̸�, �� ���� ������ ����(�Ҽ��� 1�ڸ�)
		// ���� �� �ְ����� �������� ã�� �� 
		// �׿� �ش��ϴ� �̸��� ������ ���
		
		// 0. Ÿ��Ʋ ���
		u.cp("�ְ����� ������ ����");			// MyUtil Ŭ������ cp�޼��� ȣ���Ͽ� Ÿ��Ʋ�� ���� �������� ���
		
		// 1. 10���� �̸� ����
		String[] names = {"A", "B", "C", "D", "E", "F", "G","E", "F", "G", "H", "I", "J"}; 
	
		
		
		
		// 2. 10���� ������ ���� ����(�Ҽ��� 1�ڸ�) ����
		Random rd = new Random();
		
		// ù��° ��� : 0 ~  1������ �Ҽ��� ���� �� ����� ���
		float score1 = rd.nextFloat();	// score1 : 0 ~ 1 ������ �Ҽ�
		score1 = score1 * 1000;			// score1 : 0���� 1000���� �Ҽ�
		score1 = (int)score1; 			// score1 : 0���� 1000������ ����
		score1 = score1 / 10;
		System.out.println("score1 : " + score1);

		// �ι�° ��� : 0 ~ 1000 ������ ������ ���� �� ����� ���
		float score2 = rd.nextInt(1001) / 10f;	
		System.out.println("score2 : " + score2  + "\n");
		
		
		float[] scores = new float[10];				// 10ũ���� floatŸ���� scores�迭 ����	
		for(int i = 0; i < scores.length; i++) {	// scores���� ��ŭ �ݺ�
			scores[i] = rd.nextInt(1001) / 10F;		// 0���� 1000 ������ ������ ������ �����Ͽ� 10���� ���� ��,
		}											// �Ҽ��� 1�ڸ������� ������ ����
		
		
		// ���� ��� ���1
//		for(float score : scores) {					// scores �迭�� �� ��Ҹ� �ݺ��ϸ�
//			u.p("score : " + score);				// �� ����� ������ ���
//		}

		// ���� ��� ���2
		for(int i = 0; i < scores.length; i++) {			// �迭�� ���̸�ŭ �ݺ��ϸ� 
			u.p("score[" + names[i] + "] : " + scores[i]);	// �ε�����ȣ�� �̿��� ����� �ش� �ε����� 
		}													// names�� ������ ���	
		
		
		
		
		// 3. �ְ����� �������� ���� ���� ����
		int indexTop = 0, indexBottom = 0;		// �ְ����� �������� ���� ����
		float scoreTop = 0, scoreBottom = 100;	// ���� �ְ����� �������� ���� ����
		
		
		// 4. �ְ����� ������ ã��
		for(int i = 0; i < scores.length; i++) {	// scores�迭 ���̸�ŭ �ݺ�
			// �ְ����ΰ� üũ	
			if(scores[i] > scoreTop) {				// ���� ������ ���� �ְ������� ũ�ٸ�?
				scoreTop = scores[i];				// scoreTop������ ���� (���� �ֽ�ȭ)
				indexTop = i;						// �׸��� indexTop�� ���� i�� �� ����
			}
			
			// �������ΰ� üũ
			if(scores[i] < scoreBottom) {			// ���� ������ ���� ���������� ���ٸ�?
				scoreBottom = scores[i];			// scoreBottom ������ ���� (���� �ֽ�ȭ)
				indexBottom = i;					// �׸��� indexBottom�� ���� i�� �� ����
			}
			
		}
		
		
		// 5. ����ϱ�
		u.p("\nResult");
		u.p("Top Score : " + scoreTop + "(" + names[indexTop] + ")");
		u.p("Lowest Score : " + scoreBottom + "(" + names[indexBottom] + ")");
		

	}

}
