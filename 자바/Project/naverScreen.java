package Project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class naverScreen extends JFrame{
	public naverScreen() {
		setTitle("네이버");
		
		
		JPanel naver = new JPanel();
		JLabel url = new JLabel("URL : https//www.naver.com");
		naver.setBackground(Color.GREEN);
		url.setForeground(Color.white);
		url.setFont(new Font("Agency FB", Font.BOLD,25));
		naver.setLayout(new FlowLayout(FlowLayout.CENTER,50,75));
		
		naver.add(url);
		
		add(naver);
		
		setBounds(900, 200, 300, 250);
		setResizable(false);
		setVisible(true);
		
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new naverScreen();
	}

}
