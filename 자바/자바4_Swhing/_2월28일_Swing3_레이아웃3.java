package 자바4_Swhing;

/**
 * GridLayout
 * 컨테이너 공간을 동일한 사각형 격자(그리드)로 분할하고 각 셀에 하나의 컴포넌트 배치
 * 생성자에 행 수와 열 수 지정(vGap, hGap)
 * 
 * GridLayout구조(int rows,int cols, int hGap, int vGap)
 * rows : 그리드 행 수, 디폴트 1
 * cols : 열 수 디폴트 1
 * hGap : 좌우 
 * vGap : 수직 디폴트 0
 */

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class _2월28일_Swing3_레이아웃3 extends JFrame{
	public _2월28일_Swing3_레이아웃3() {
		setTitle("GridLayout");
		setSize(300, 200);
		setVisible(true);
		
		GridLayout grid = new GridLayout(4, 2);
		grid.setVgap(5);
		
		Container c = getContentPane();
		c.setLayout(grid);
		
		c.add(new JLabel("이름"));
		c.add(new TextField(""));
		
		c.add(new JLabel("학번"));
		c.add(new TextField(""));
		
		c.add(new JLabel("학과"));
		c.add(new TextField(""));
		
		c.add(new JLabel("과목"));
		c.add(new TextField(""));
		
		setSize(300,200);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new _2월28일_Swing3_레이아웃3();
		
	}

}
