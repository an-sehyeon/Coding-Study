package day04;

import java.util.Random;

import util.MyUtil;

public class RandomEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUtil.p("Random Example");
		
		Random rd = new Random();
		
		// Random Number Test
		MyUtil.p("nextInt() : " + rd.nextInt());		// int ������ ��� ���� �����ϰ� ����
		MyUtil.p("nextInt(100) : " + rd.nextInt(100));	// 0���� 99������ �������� ������ ������ ����
		MyUtil.p("nextFloat() : " + rd.nextFloat());	// 0.0 (����)���� 1.0 (������) ������ ������ �ε� �Ҽ����� ����
		MyUtil.p("nextDouble() : " + rd.nextDouble());	
		
		
		// nextInt(N) : 0���� N-1���� �� �ϳ��� ������ ���� �̿��Ͽ�
		// �ֻ��� ����(1~6) �� ���ڰ� �������� ����ÿ�
		int result1 = rd.nextInt(1,7); 	// 1���� 6������ �������� ������ ������ ����
		MyUtil.p("ù��° �ֻ��� ���� : " + result1);
		
		int result2 = rd.nextInt(6) + 1; // 0���� 5������ �������� ������ ������ ����. ���⿡ 1�� ���ϸ� 1���� 6������ ���ڰ� ��.
		MyUtil.p("�ι�° �ֻ��� ���� : " + result2);
		
		
		// Random Alphabet(A-Z)
		// �����غ� �� = 'A'�� 10���� 65
		// �빮�� ���ĺ� �� �ϳ��� �����ÿ�.
		char rchar1 = (char) rd.nextInt(65,91);		// (65,91)�� 65���� 90������ ������ �����ϰ� �̸� char�� ����ȯ
		MyUtil.p("ù��° Random Cahr : " + rchar1);	// �Ͽ� �빮�� ���ĺ� �� �ϳ��� ��ȯ
													// ��, 'A'(65����) 'Z'(90)������ �������� �����ϰ� �ϳ��� ���� ���
		
		
		char rchar2 = (char)(rd.nextInt(26) + 65);	// (26)�� 0���� 25������ ���� ����. ���⿡ 65�� ���� 65���� 90����
		MyUtil.p("�ι�° Random Cahr : " + rchar2);	// �� ���� char�� ��ȯ�Ǿ� ��������� A(65)���� Z(90)���� 
													// �����ϰ� �ϳ��� ���� ���
		
		
		
		// ��ҹ����� Random Alphabet( A-Z �Ǵ� a-z)
		// �����غ� �� : 'A' 65, 'a' 97
		// ���� ��ҹ��� �� �ϳ��� ��F�� �����ұ�?
		
		char rchar = (char)(rd.nextInt(26) + 65 + 32 * rd.nextInt(2) );	
		// rd.nextInt(26) : 0���� 25������ ���� ����, ���ĺ��� ��ġ�� ���� ( ��, 'A'���� 'Z').
		// + 65 : A�� �ƽ�Ű �ڵ� ���� 65�� �����ָ� A���� Z���� �빮�� �� ���� ���õ�
		// + 32 * rd.nextInt(2) : rd.next(2)�� 0 �Ǵ� 1�� ����
		// 0�Ǵ� 1�� �������� �����µ�
		// 0�� ��� : 32 * 0 = 0�� �������� �빮�� ����
		// 1�� ��� : 32 * 1 = 32�� ��������, �빮�ڿ� 32�� ���� �ҹ��ڷ� ��ȯ
		// ���������� rchar�� �빮�� A���� Z �Ǵ� �ҹ��� a���� z �� �ϳ��� ���� ����
				
		MyUtil.p("Random Cahr : " + rchar);
				
		// ���ڸ� ǥ���ϴ� ���(ASCII)
		// A : 65(0 X 41) , a : 97(0 X 61)
		// 0 : 48(0 x 30) 
		// bit : 0 or 1, byte = 8bit, 01010101
		// bit�� ���ڶ�� �ν�, byte�� ���ڶ�� �ν�
		
	}

}
