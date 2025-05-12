package Project;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class facebookScreen extends JFrame{
	public facebookScreen() {
		setTitle("페이스북");
		
		
		JPanel face = new JPanel();
		JLabel url = new JLabel("URL : https//www.facebook.com");
		face.setBackground(Color.BLUE);
		url.setForeground(Color.white);
		url.setFont(new Font("Agency FB", Font.BOLD,25));
		face.setLayout(new FlowLayout(FlowLayout.CENTER,50,75));
		
		face.add(url);
		
		add(face);
		
		setBounds(900, 200, 300, 250);
		setResizable(false);
		setVisible(true);
		
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new facebookScreen();
	}

}
