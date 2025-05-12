package Project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Url extends JFrame{
	public Url() {
		
		
		
		
		setTitle("즐겨찾기");
		JPanel title = new JPanel();
		JLabel joy = new JLabel("FAVORITES");
		
		joy.setForeground(Color.YELLOW);
		joy.setFont(new Font("Bernard MT", Font.BOLD, 27));
		title.setLayout(new FlowLayout(FlowLayout.CENTER,0,20 ));
	
		title.add(joy);
		
		JPanel jp1 = new JPanel();
		jp1.setLayout(new GridLayout(2,2));
		
		
		JPanel naver = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JButton nav = new JButton("N");
		nav.setFont(new Font("Arial Rounded MT", Font.BOLD, 35));
		nav.setBackground(Color.GREEN);
		nav.setForeground(Color.WHITE);
		nav.setPreferredSize(new Dimension(110,60));
		
		JPanel daum = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JButton da = new JButton("D");
		da.setFont(new Font("Arial Rounded MT", Font.BOLD, 35));
		da.setBackground(Color.white);
		da.setForeground(Color.BLUE);
		da.setPreferredSize(new Dimension(110,60));
		
		naver.add(nav);
		daum.add(da);
		jp1.add(naver);
		jp1.add(daum);
		
		JPanel gogle = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JButton gog = new JButton("G");
		gog.setFont(new Font("Arial Rounded MT", Font.BOLD, 35));
		gog.setBackground(Color.white);
		gog.setForeground(Color.red);
		gog.setPreferredSize(new Dimension(110,60));
		
		JPanel face = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JButton fac = new JButton("F");
		fac.setFont(new Font("Arial Rounded MT", Font.BOLD, 35));
		fac.setBackground(Color.blue);
		fac.setForeground(Color.WHITE);
		fac.setPreferredSize(new Dimension(110,60));
		
		gogle.add(gog);
		face.add(fac);
		jp1.add(gogle);
		jp1.add(face);
		
		
		JPanel jp2 = new JPanel();
		jp2.setLayout(new FlowLayout());
		jp2.add(jp1);
		
		setLayout(new BorderLayout());
		
		add(title, BorderLayout.NORTH);
		add(jp2, BorderLayout.SOUTH);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(900, 200, 300, 250);
		setResizable(false);
		setVisible(true);
		
		//네이버 버튼 액션리스너
		nav.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new naverScreen();
			}
		});
		
		//다음 버튼 액션리스너
		da.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new daumScreen();
			}
		});
		
			//구글 버튼 액션리스너
		gog.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new gogleScreen();
			}
		});
		
			//페이스북 버튼 액션리스너
		fac.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new facebookScreen();
			}
		});
		
		
	}
	
		


	
	public static void main(String[] args) {
		new Url();
	}
}