package day08_Set_Map_String;

public class Ex09_String {

	public static void main(String[] args) {
		String str = new String("abcdefg");
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		//charAt(index) �ε��� ��ȣ�ڸ� �ϳ��� ����
		
		str += "�ȳ��ϼ���";
		System.out.println(str);
		
		//���� 1�� ���ϱ�
		System.out.println(str.charAt(0)=='a');
		
		System.out.println(str.equals("abcdefg�ȳ��ϼ���"));//true
		
		System.out.println((str.charAt(0)-32)); //65
		System.out.println((char)(str.charAt(0)-32)); //A
	}

}
