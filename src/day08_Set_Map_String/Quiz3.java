package day08_Set_Map_String;

public class Quiz3 {

	public static void main(String[] args) {
		String str = "�谳�� -2017��\nȫ�浿���� -2015��\n���켱�� -2018��";
		String[] str2 = str.split("\\n");
		String str4 ="";
		str = str.replace('-', ':');
		String[] str3 = str.split("\\n");
		for (int i = 0; i < str3.length; i++) {
			String[] cut=str3[i].split(":");
			cut[1]="1999��";
		str4 += (cut[0]+":"
				+ ""+cut[1]+"\n");
		}

		System.out.println("====���� �� str====");
		for (int i = 0; i < str2.length; i++) {
			System.out.println(str2[i]);
		}
		System.out.println("====���� �� str====");
		System.out.println(str4);
	}

}
