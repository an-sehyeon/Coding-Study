
package day06;

import util.MyUtil;

public class ForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// MyUtilŬ������ p�޼ҵ� ȣ��
		MyUtil.p(MyUtil.BOLD + MyUtil.RED + "For Example" + MyUtil.END);
		
		// For
		for(int i = 0; i < 10; i++) {
			MyUtil.p("this i is " + i);
		}
		
		//MyUtil.p("this i is " + i);	// i�� ��������, for���� ����� ������ �������� �ʴ� ����
		
		int k = 10000;
		for(k = 0; k < 10; k++) {
			MyUtil.p("[1] This k is " + k);
		}
		
		MyUtil.p("[1] Final k is " + k);	// k�� 10000���� �ʱ�ȭ ������ for������ 0���� �ٽ� �ʱ�ȭ �Ͽ� ��� �� 
											// 10�� ���� �� for���� Ż���߱� ������ ���� k�� ���� 10
		
		
		
		// do - while
		boolean isTeacher = true;
		do {
			MyUtil.p("�� �� �ٺ���");
		} while(isTeacher != true);		// ����� �ȵɰ����� ���������� do�� ���� ������� �Ѵ�.
		
		
		
		// �ǽ�����
		// ����� ����Ͽ� 1���� 100������ ����ϵ�,
		// 3�� ����� �����ϰ� ����Ͻÿ�.
		
		// ��� 1
		for(int i = 1; i <= 100; i++) {
			if(i % 3 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("");
		
		// ��� 2
		int j = 1;
		while (j <= 100) {
			if(j % 3 != 0) {
				System.out.print(j + " ");
			}
			j++;
		}
		System.out.println("");
		
		// continue ���
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) continue;	// continue�� ������ �ݺ����� ó������ ���ư���.
			System.out.print(i + " ");
		}
		
		
		
	}

}
