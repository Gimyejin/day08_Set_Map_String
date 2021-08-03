package day08_Set_Map_String;

public class Ex10_String {

	public static void main(String[] args) {
		String str = "   Have a nice day     ";
		String result = str.trim();
		// trim: 문자열의 양쪽의 공백을 제거

		System.out.println("1." + str);
		System.out.println("2." + result);

		String[] split = result.split(" "); // 특정 무언가로 끊어서 나눔
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);

		String replace = result.replace(" ", "+++");
		System.out.println(replace);
	}

}
