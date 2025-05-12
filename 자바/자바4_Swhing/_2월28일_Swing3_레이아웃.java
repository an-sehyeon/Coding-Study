package 자바4_Swhing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class _2월28일_Swing3_레이아웃 extends JFrame {
	
	public _2월28일_Swing3_레이아웃() {
		setTitle("FlowLayout");
		
		Container c = getContentPane();
		
		//FlowLayout(int align, int hGap, int vGap)
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		
		//align : 컴포넌트 정렬방법
		//hGap : 좌우 컴포넌트 사이 수평간격, 픽셀단위
		//vGap : 상하 컴포넌트 사이 수직 간격, 픽셀단위
		
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));
		
		setSize(300, 200);
		setVisible(true);
		
		
		
	}
	

	public static void main(String[] args) {
		new _2월28일_Swing3_레이아웃();
		
		
		
	}

}

