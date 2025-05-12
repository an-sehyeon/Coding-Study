package 자바2;


class Ez {
	int x;
	int y;
	
	Ez(int x, int y){
		this.x = x;
		this.y = y;
		
	}
	
	@Override
	public boolean equals (Object obj) {
		if(obj instanceof Ez) {
			Ez down = (Ez)obj;
			return this.x == down.x && this.y == down.y;
		}
		return false;
	}
}

public class _2월23일_오브젝트1 {

	public static void main(String[] args) {
		Ez ob1 = new Ez(10, 20);
		Ez ob2 = new Ez(30, 40);
		Ez ob3 = new Ez(10, 20);
		
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.equals(ob3));
		System.out.println(ob2.equals(ob3));

	}

}
