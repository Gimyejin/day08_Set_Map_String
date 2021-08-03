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
			System.out.println("1.메뉴 등록");
			System.out.println("2.메뉴별 가격 보기");
			System.out.println("3.종료");
			System.out.println(">>>");
			int num = input.nextInt();

			switch (num) {
			case 1:
				System.out.print("메뉴 입력");
				name = input.next();

				if (nemu.containsKey(name)) {
					System.out.println("존재하는 메뉴입니다.");
				} else {
					System.out.print("가격 입력");
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

				System.out.println("1.수정 2.삭제 3.나가기");
				System.out.println(">>>");
				int num2 = input.nextInt();
				switch (num2) {
				case 1:
					System.out.print("변경 메뉴 이름 입력: ");
					name = input.next();
					if (nemu.containsKey(name)) {
						System.out.print("수정 가격 입력");
						money = input.nextInt();

						System.out.println(nemu.get(key) + "->" + money);
						nemu.put(name, money);

					} else
						System.out.println("메뉴가 없습니다!!");
					break;
				case 2:
					System.out.print("삭제할 메뉴: ");
					name =input.next();
					nemu.remove(name);
					System.out.println(name+"이/가 삭제되었습니다.");
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
