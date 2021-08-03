package day08_Set_Map_String;
import java.util.*;
public class Ex03_Set {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("일");
		set.add("이");
		set.add("삼");
		System.out.println("set : "+set);
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Object o = it.next();//next()가 object로 반환됨
			String s = (String)o;
			//String s = (String)it.next(); 로 한줄로 쓸 수 있음
			
			System.out.println(it.next());
		}
	}

}
