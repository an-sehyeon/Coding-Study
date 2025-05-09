
package day06;

import java.util.Random;

import util.MyUtil;

public class FormatAndColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1. color
		
		// AA��� ���ڸ� 8������ ��Ÿ���ÿ�. "\033[" + ���� + "m"
		// for���� ����Ͻÿ� AAAAAAAAAAAAAAAA, ���� ������ �α��ڸ��� �ٸ������� ���
		// �Ϲ� 8���� �����Ͻÿ�
		
		for (int i = 30; i < 38; i++) {			// 30 ~ 37���� ���� �Ϲݻ��� �ڵ�
			System.out.print("\033[" + i + "mAA" + MyUtil.END);
		}System.out.println("");
		
		
		for (int i = 90; i < 98; i++) {			// 90 ~ 97���� ���� �Ϲݻ��� �ڵ�
			System.out.print("\033[" + i + "mAA" + MyUtil.END);
		}System.out.println("");
		
		
		for (int i = 40; i < 48; i++) {			// 40 ~ 47���� ���� �Ϲݻ��� �ڵ�
			System.out.print("\033[" + i + "m  " + MyUtil.END);
		}System.out.println("");
		
		
		for (int i = 100; i < 108; i++) {		// 100 ~ 107���� ���� �Ϲݻ��� �ڵ�
			System.out.print("\033[" + i + "m  " + MyUtil.END);
		}System.out.println("");
		
		
		// Ȯ�� 256���� �����Ͻÿ�.(������, ���ڴ� ���� 1���ڷ�)
		// ���ڻ� : "\033[38;5;�����ڵ�m" + ���� + ����
        // ������ : "\033[48;5;�����ڵ�m" + ���� + ����
        // �����ڵ� : 0 ~ 255
		
		for(int i = 0; i < 256; i++) {			// 0 ~ 255���� ���� �ڵ�			
			System.out.print("\033[48;5;" + i + "m " + MyUtil.END);
		}System.out.println("");
		
		
		
		
		// True Color
		// Red, Green, Blue�� ���� Random�� ����Ͽ� 0���� 255���� �� �ϳ��� ����
		// �ش� �۾��� 256�� �����Ͽ� ����Ѵ�.
		// Red, Green, Blue�� ���� Random���� �־ 256�� �ݺ�
		
		// ���ڻ� : "\033[38;2;�����ڵ�m" + ���� + ����
        // ������ : "\033[48;2;�����ڵ�m" + ���� + ����
        // �����ڵ� : ����,���,�Ķ� -> 34;22;108
		
		
		int r, g, b;
		Random rd = new Random();
		
		for(int i = 0; i <256; i++) {
			r = rd.nextInt(256);
			g = rd.nextInt(256);
			b = rd.nextInt(256);
			String colorString = r + ";" + g + ";" + b;
			System.out.print("\033[48;2;" + colorString + "m " + MyUtil.END);
		}
	}

}
