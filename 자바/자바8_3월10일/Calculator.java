package 자바8_3월10일;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements KeyListener{
	
	private JTextField imputSpace;
	private String num = "";
	private ArrayList<String> equation = new ArrayList<String>();
	
	public Calculator() {
		setLayout(null);
		
		imputSpace = new JTextField();
		imputSpace.setEditable(false);
		imputSpace.setBackground(Color.WHITE);
		imputSpace.setHorizontalAlignment(JTextField.RIGHT);
		imputSpace.setFont(new Font("Aral", Font.BOLD, 50));
		imputSpace.setBounds(8,10, 270, 70);
		
		
		JPanel button = new JPanel();
		button.setLayout(new GridLayout(4, 4, 10 ,10 ));
		button.setBounds(8, 90, 270, 235);
		
		String button_names[] = {"C", "÷", "x", "=", "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "0"};
		JButton buttons[] = new JButton[button_names.length];
		
		for(int i = 0; i < button_names.length; i++) {
			buttons[i] = new JButton(button_names[i]);
			buttons[i].setFont(new Font("Arial", Font.BOLD, 20));
			if(button_names[i]=="C") buttons[i].setBackground(Color.red);
			else if((i >= 4 && i <= 6 ) || (i >= 8 && i <=10) || (i >= 12 && i <= 14))buttons[i].setBackground(Color.BLACK);	
			else buttons[i].setBackground(Color.gray);
			buttons[i].setForeground(Color.WHITE);	
			buttons[i].setBorderPainted(false);
			buttons[i].addActionListener(new PadActionListener());
			button.add(buttons[i]);
		}
		
		add(imputSpace);
		add(button);
		
		setTitle("계산기");
		setVisible(true);
		setSize(300, 370);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	

	
	class PadActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String operation = e.getActionCommand();
			if(operation.equals("C")) {
				imputSpace.setText("");
			}else if(operation.equals("=")) {
				String result = Double.toString(calculate(imputSpace.getText()));
				imputSpace.setText("" + result);
				num = "";
			}else {
				imputSpace.setText(imputSpace.getText() + e.getActionCommand());
			}	
		}
		
	}
	
	private void fullTextParsing(String imputText) {
		equation.clear();
		
		for(int i = 0; i < imputText.length(); i++) {
			char ch = imputText.charAt(i);
			
			if(ch == '-' | ch == '+' | ch == 'x' | ch == '÷') {
				equation.add(num);
				num = "";
				equation.add(ch + "");
			}else {
				num = num + ch;
			}
		}
		equation.add(num);
	}
	
	public double calculate(String inputText) {
		fullTextParsing(inputText);
		
		double prev = 0;
		double current = 0;
		String mode = "";
		
		for(String s : equation) {
			if(s.equals("+")) {
				mode = "add";
			}else if(s.equals("-")) {
				mode = "sub";
			}else if(s.equals("x")) {
				mode = "mul";
			}else if(s.equals("÷")) {
				mode = "div";
			}else {
				current = Double.parseDouble(s); // 나머지값의 경우 문자열을 더블로 변경
				if (mode == "add") {
					prev += current;
				}else if(mode == "sub") {
					prev -= current;
				}else if(mode == "mul") {
					prev *= current;
				}else if(mode == "div") {
					prev /= current;
				}else {
					prev = current;
				}
			}
		}
		return prev;
		
	}
	
	public static void main(String[] args) {
		new Calculator();
	
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int sum = e.getKeyCode();
		
		if(sum == KeyEvent.VK_ENTER) {
			String result = imputSpace.getText();
			equation.add(result);
			imputSpace.setText(result);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}

