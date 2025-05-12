package 자바7_3월9일;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Lotto extends JFrame {
		
	Lotto() {
		setTitle("로또 생성기");
		setSize(550, 500);	
		setLayout(new BorderLayout(0,5));
		setLocationRelativeTo(null);	//괄호안에 null을 넣어주면 Frame창이 가운데 출력
		makeElements(); 	//패널을 나누는
		setVisible(true);
		
		
		
		
		
	}

	private void makeElements() {	//기능을 만드는 요소

		JPanel northPanel = new JPanel();
		JPanel southPanel = new JPanel();
		
		JTextArea text = new JTextArea();
		JScrollPane textPanel = new JScrollPane(text); //스크롤 만들어주는
		
		JButton[] num = new JButton[6];		//num이라는 6개의 공간을 만들어준다
		JPanel numPane = new JPanel();		//numPane의 이름을 가진 패널을 만든다
		numPane.setLayout(new GridLayout(1, 6, 10, 0));		//numPane패널을 그리드레이아웃으로 1줄 6칸을 만든다
		for(int i =0; i < num.length; i++) {	//i를 num의 담긴 숫자만큼 1씩 커지며 버튼을 만든다
			num[i] = new JButton(" ");
			numPane.add(num[i]);
			
		}
		
		JButton btn = new JButton("로또 번호 생성하기 ");
		btn.addActionListener((ActionListener) new MyActionListener(num, text));
			
		northPanel.add(numPane);
		southPanel.add(btn);
		
		add(textPanel, BorderLayout.CENTER);
		add(northPanel, BorderLayout.NORTH);
		add(southPanel, BorderLayout.SOUTH);
		
	}

	class MyActionListener implements ActionListener {
		
		JButton[] buttons;
		JTextArea textArea;

		public MyActionListener(JButton[] buttons, JTextArea textArea) {
			// TODO Auto-generated constructor stub
			this.buttons = buttons;
			this.textArea = textArea;
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			ArrayList<String> lottoNum = new ArrayList<>();
			
			int i = 0;		//반복문 와일문을 쓰는 이유 = 중복된 값을 날리고 버튼을 누르지 않을때까지 계속 출력시키기 위해
			
			while(i < 6	) {		
				Integer temp = (int)(Math.random() * 45 + 1);		//temp는 0에서 1을 더하고 44에서 1을 더해 1부터 45까지 랜덤으로 들어간다
				String element;
				
				if(temp < 10) {			
					element = "0" + String.valueOf(temp);
				}else {
					element = String.valueOf(temp);
				}
				if(!lottoNum.contains(element)) {		//중복되는 수 포함여부 확인할때
					lottoNum.add(element);
					i++;					
				}
			}
			
			String message = "                 ";
			
			for(int j = 0; j < buttons.length; j++) {		//j를 buttons의 길이(6)만큼 1씩증가시켜준다
				buttons[j].setText(lottoNum.get(j));		//
				message += lottoNum.get(j) + "                ";
			}
			
			textArea.append(message + "\n");  //	append =인수로 전달된 값을 변환 후 마지막에 추가
			textArea.setCaretPosition(textArea.getDocument().getLength());
			
		}
	}
		public static void main(String[] args) {
			new Lotto();
		
	}

}
