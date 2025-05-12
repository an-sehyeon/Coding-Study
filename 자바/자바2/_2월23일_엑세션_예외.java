package 자바2;

/**
 * Exception
 * 개발자가 어떤 에러가 출력될지 미리 예측을 하고 직접 예외사항을 처리하는것
 *
 *대표적으로 많이 쓰이는 예
 *1) IOException : 입출력에 관한 예외발생
 *2) NullPiont : null객체를 참조할때 발생
 *3) Arthmetic : 어떤 수를 0으로 나눴을때 발생
 *4) ArrayIndexOutOfBounds : 배열을 참조하는 인덱스가 잘못된 경우 
 *5) NegativeArraySize : 배열의 크기가 음수 값인 경우
 *6) OutofMemory : 사용가능한 메모리가 없는 경우
 *7) ClasCast : 적절치 못하게 클래스를 형 변환하는 경우
 *8) NoClassDefFound : 원하는 클래스를 찾지 못하였을 경우
 *
 *
 *
 *
 *예외처리(try - catch)의 기본구조
 *
 *try {
 *		예외발생할 가능성이 있는 문장
 *}catch(NullPiontException e1) {
 *	NullPiontException이 발생했을 경우, 이를 처리하기 위한 문장 작성
 *	보통 예외 메세지를 출력하고 로그로 남김
 *	Log.error("Error: ", e.getMeassage)
 *} catch (Exception2 e2) {
 *
 *}catch(ExceptioN eN {
 *
 *}finally {
 *
 *}
 */



public class _2월23일_엑세션_예외{

	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.toString());
		} catch(NullPointerException e) {
			e.printStackTrace(); //예외정보
		}
		System.out.println("실행코드1");
		System.out.println("실행코드2");

	}

}
