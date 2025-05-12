package 자바5_3월2일;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class 복습1 extends JFrame{
	
	public 복습1() {
		setTitle("제품관리시스템");
		
		JPanel title = new JPanel();
		
		JLabel login = new JLabel("로그인 화면");
		
		login.setForeground(new Color(3, 0, 153)); //setForeground = 폰트와 백그라운드를 합친 것, 글자색 변경
		login.setFont(new Font("궁서체", Font.BOLD, 20));
		
		title.add(login); 	//컴포넌트를 title 컨테이너에 올려주기 위함
		
		JPanel jp1 = new JPanel();
		jp1.setLayout(new GridLayout(3,2));
		
		/**
		 * 아이디 입력영역
		 */
		JPanel idPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JLabel jid1 = new JLabel("아이디 : ", JLabel.CENTER);
		idPanel.add(jid1);
		
		JPanel idPanel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));		
		JTextField jtf1 = new JTextField(10);
		idPanel.add(jtf1);
		jp1.add(idPanel);
		jp1.add(idPanel2);
		
		/**
		 * 비밀번호 입력영역
		 */
		JPanel pwPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JLabel jpw1 = new JLabel("비밀번호 : ", JLabel.CENTER);
		JPanel pwPanel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));		
		JPasswordField jtf2 = new JPasswordField(10);
		pwPanel.add(jpw1);
		pwPanel.add(jtf2);
		jp1.add(pwPanel);
		jp1.add(pwPanel2);
		
		
		// 로그인
		JPanel loginPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JButton jLogin = new JButton("로그인");
		// 회원가입
		JPanel joinPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JButton join = new JButton("회원가입");
		
		loginPanel.add(jLogin);
		joinPanel.add(join);
		jp1.add(loginPanel);
		jp1.add(joinPanel);
		
		JPanel jp2 = new JPanel();
		jp2.setLayout(new FlowLayout());
		jp2.add(jp1);
		
		setLayout(new BorderLayout());
		
		add(title, BorderLayout.NORTH);
		add(jp2, BorderLayout.CENTER);
		
		
		
		setBounds(300, 300, 500, 250); //절대위치와 크기 지정
		
		setResizable(false);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new LoginScreen();
		
	}

}
