package day08_Set_Map_String;

public class Ex08_String {

	public static void main(String[] args) {
		String str = "Java is Easy. �׸��� programming �Ҹ���?";
		System.out.println("�⺻ : "+str);
		String changeStr = new String();
		changeStr = str.toUpperCase();
		System.out.println("toUpperCase ��ȯ: "+changeStr);
		
		changeStr = str.toLowerCase();
		System.out.println("toLowerCase ��ȯ: "+changeStr);

	}

}