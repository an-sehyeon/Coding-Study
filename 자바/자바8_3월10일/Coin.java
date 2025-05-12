package 자바8_3월10일;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Coin extends JFrame{
	
	private Image bufferImage;
	private Graphics screenGraphic;
	
	private Image background = new ImageIcon("C:\\Users\\ME\\Desktop\\java project\\JAVA\\src\\자바7_3월9일\\image\\mainScreen.png").getImage();
	private Image player = new ImageIcon("C:\\Users\\ME\\Desktop\\java project\\JAVA\\src\\자바7_3월9일\\image\\player.png").getImage();
	private Image coin = new ImageIcon("C:\\Users\\ME\\Desktop\\java project\\JAVA\\src\\자바7_3월9일\\image\\coin.png").getImage();	
	
	private int playerX, playerY;	//플레이어 위치
	private int playerWidth = player.getWidth(null);	//플레이어와 코인의 충돌여부를 판단하기 위해 각 이미지의 크기도 변수에 담아둠
	private int playerHeight = player.getHeight(null); //플레이어 가로세로 크기
	
	private int coinX, coinY;	//코인위치
	private int coinWidth = coin.getWidth(null);	
	private int coinHeight = coin.getHeight(null);	//코인 가로세로 크기
	
	private int score; //점수판
	
	//키보드 키를 사용할때 데이터 변수는 boolean
	private boolean up, down, left, right;
		
	
	
	public Coin() {
		setTitle("동전 먹기 게임");
		setVisible(true);
		setSize(500,500);
		setLocationRelativeTo(null); //괄호 안에 null값을 넣으면 Frame창이 가운데 출력
		setResizable(false);	//	창 크기 고정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	//창을 닫을시 Frame만 종료되는게 아니라 프로세서도 같이 종료
		
		
		
		addKeyListener((KeyListener) new KeyAdapter() {	//키 리스너
			public void keyPressed(KeyEvent e) {		//키를 눌렀을때 실행되는 메서드, boolean으로 선언하지 않을 경우 두개의 키 값을 입력받지 못함(왼쪽대각선, 오른쪽대각선)
				switch(e.getKeyCode()) {
				case KeyEvent.VK_W :
					up = true;
					break;
					
				case KeyEvent.VK_S :
					down = true;
					break;
					
				case KeyEvent.VK_A :
					left = true;
					break;
					
				case KeyEvent.VK_D :
					right = true;
					break;
				}
			}
			
			
			public void keyReleased(KeyEvent e) {		//키를 땠을 때 실행되는 메서드
				switch(e.getKeyCode()) {
				case KeyEvent.VK_W :
					up = false;
					break;
					
				case KeyEvent.VK_S :
					down = false;
					break;
					
				case KeyEvent.VK_A :
					left = false;
					break;
					
				case KeyEvent.VK_D :
					right = false;
					break;
				}
			}
		});		//키보드 움직임을 처리하기 위한 키 리스너
		
		init();	//게임 초기화
		
		while(true) {
			try {
				Thread.sleep(20);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			keyProcess();
			crashCheck();
		}
		
	}
	
	
	
	public void init() {
		score = 0;	//점수는 0으로 설정해줌
		
		// 플레이어의 좌표가 정중앙에 오도록 함
		playerX = (500 - playerWidth)	/ 2;
		playerY = (500 - playerHeight)	/ 2;
		
		//코인의 위치는 랜덤이여야 하므로 Math.random()을 사용함
		coinX = (int)(Math.random()* (501 - playerWidth));	// 0에서 1사이의 난수가 나오는데 이를 int형으로 변환해서 소수점은 제거 후 이미지 길이를 빼줌
		coinY = (int)(Math.random()* (501 - playerHeight -30)) + 30;	//점수 초기화, 플레이어와 코인 위치 설정도 x좌표와 마찬가지이지만 프레임 들의 상단에 들어갈 스코어 보드판 공간을 고려해서 30을 빼줌
	}
	
	
	//up, down, left, right의 boolean값으로 플레이어를 이동시킬 메서드
	public void keyProcess() {
		// 플레이어의 가로 세로 길이와 이동거리를 계산
		if(up && playerY -3 > 30) playerY-=3;	
		if(down && playerY + playerHeight +3 < 500) playerY+=3;
		if(left && playerX -3 > 0) playerX-=3;
		if(right && playerX + playerWidth +3 < 500) playerX+=3;
	}
	
	
	
	public void crashCheck() {
	if(playerX + playerWidth > coinX && coinX + coinWidth > playerX && playerY + playerHeight > coinY && coinY 
			+ coinHeight > playerY) {
		
		score += 100;
		coinX = (int)(Math.random() * (501 - playerWidth));
		coinY = (int)(Math.random() * (501 - playerHeight - 30)) + 30;
		
		
		}
	}
	
	
	public void paint(Graphics g) {	
		bufferImage = createImage(500, 500);	// 화면 크기의 버퍼 이미지를 생성해주고 getGraphichs()를 통해 그래픽을 받아옴
		screenGraphic = bufferImage.getGraphics();
		screenDraw(screenGraphic);		// 다시 screenDraw를 호출하고 해당 버퍼이미지를 화면에 그려주는 작업을 반복
		g.drawImage(bufferImage,0, 0, null);	// 더블 버퍼링 :
	}
	
	
	
	public void screenDraw(Graphics g) {
		g.drawImage(background, 0, 0, null);
		g.drawImage(coin, coinX,coinY,null);
		g.drawImage(player, playerX, playerY, null);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Arial", Font.BOLD, 40));
		g.drawString("SCORE : " + score, 30, 80);
		this.repaint();
	}

	public static void main(String[] args) {
		new Coin();

	}

}
