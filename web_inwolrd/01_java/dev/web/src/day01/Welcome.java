

package day01;

public class Welcome {
	public static void main(String[] args) {
		System.out.println("welcome to my house");
		
		// "welcome to my house"�� ���������� ����ϰ� ���� �ٲ۴�.
		// ANSI �̽������� �ڵ带 ����Ͽ� �۾� ������ ���������� ���� 
		System.out.println("\033[91m" + "welcome to my house" + "\033[0m");	   

		System.out.print("welcome to your house");
		System.out.print("welcome to his house");	// print�� printfln�� ����
		
	}
}
