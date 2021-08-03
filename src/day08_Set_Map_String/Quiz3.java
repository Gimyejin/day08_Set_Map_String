package day08_Set_Map_String;

public class Quiz3 {

	public static void main(String[] args) {
		String str = "김개똥 -2017년\n홍길동구리 -2015년\n선우선녀 -2018년";
		String[] str2 = str.split("\\n");
		String str4 ="";
		str = str.replace('-', ':');
		String[] str3 = str.split("\\n");
		for (int i = 0; i < str3.length; i++) {
			String[] cut=str3[i].split(":");
			cut[1]="1999년";
		str4 += (cut[0]+":"
				+ ""+cut[1]+"\n");
		}

		System.out.println("====변경 전 str====");
		for (int i = 0; i < str2.length; i++) {
			System.out.println(str2[i]);
		}
		System.out.println("====변경 후 str====");
		System.out.println(str4);
	}

}
