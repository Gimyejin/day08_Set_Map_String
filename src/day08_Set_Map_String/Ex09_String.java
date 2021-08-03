package day08_Set_Map_String;

public class Ex09_String {

	public static void main(String[] args) {
		String str = new String("abcdefg");
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		//charAt(index) 인덱스 번호자리 하나를 뽑음
		
		str += "안녕하세요";
		System.out.println(str);
		
		//문자 1개 비교하기
		System.out.println(str.charAt(0)=='a');
		
		System.out.println(str.equals("abcdefg안녕하세요"));//true
		
		System.out.println((str.charAt(0)-32)); //65
		System.out.println((char)(str.charAt(0)-32)); //A
	}

}
