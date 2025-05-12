package 자바2;

class TV{
	String brand;
	int year;
	int inch;
	
//	@Override
//	public String toString() {
//		return "brand =" + brand + "에서 만든" + 년도 + "년형" + 크기 + "인치 TV"+"";
//	}
	TV(String brand, int year, int inch){
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	
	public void show() {
		System.out.println(brand + "에서 만든" + year + "년형" + inch + "인치TV ");
	}
	
	
}

public class _2_14_문제1 {

	public static void main(String[] args) {
		/**
		 * main()메서드를 실행하였을때 예시와 같이 출력되도록 TV객체를 작성하세요
		 * ex) LG에서 만든 2017년형 32인치 TV
		 */
//		TV tv = new TV();
//		tv.brand = "LG";
//		tv.year = 2017;
//		tv.inch = 32;
		
		TV myTV = new TV("LG",2017,32);
		myTV.show();
	
		
		
		
		
	}

}


