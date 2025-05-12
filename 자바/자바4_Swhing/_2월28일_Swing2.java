package 자바4_Swhing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class _2월28일_Swing2 extends JFrame {
	
	public _2월28일_Swing2() {
		setTitle("Button");
		
		Container contentPane = getContentPane();	//컨테이너 팬 알아내기
		contentPane.setBackground(Color.orange);	
		contentPane.setLayout(new FlowLayout());		//(레이아웃=배치관리자)
		
		//컨텐트팬에 컴포넌트 달기
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancle"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new _2월28일_Swing2();
	}

}
