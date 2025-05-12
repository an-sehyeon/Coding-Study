package 자바2;

interface Remorcon1{
	void turnOn();
	void turnOff();
}

class Tv implements Remorcon1{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끕니다.");
	}
	
	public void search() {
		
	}
	
}

class SmartTv extends Tv implements Remorcon1{
	public void search(String url) {
		System.out.println(url + "로 페이지를 이동하겠습니다.");
	}
}

public class _2월21일_인터페이스TV {
	
	public static void turnOn(Remorcon1 control) {
		control.turnOn();
	}
	
	public static void turnOff(Remorcon1 control) {
		control.turnOff();
	}
	
	public static void search(Tv tv, String url) {
		search(tv,url);
	}
	
public static void main(String[] args) {
	Tv tv = new Tv();
	SmartTv stv = new SmartTv();
	tv.turnOn();
	tv.turnOff();
	stv.search("www.naver.com");
}
}
