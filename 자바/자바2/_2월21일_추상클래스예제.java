package 자바2;

/**
 *추상클래스란 추상메서드 한개 이상 포함한 클래스이며 인스턴스를 생성할 수 없다. 
 */
abstract class ContentSender{
	String title;
	String name;
	
	public ContentSender() {}
	
	public ContentSender(String title, String name) {
		super();
		this.title = title;
		this.name = name;
	}
	//추상메서드 -> 상속을 통해서 반드시 재정이 되어야지만 인스턴스를 생성할 수 있다.
	abstract void sendMsg(String content);
}

class Kakao extends ContentSender {

	String content;
	
	public Kakao(String title, String name, String content) {
		super(title, name);
		this.content = content;
	}
	
	
	@Override
	void sendMsg(String recipient) {
		System.out.println("제목 =" + this.title);
		System.out.println("이름 =" + this.name);
		System.out.println("내용 =" + this.content);
		System.out.println("받는 사람 =" + recipient);
	}
	
}

class letterSender extends ContentSender {
	String content;
	
	public letterSender(String title, String name, String content) {
		super(title, name);
		this.content = content;
	}
	
		@Override
		void sendMsg(String recipient) {
			System.out.println("제목 =" + this.title);
			System.out.println("이름 =" + this.name);
			System.out.println("내용 =" + this.content);
			System.out.println("받는 사람 =" + recipient);
		
	}
	
}



public class _2월21일_추상클래스예제 {

	public static void main(String[] args) {
		//인스턴스를 생성할 수 없지만 자식에서 오버라이딩을 해주면 인스턴스를 생성할 수 있다.
		ContentSender cs1 = new letterSender("sms문자", "홍길동", "안녕");
		cs1.sendMsg("서길동");
		System.out.println();
		
		ContentSender cs2 = new Kakao("카톡문자", "서길동", "추상클래스");
		cs2.sendMsg("홍길동");
		
	}

}
