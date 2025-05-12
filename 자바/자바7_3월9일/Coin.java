package 자바7_3월9일;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Coin extends JFrame{
	
	private Image background = new ImageIcon("C:\\Users\\ME\\Desktop\\java project\\JAVA\\src\\자바7_3월9일\\image\\mainScreen.png").getImage();
	private Image player = new ImageIcon("C:\\Users\\ME\\Desktop\\java project\\JAVA\\src\\자바7_3월9일\\image\\player.png").getImage();
	private Image coin = new ImageIcon("C:\\\\Users\\\\ME\\\\Desktop\\\\java project\\\\JAVA\\\\src\\\\자바7_3월9일\\\\image\\coin.png").getImage();	
	
	private int playerX, playerY;	//플레이어 위치
	private int playerWidth = player.getWidth(null);	//플레이어와 코인의 충돌여부를 판단하기 위해 각 이미지의 크기도 변수에 담아둠
	private int playerHeight = player.getHeight(null); //플레이어 가로세로 크기
	
	private int coinX, coinY;	//코인위치
	private int coinWidth = coin.getWidth(null);	
	private int coinHeight = coin.getHeight(null);	//코인 가로세로 크기
	
	private int score; //점수판
		
	public Coin() {
		setTitle("동전 먹기 게임");
		setVisible(true);
		setSize(500,500);
		setLocationRelativeTo(null); //괄호 안에 null값을 넣으면 Frame창이 가운데 출력
		setResizable(false);	//	창 크기 고정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	//창을 닫을시 Frame만 종료되는게 아니라 프로세서도 같이 종료
		init();
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
	
	
	public void paint(Graphics g) {
		g.drawImage(background, 0, 0, null);
		g.drawImage(coin, coinX,coinY,null);
		g.drawImage(player, playerX, playerY, null);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Arial", Font.BOLD, 40));
		g.drawString("SCORE : " + score, 30, 80);
	}

	public static void main(String[] args) {
		new Coin();

	}

}
