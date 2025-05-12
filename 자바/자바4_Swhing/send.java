package 자바4_Swhing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class send extends JFrame implements ActionListener, KeyListener {
	
	private JTextField inputMsg;	//필드 정의하기
	private DefaultListModel<String> model;
	private JList jList;
	
	//생성자
	public send() {
		setSize(800, 500);
		setLocation(100, 100);
		
		setLayout(new BorderLayout());
		
		
		JLabel label = new JLabel("추가할 이름 입력");
		inputMsg = new JTextField(10);
		
		
		//전송버튼
		JButton sendBtn = new JButton("추가");
		sendBtn.setActionCommand("add");	//커맨드 값을 비교하여 ActionListener를 실행
		sendBtn.addActionListener(this);
		
		JButton deleteBtn = new JButton("삭제");
		deleteBtn.setActionCommand("delete");
		deleteBtn.addActionListener(this);
		
		//패널 객체생성
		JPanel panel = new JPanel();
		
		//패널에 UI추가
		panel.add(inputMsg);
		panel.add(sendBtn);
		panel.add(deleteBtn);
		panel.add(label);
		
		add(panel, BorderLayout.NORTH);
		
		jList = new JList<>();
		
		model = new DefaultListModel<>();
		model.addElement("안녕하세요");
		model.addElement("자바");
		model.addElement("강의 입니다.");

		jList.setModel(model);
		
		JScrollPane sc = new JScrollPane(jList, 
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		add(sc, BorderLayout.CENTER);
		inputMsg.addKeyListener(this);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new send();
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//이벤트가 발생한 버튼에 설정된 action commend 읽어오기
		String command = e.getActionCommand();
		
		if(command.equals("send")) {
			//JTextField에 입력한 문자열 읽어오기
			String msg = inputMsg.getText();
			JOptionPane.showMessageDialog(this,  msg);
		}else if(command.equals("delete")) {
			inputMsg.setText("");
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}
	
}

