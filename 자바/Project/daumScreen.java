package Project;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class daumScreen extends JFrame{
	public daumScreen() {
		setTitle("다음");
		
		
		JPanel daum = new JPanel();
		JLabel url = new JLabel("URL : https//www.daum.com");
		daum.setBackground(Color.WHITE);
		url.setForeground(Color.BLUE);
		url.setFont(new Font("Agency FB", Font.BOLD,25));
		daum.setLayout(new FlowLayout(FlowLayout.CENTER,50,75));
		
		daum.add(url);
		
		add(daum);
		
		setBounds(900, 200, 300, 250);
		setResizable(false);
		setVisible(true);
		
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new daumScreen();
	}

}
