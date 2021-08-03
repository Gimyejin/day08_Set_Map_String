package day08_Set_Map_String;
import java.util.*;
public class Ex02_Set {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add("일");
		arr.add("이");
		arr.add("삼");
		
		//set은 index를 이용할 수 없으니 iterator로 이용해서 데이터를 가져옴
		Iterator it = arr.iterator();
		//반복자로 변환해서 it변수에 넣어주겠다.
		//bof | 일 | 이 | 삼 | eof
		//it라는 변수를 이용해서 데이터를 가져온다
		//bof는 시작 eof는 끝이라는 것을 알려줌
		
		System.out.println(it.hasNext());
		//hasNext() <-- 다음 값이 있는지 여부 (true,false)
		//bof뒤에 다음값(일)이 있어서 true나옴
		//(현재 it는 bof를 가리키는 중이라서)
		
		System.out.println(it.next());//일
		System.out.println(it.next());//이
		System.out.println(it.next());//삼
		//next()는 다음 값을 가져온다
		//next()로 it이 한칸이동함.
		//bof를 가리키던 it이 일을 가리키게됨
		
		System.out.println(it.hasNext());//eof자리
		//System.out.println(it.next()); <--에러남
		
		//iterator는 단반향임
		//단반향이란 -> 내용을 다시 쓸려면 새로 만들어야함.
		//arr는 get을 쓰면 되지만 map이나 set은 안됨. -> iterator로 변환
			//연속되게 데이터를 만들어줌.
	}

}
