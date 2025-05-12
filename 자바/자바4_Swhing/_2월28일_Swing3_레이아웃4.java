package 자바4_Swhing;

/**
 * 배치관리자가 없는 컨테이너
 *  응용프로그램에서 컴포넌트의 절대크기와 절대위치 결정
 *  컴포넌트의 크기나 위치가 임의 지정됨
 *  시간이나 마우스/키보드 입력에 따라 컴포는트들의 위치와 크기가 수시로 변하는 경우
 *  여러 컴포넌트들이 서로 겹쳐 출력하고자 하는 경우
 */


import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class _2월28일_Swing3_레이아웃4 extends JFrame {
	public _2월28일_Swing3_레이아웃4() {
		setTitle("Null Sample");
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel la=  new JLabel("Hello");
		la.setLocation(130, 50);	//라벨 x, y위치 설정
		la.setSize(200, 20);
		c.add(la);
		
		for(int i = 1; i <= 9; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i * 15, i * 15);
			b.setSize(50, 20);
			c.add(b);
		}
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new _2월28일_Swing3_레이아웃4();
	}

}

