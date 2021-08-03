package day08_Set_Map_String;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {
		// 1번
		String str = "Hava a nice day Hava a nice day Hava a nice day";
		ArrayList count = new ArrayList();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a')
				count.add(i);
		}
		System.out.println(count);

		System.out.println("------------------------------------------------");
		// 2번
		String str2 = "It is a fun java programming";
		int count1 = 0, count2 = 0;
		for (int i = 0; i < str2.length(); i++) {
			if (str2.charAt(i) == 'a')
				count1++;
			else if (str2.charAt(i) == 'g')
				count2++;
		}
		System.out.println("총 개수: " + str2.length());
		System.out.println("a 개수: " + count1);
		System.out.println("g 개수: " + count2);

		System.out.println("------------------------------------------------");
		// 3번
		String str3 = new String("tESt sTring    change    first");
		String changeStr = new String();
		int k = 0;
		System.out.println("변경 전: " + str3);

		str3 = str3.toLowerCase();
		if (str3.charAt(0) >= 'a' && str3.charAt(0) <= 'z') {// 첫 문장 대문자로만듬
			changeStr += (char) (str3.charAt(k) - 32);
			k++;
		}
		while (k < str3.length()) {
			if (str3.charAt(k) != ' ') {// 대문자 이외 붙여주기
				changeStr += str3.charAt(k);
				k++;
				continue;
			}
			while (str3.charAt(k) == ' ') {// 공백 붙여주기
				changeStr += str3.charAt(k);
				k++;
			}
			if (str3.charAt(k) >= 'a' && str3.charAt(k) <= 'z') {// 공백 뒤 첫문장을 대문자로 만듬
				changeStr += (char) (str3.charAt(k) - 32);
				k++;
			}
		}

		System.out.println("변경 후: " + changeStr);
	}

}
