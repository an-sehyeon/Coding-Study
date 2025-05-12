package 자바2;

/**
 *싱글톤 구현
 *ShopService 객체를 싱글톤으로 만들어보세요
 *ShopService Example 클래스에서 shopService의 getInstance() 메소드로 싱글톤을 얻을수 있도록
 *ShopService 클래스를 작성해보세요
 *
 */

class ShopService{
	String shopName;
	String manager;
	
	private static ShopService inctance;
	
	private ShopService() {};
	
	public static ShopService getInstance() {
		if(inctance == null);
		inctance = new ShopService();
		return inctance;
		
	}
}

public class _2월16일_싱글톤구현 {

	public static void main(String[] args) {

		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();

		obj1.shopName = "GS반월당점";
		obj2.manager = "홍길동";
		
		if(obj1 == obj2) {
			System.out.println("같은 ShopService 객체 입니다");
		}else {
			System.out.println("다른 ShopService 객체 입니다");
		}
	}

}
