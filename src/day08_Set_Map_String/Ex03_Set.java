package day08_Set_Map_String;
import java.util.*;
public class Ex03_Set {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("��");
		set.add("��");
		set.add("��");
		System.out.println("set : "+set);
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Object o = it.next();//next()�� object�� ��ȯ��
			String s = (String)o;
			//String s = (String)it.next(); �� ���ٷ� �� �� ����
			
			System.out.println(it.next());
		}
	}

}
