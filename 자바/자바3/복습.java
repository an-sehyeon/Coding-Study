package 자바3;

import java.awt.BorderLayout;
import java.awt.TextField;
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

public class 복습 extends JFrame implements ActionListener, KeyListener{
		private TextField inputMsg;
		private DefaultListModel<String> model;
		private JList jlist;
		
		public 복습() {
		setSize(900, 200);
		setLocation(200, 100);
		
		setLayout(new BorderLayout());
		
		JLabel label = new JLabel("이름을 입력하세요.");
		inputMsg = new TextField(10);
		
		JButton button = new JButton("확인");
		button.setActionCommand("add");
		button.addActionListener(this);
		
		JButton deletebtn = new JButton("삭제");
		deletebtn.setActionCommand("delete");
		deletebtn.addActionListener(this);
		
		JPanel panel = new JPanel();
		
		panel.add(inputMsg);
		panel.add(button);
		panel.add(deletebtn);
		panel.add(label);
		
		add(panel, BorderLayout.WEST);
		
		jlist = new JList<>();
		
		model = new DefaultListModel<>();
		model.addElement("안녕하세요");
		model.addElement("저는");
		model.addElement("27살 영천사는");
		model.addElement("안세현입니다.");
		
		jlist.setModel(model);
		
		JScrollPane sc = new JScrollPane(jlist,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
				);
		
		add(sc, BorderLayout.CENTER);
		inputMsg.addKeyListener(this);
		setVisible(true);
	
	}
public static void main(String[] args) {
	new 복습();
	
 }
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String Command = e.getActionCommand();
	
	if(Command.equals("복습")) {
		String msg = inputMsg.getText();
		JOptionPane.showInputDialog(this, msg);
	}else if(Command.equals("delete")) {
		inputMsg.setText("");
	}
	
	
}
}

