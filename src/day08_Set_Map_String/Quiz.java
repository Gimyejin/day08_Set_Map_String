package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap nemu = new HashMap();
		String name = null;
		int money = 0;
		String key = null;
		while (true) {
			System.out.println("1.�޴� ���");
			System.out.println("2.�޴��� ���� ����");
			System.out.println("3.����");
			System.out.println(">>>");
			int num = input.nextInt();

			switch (num) {
			case 1:
				System.out.print("�޴� �Է�");
				name = input.next();

				if (nemu.containsKey(name)) {
					System.out.println("�����ϴ� �޴��Դϴ�.");
				} else {
					System.out.print("���� �Է�");
					money = input.nextInt();
					nemu.put(name, money);
				}
				break;
			case 2:
				Iterator it = nemu.keySet().iterator();
				while (it.hasNext()) {
					key = (String) it.next();
					System.out.println(key + " : " + nemu.get(key));
				}

				System.out.println("1.���� 2.���� 3.������");
				System.out.println(">>>");
				int num2 = input.nextInt();
				switch (num2) {
				case 1:
					System.out.print("���� �޴� �̸� �Է�: ");
					name = input.next();
					if (nemu.containsKey(name)) {
						System.out.print("���� ���� �Է�");
						money = input.nextInt();

						System.out.println(nemu.get(key) + "->" + money);
						nemu.put(name, money);

					} else
						System.out.println("�޴��� �����ϴ�!!");
					break;
				case 2:
					System.out.print("������ �޴�: ");
					name =input.next();
					nemu.remove(name);
					System.out.println(name+"��/�� �����Ǿ����ϴ�.");
					break;
				case 3:
					break;

				}
				break;
			case 3:
				System.exit(1);
			}

		}

	}

}
