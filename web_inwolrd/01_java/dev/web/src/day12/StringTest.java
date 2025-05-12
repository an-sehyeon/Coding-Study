package day12;

import util.MyUtil;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyUtil.cp("String Class");							// MyUtilŬ������ cp�޼��带 ȣ���Ͽ� ���ڿ� ���
		
		// 1. length()
		String str1 = "qwerqwerqwrqwerqewrqwerqwerqerw";	// ���� ���� Ȯ��
		String str2 = "�ѱ��� �� �ڷ� Ĩ�ϱ�?";					// �ѱ۵� 1�ڷ� �ν�
		MyUtil.p("[lenght()] eng : " + str1.length());		// MyUtilŬ������ p�޼��带 ȣ���Ͽ� ���ڿ� + str1�� ���ڿ� ���� ���
		MyUtil.p("[lenght()] kor : " + str2.length());		// MyUtilŬ������ p�޼��带 ȣ���Ͽ� ���ڿ� + str2�� ���ڿ� ���� ���
		
		
		// 2. charAt()
		String str3 = "�̰͵� �ѱ��� �ñ��ؿ�";					// String Ÿ�Կ� str3������ ���ڿ� ����
		MyUtil.p("[charAt()] : " + str3.charAt(5));			// charAt�Լ��� Ȱ���Ͽ� str3�� ���ڿ��� 6��° ���� ���, ���鵵 ����
		
		
		// 3. equals, equalsIgnoreCase
		String str4 = new String ("abcde");
		String str5 = new String ("abcde");
		MyUtil.p("[equals()] : str4 == str5 : " + (str4==str5));								// "=="�����ڴ� �� ���� ������ ���� ��ü�� �����ϴ��� Ȯ��, 
																								// �ٸ� �޸� �ּҿ� �Ҵ�� ��ü�̹Ƿ� ����� false
		MyUtil.p("[eauals()] str4.eauls(str5) : " + str4.equals(str5)); 						// equals �޼���� ���ڿ��� ������ ��, ���ڿ��� ���� ������ ������� true
		String str6 = new String("ABCDE");
		MyUtil.p("[equals()] str4.equalsIgnoreCase(str6) : " + str4.equalsIgnoreCase(str6));	// equalsIgnoreCase �޼���� ��ҹ��ڸ� �����ϰ� ���ڿ� ������ ��
		
		// 4. replace()
		String str7 = "Heaven helps those who help themselves";
		String str8 = "help";
		MyUtil.p("[replace()] : " + str7.replace(str8, "____"));	// str7�� ���ڿ� �� str8�� �Ҵ�� ���ڿ��� help�� "____"�� ��ü
		String str9 = str7.replace("e","_");						// str7�� ���ڿ� �� "e"�� "_"�� ��ü
		MyUtil.p("[replace()] : " + str9);
		
		
		// 5. substring()
		String str10 = str7.substring(0,4);							// str7 ������ ��� ���ڿ��� ù��°���ں��� 4��° ���ڱ��� str10�� �Ҵ�
		MyUtil.p("[substring(0,4)] : " + str10);					
		
		// �� ��° ���ڸ� �����ϴ� ���
		String str11 = str7.substring(5);							// str7�� 1��°���� 4��°������ ���ڸ� �����ϰ� str11�� �Ҵ�
		MyUtil.p("[substing(5)] : " + str11);
		
		// �ǽ� ���� : str12�� str7�� ������ �ټ� ���ڸ� �����ÿ�.
		String str12 = str7.substring(str7.length()-5);				// str7�� ���� ���� -5�� �� ���� ù��° ���ں��� �����ϰ� ������ ���� ��� 
		MyUtil.p("[substring()] : " + str12  );
		
		
		// 6.trim()
		MyUtil.p("[trim()] : " + "       qwerqwrqerqer       ".trim());		// ���ڿ��� ���� ���� �� ���
		
		
		// 7. split()
		String[] str13 = str7.split(" helps ");						// str7�� ���ڿ� �� "helps" ���ڿ��� �������� �и��Ͽ� ���ڿ� �迭�� str13�� ����
		for(String s : str13) {										// str13�� ����� ���ڿ� �迭�� ��Ұ��� �ݺ��ϸ� ��� 
			MyUtil.p("[split---()] : " + s);
		}
		
		// �ܾ
		String[] str14 = str7.split(" ");							// str7�� ���ڿ� �� ������ �������� �и��Ͽ� str14 �迭�� ����
		for(String s : str14) MyUtil.p("[split()] : " + s);			// �ݺ��ϸ� str14�� �迭 ��Ұ��� �ϳ��� ���
		
		
		// ���ں�
		String[] str15 = str7.split("");							// str7�� ���ڿ��� ���������� �и��Ͽ� str15�� �迭�� ����
		for(String s : str15) MyUtil.p("[split15()] : " + s);		// str15�� ��� �迭�� �ϳ��� �ݺ��ϸ� ��� 
		
		
		// �����ڰ� 2���� �� ��� �� �� ������? e �Ǵ� ����(space)
		String[] str16 = str7.split("[ e]");						// str7�� ���ڿ� �� 'e' �Ǵ� ������ �������� �и��Ͽ� ���ڿ��� str16�� �迭�� ����
		for(String s : str16) MyUtil.p("[split16()] : " + s);			// str16�� ��� �迭�� �ݺ��ϸ� ���
		
		
		// 8. matches(regular expraession)
		String str17 = "298-182318-82321793";						// string Ÿ���� ���ڿ�, str17�� �ʱ�ȭ
		String regExp = "[0-9]{3,4}[-][0-9]{5,7}[-][0-9]{6,100}";	// [0-9] {3,4} : 0~9������ ���ڰ� 3������ 4�� ...
		boolean result = str17.matches(regExp);						// str17�� matches �޼��带 Ȱ���Ͽ� regExp ��Ģ�� ��ġ�ϴ��� �˻� �� result�� ����
		MyUtil.p("[matches()] : " + result);
		
		String fileName = "data.zip";
		String checkRule = "(.U?\\.(exe|sh|zip|alz)$)";
		result = fileName.matches(checkRule);										// fileName�� checkRule ��Ģ�� �����ϴ����� ����� result�� ����
		MyUtil.p("[matches()] : " + (result? "��� ���� ���ϴ°ž�":"���ε尡��"));			// fileName�� checkRule ��Ģ�� �����Ѵٸ� "��� ���� ���ϴ� �ž�" ���
																					// ��Ģ�� �������� �ʴ´ٸ� "���ε� ����" ���
		
		// phoneNum�� ��ȭ��ȣ Ÿ������ �˻�
		String phoneNum = "011-123-2314";
		result = chekPhoneNumber(phoneNum);
		if(result)											// result ��Ģ�� �����Ѵٸ�?
			MyUtil.p("�Ϻ��� ��ȭ��ȣ �Է� �Ϸ�");					// �ڵ����
		else												// ��Ģ�� �������� �ʴ´ٸ�?
			MyUtil.p("�� ���� �� �Է��Ѱų�");					// �ڵ����
	}

	private static boolean chekPhoneNumber(String str) {
		// str�� ��ȭ��ȣ Ÿ������ �˻��Ͽ� ��ȭ��ȣ Ÿ���̸� true return
		// ����3�ڸ� + "-" + ����3-4�ڸ� + "-" + ����4�ڸ�
		String checkRule = "[0-9]{3}[-][0-9]{3,4}[-][0-9]{4}";

		return str.matches(checkRule);
	}


}
