package day08_Set_Map_String;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {
		// 1��
		String str = "Hava a nice day Hava a nice day Hava a nice day";
		ArrayList count = new ArrayList();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a')
				count.add(i);
		}
		System.out.println(count);

		System.out.println("------------------------------------------------");
		// 2��
		String str2 = "It is a fun java programming";
		int count1 = 0, count2 = 0;
		for (int i = 0; i < str2.length(); i++) {
			if (str2.charAt(i) == 'a')
				count1++;
			else if (str2.charAt(i) == 'g')
				count2++;
		}
		System.out.println("�� ����: " + str2.length());
		System.out.println("a ����: " + count1);
		System.out.println("g ����: " + count2);

		System.out.println("------------------------------------------------");
		// 3��
		String str3 = new String("tESt sTring    change    first");
		String changeStr = new String();
		int k = 0;
		System.out.println("���� ��: " + str3);

		str3 = str3.toLowerCase();
		if (str3.charAt(0) >= 'a' && str3.charAt(0) <= 'z') {// ù ���� �빮�ڷθ���
			changeStr += (char) (str3.charAt(k) - 32);
			k++;
		}
		while (k < str3.length()) {
			if (str3.charAt(k) != ' ') {// �빮�� �̿� �ٿ��ֱ�
				changeStr += str3.charAt(k);
				k++;
				continue;
			}
			while (str3.charAt(k) == ' ') {// ���� �ٿ��ֱ�
				changeStr += str3.charAt(k);
				k++;
			}
			if (str3.charAt(k) >= 'a' && str3.charAt(k) <= 'z') {// ���� �� ù������ �빮�ڷ� ����
				changeStr += (char) (str3.charAt(k) - 32);
				k++;
			}
		}

		System.out.println("���� ��: " + changeStr);
	}

}
