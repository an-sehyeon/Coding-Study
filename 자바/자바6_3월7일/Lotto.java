package 자바6_3월7일;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Lotto extends JFrame {
	public Lotto() {
		setTitle("로또 생성기");
		setSize(400, 300);
		setLayout(new BorderLayout(0,5));
		makeElements(); 	//패널을 나누는
		setVisible(true);
		
		
		
		
		
	}

	private void makeElements() {
		// TODO Auto-generated method stub
		JPanel northPanel = new JPanel();
		JPanel southPanel = new JPanel();
		
		JTextArea text = new JTextArea();
		JScrollPane textPanel = new JScrollPane(text); //스크롤 만들어주는
		
	}

	public static void main(String[] args) {

	}

}
