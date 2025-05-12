package Project;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class gogleScreen extends JFrame{
	public gogleScreen() {
		setTitle("구글");
		
		
		JPanel gog = new JPanel();
		JLabel url = new JLabel("URL : https//www.google.com");
		gog.setBackground(Color.white);
		url.setForeground(Color.red);
		url.setFont(new Font("Agency FB", Font.BOLD,25));
		gog.setLayout(new FlowLayout(FlowLayout.CENTER,50,75));
		
		gog.add(url);
		
		add(gog);
		
		setBounds(900, 200, 300, 250);
		setResizable(false);
		setVisible(true);
		
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new gogleScreen();
	}

}
