package day08_Set_Map_String;
import java.util.*;
public class Ex02_Set2 {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add("ÀÏ");
		arr.add("ÀÌ");
		arr.add("»ï");
		
		Iterator it = arr.iterator();
		for(int i=0;i<arr.size();i++) {
			System.out.println(it.hasNext());
			System.out.println(it.next());
		}
		
	}

}
