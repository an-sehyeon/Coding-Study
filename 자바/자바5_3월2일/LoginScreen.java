package 자바5_3월2일;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginScreen extends JFrame{
	
	public LoginScreen() {
		setTitle("제품관리시스템");
		
		JPanel title = new JPanel();
		
		JLabel login = new JLabel("로그인 화면");
		
		login.setForeground(new Color(3, 0, 153)); //setForeground = 폰트와 백그라운드를 합친 것, 글자색 변경
		login.setFont(new Font("궁서체", Font.BOLD, 20));  //글자체
		
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
		
		/**
		 * 버튼영역
		 */
		JPanel loginPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JButton jLogin = new JButton("로그인");
		
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
		
		setResizable(false); //화면크기 고정
		
		setVisible(true);
		
		jLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String myId = jtf1.getText();
				String myPw = new String(jtf2.getText());
				
				JOptionPane.showMessageDialog(null,  "아이디 : " + myId + ", 비밀번호 :" +  myPw);
			}
		
		});
		
		join.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new JoinScreen();
				
				dispose();	//현재의 fram을 종료시키는 메서드
			}
			
		});
		
	}
	
	public static void main(String[] args) {
		new LoginScreen();
		
	}

}
