package day18;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


// ��ư Ŭ�� �� Bugs Music ������Ʈ�� ���� ��Ʈ�� ������ ���� 10�� ����ϴ� ���α׷�
public class MusicChart extends JFrame implements ActionListener {			// MusicChartŬ������ JFrame�� ��ӹ޾� GUIâ���� ���, 
																			// ActionListener �������̽��� �����Ͽ� ��ư Ŭ�� �̺�Ʈ ó��
	JLabel[] labels;														// �뷡 ������ ǥ���� JLabel �迭 
	JButton bt;																// �����͸� �������� ��ư
	JLabel log;																// ��ư Ŭ�� Ƚ���� ǥ���� ��
	int count = 0;															// ��ư Ŭ�� Ƚ���� �����ϴ� ���� �ʱ�ȭ
	
	MusicChart(){															// ������ : �ʱ�ȭ �۾� ����
		
		// ��ư ���� �� ����
		bt = new JButton("GET!!!");											// JButton ��ü�� ������ "GET!!!" ��ư ����
		bt.setBounds(20, 20, 340, 30);  									// ��ư ��ġ(x, y)�� �ʺ�, ����(width, height) ����
		add(bt);															// �����ӿ� ��ư �߰�			
		bt.addActionListener(this);											// ��ư�� �׼� ������ ����
		
		// ���� 10�� �뷡�� ǥ���� �� �迭 �ʱ�ȭ
		labels = new JLabel[10];											// JLabel �迭�� ������ ���� 10���� �� ������ ǥ���� ������ �̸� ����									
		for(int i=0; i<10; i++) {									
			labels[i] = new JLabel("Ranking " + (i+1));						// �� �󺧿� "Ranking 1", "Ranking 2",... "Ranking 10"���� �ʱ� �ؽ�Ʈ ����
			labels[i].setBounds(20, 80 + (40*i), 340, 30);					// ���� ��ġ�� ũ�� ����
																			// x ��ǥ 20, y ��ǥ�� 80 + (40 * i)�� �����Ͽ�, �󺧵��� �������� �Ʒ��� ��ġ�ǵ��� ��
																		    // y �� 80���� �����ϰ�, �� ���� 40 �ȼ��� �Ʒ��� ������ (40 * i�� ���)
																		    // ���� �ʺ� 340, ���� 30���� ����
			add(labels[i]);													// ������ ���� �����ӿ� �߰��Ͽ� ȭ�鿡 ǥ�õǵ��� ��
		}
		
		
		// �α� �� �ʱ�ȭ �� ����
		log = new JLabel("Log Region");										// "Log Region" �ؽ�Ʈ�� ���� log������ ����								
		log.setBounds(20, 480, 340, 30);									// log ���� ��ġ�� ũ�� ����
		add(log);															// log ���� �����ӿ� �߰�
		
		// ������ ����
		setSize(400, 600);													// ������ ũ�⸦ �ʺ� 400, ���� 600���� ����
		setLayout(null);													// Layout�� null�� �����Ͽ� ���� ��ġ�� ��ġ
		setVisible(true);													// �������� ȭ�鿡 ���̵��� ����
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicChart mc = new MusicChart();									// MusicChart��ü �����Ͽ� mc������ ����, ������ ȣ���Ͽ� ������ ǥ��
	}
	
	// ActionEvent�� �߻����� �� ȣ��Ǵ� �޼���
	public void actionPerformed(ActionEvent e) {
		
		// ��ư���� �̺�Ʈ�� �߻��ߴ��� Ȯ��
		if(e.getSource() == bt) {											// ��ư�� Ŭ���ߴٸ�?
			System.out.println("Button Clicked!!");							// �ֿܼ� "Button Clicked!!" ���
			count++;														// Ŭ�� Ƚ���� 1 ������Ŵ
			log.setText("Button Clicked!! Count : " + count);				// log �󺧿� Ŭ�� Ƚ���� ������Ʈ�Ͽ� ǥ��
		}
		
		// Bugs Music ��Ʈ�� ������ URL
		String URL = "http://music.bugs.co.kr/chart";
		
		
		try {
			Document doc = Jsoup.connect(URL).get();						// Jsoup ���̺귯���� ����Ͽ� URL���� HTML ������ ������
			System.out.println(doc);										// ������ HTML ������ ���
			
			Elements elements = doc.select("p.title");						// p.title = p�±� �� class�� title�� ��
																			// CSS Selector ǥ�� ���� �ؼ�
			
			int rank = 1;													// ������ ��Ÿ�� ���� �ʱ�ȭ
			
			// ������ �뷡 ���� ��ҵ鿡 ���� �ݺ��� ����
			for(Element element : elements) {
				String text = "Ranking " + rank + " : " + element.text();	// ���� + ���� �ؽ�Ʈ ����
				System.out.println(text);									// ������ �ؽ�Ʈ ���
				labels[rank-1].setText(text);								// �ε����� 0��° �����̱⶧���� -1�� �� �� ������ �ؽ�Ʈ�� JLabel�� �����Ͽ� ȭ�鿡 ǥ��
				if(rank == 10) break;										// 10�������� ǥ���ϰ� �ݺ��� ����
				rank++;
			}
			
			// ��Ƽ��Ʈ �̸��� ���� rank���� �ʱ�ȭ
			rank = 1;
			Elements artists = doc.select("p.artist");						// p �±� �߿��� class�� "artist"�� ��� ����(��Ƽ��Ʈ �̸��� �ش�)
			
			// ������ ��Ƽ��Ʈ ��ҵ鿡 ���� �ݺ��� ����
			for(Element artist : artists) {												
				String text = labels[rank-1].getText();						// �̹� ������ ������ ���� �ؽ�Ʈ�� ������
				text += "[" + artist.text() + "]";							// ���� �ؽ�Ʈ�� ��Ƽ��Ʈ �̸� �߰�
				labels[rank-1].setText(text);								// ������Ʈ�� �ؽ�Ʈ�� JLabel�� ����			
				if(rank == 10) break;										// 10�������� ǥ���ϰ� �ݺ��� ����
				rank++;
			}
		}

		catch(Exception ex) {												// ����ó��
			ex.printStackTrace();											// ���� �߻� �� ���� �޽��� ��� �ڵ�

		}
	}

}
