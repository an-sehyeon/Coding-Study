package 자바5_3월2일;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JoinScreen extends JFrame	 {

	String choice = null;

	public JoinScreen() {
		setTitle("회원관리 화면");
		
		JLabel title = new JLabel("회원가입"+ JLabel.CENTER);
		title.setForeground(new Color(5, 0, 153));
		title.setFont(new Font("나눔고딕", Font.BOLD, 30));
		
		//컴포넌트 영역
		JButton join = new JButton("회원가입");
		JButton cancel = new JButton("취소");
		
		JTextField id = new JTextField(10);
		JPasswordField pw = new JPasswordField(10);
		JTextField name = new JTextField(10);
		JTextField phone = new JTextField(10);
		
		
		JRadioButton client = new JRadioButton("고객");
		JRadioButton manager = new JRadioButton("관리자");
		JRadioButton etc = new JRadioButton("기타");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(client);
		bg.add(manager);
		bg.add(etc);
		
		//라디오 패널
		JPanel radioPanel = new JPanel();
		radioPanel.add(client);
		radioPanel.add(manager);
		radioPanel.add(etc);
		
		//컴포넌트 패널
		JPanel idPanel = new JPanel();
		idPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		idPanel.add(new JLabel("아이디 :"));
		idPanel.add(id);
		
		JPanel pwPanel = new JPanel();
		pwPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		pwPanel.add(new JLabel("비밀번호 :"));
		pwPanel.add(pw);
		
		JPanel namePanel = new JPanel();
		namePanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		namePanel.add(new JLabel("이	름 :"));
		namePanel.add(name);
		
		JPanel phonePanel = new JPanel();
		phonePanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		phonePanel.add(new JLabel("연 락 처 :"));
		phonePanel.add(phone);
		
		JPanel formPanel = new JPanel();
		formPanel.setLayout(new GridLayout(4, 1));
		formPanel.add(idPanel);
		formPanel.add(pwPanel);
		formPanel.add(namePanel);
		formPanel.add(phonePanel);
		
		//버튼패널
		JPanel panel = new JPanel();
		panel.add(join);
		panel.add(cancel);
		
		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(new FlowLayout());
		contentPanel.add(radioPanel);
		contentPanel.add(formPanel);
		contentPanel.add(panel);
		
		
		
		add(title, BorderLayout.NORTH);
		add(contentPanel, BorderLayout.CENTER);
		setBounds(200, 200, 250, 300);
		setVisible(true);
		
		
		join.addActionListener((ActionListener) new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String IdPanel = id.getText();
				String PwPanel = new String(pw.getText());
				String namePanel = name.getText();
				String phonePanel = phone.getText();
				
				if(client.isSelected()) {
					choice = client.getText();
				}else if (manager.isSelected()) {
					choice = manager.getText();
				}else if (etc.isSelected()) {
					choice = etc.getText();
				}
				
				
				JOptionPane.showMessageDialog(null,  "아이디 : " + IdPanel + ", 비밀번호 :" + PwPanel + ", 이 름 :"+ namePanel + ", 연 락 처 : "+ phonePanel + ", 가입유형 : " + choice);
			}
			
		});
		
		cancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new LoginScreen();
				dispose();
			}
			
		});
		
	
	}

//public static void main(String[] args) {
//	new JoinScreen();
//	
//}
}





