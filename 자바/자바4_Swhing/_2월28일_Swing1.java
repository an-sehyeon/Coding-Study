package 자바4_Swhing;

import javax.swing.JFrame;

/**
 *Swing은 자바의 GUI(그래픽유저인터페이스)를 가르치는것이며 javax.swing 패키지를 사용함 
 *자바에서 GUI를 swing와 AWT 패키지를 통해 제공
 *
 *1)AWT										2)Swing
 *자바가 처음 나왔을때 함께 배포된 GUI 라이브러리  		AWT기술을 기반으로 순수 자바언어로 만든 라이브러리
 *java.awt 패키를 사용							java,swing패키지를 사용
 *중량 컴포넌트									경량 컴포넌트
 *Native OS의 GUI 컴포넌트의 도움을 받아 작동		Native OS에 의존하지 않음
 *빠른속도, OS에 많은 부담을 줌						화려한 고급 컴포넌트 + AWT
 *											JComponet 상속받아야 사용가능
 *											AWT의 Container를 상속받는 클래스 : JApplet, JDialog, JFrame 등..
 *
 *JComonet : 스윙 컴포넌트의 공통 속성을 구현한 추상 클래스, AWT의 Component를 상속 받은 new JComponent() 인스턴스를 생성하지 않는다.
 *
 *스윙 GUI프로그램 만드는 방법
 *1. 스윙 프레임 작성
 *2. main()메소드 작성
 *3. 프레임에 스윙 컴포넌트 붙이기, 스윙 패키지문 사용
 *
 *1) 컨테이너										2)컴포넌트
 *다른 GUI 컴포넌트를 포함할 수 있는 컴포넌트 				컨테이너에 포함되어야 화면에 출력될 수 있는 순수 컴포넌트
 *java.awt.Container 상속, 다른 컨테이너 포함O			모든 컴포넌트는 java.awt.Componet를 상속받음
 *												모든 스윙 컴포넌트는 javax.swing.JComponet를 상속받음
 *
 *AWT컨테이너 : Panel, Frame, Applet, Dialog등
 *Swing 컨테이너 : 앞에 J가 붙은 것(JApplet, JDialog, JFrame)
 *	
 */

public class _2월28일_Swing1 extends JFrame {
	//객체생성할 때에는 클래스명과 동일해야된다.
	public _2월28일_Swing1() {
		setTitle("JFrame");
		setSize(400, 400);
		setVisible(true);	//화면의 출력여부 확인(입력하지않으면 화면에 출력되지않음)
	}
	

	public static void main(String[] args) {
		_2월28일_Swing1 frame = new _2월28일_Swing1();
		
		
			
	}

}
