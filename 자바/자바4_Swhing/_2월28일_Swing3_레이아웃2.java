package 자바4_Swhing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;

/**
 * BorderLayout
 * 배치방법 :  컨테이너 공간 5구역으로 분할 배치
 * 			컨테이너 크기가 변하면 재배치
 */


import javax.swing.JFrame;

public class _2월28일_Swing3_레이아웃2 extends JFrame {
	public _2월28일_Swing3_레이아웃2() {
		setTitle("BorderLayout");
		
		Container c = getContentPane();
		
		//BorderLayout(int hGap, int vGap)		//hGap : 좌우 컴포넌트 사이 수평간격, 픽셀단위
												//vGap : 상하 컴포넌트 사이 수직 간격, 픽셀단위
		c.setLayout(new BorderLayout(30, 20));
		c.add(new JButton("Calculate"),BorderLayout.CENTER);
		c.add(new JButton("add"),BorderLayout.NORTH);
		c.add(new JButton("sub"),BorderLayout.SOUTH);
		c.add(new JButton("mul"),BorderLayout.EAST);
		c.add(new JButton("div"),BorderLayout.WEST);
		
		setSize(300, 200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new _2월28일_Swing3_레이아웃2();
	}

}
