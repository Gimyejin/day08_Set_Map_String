package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex04_Map {

	public static void main(String[] args) {
		/*
		 Map
		 -HashMap
		 -TreeMap
		 -HashTable ...등등
		 HashMap
		 -키와 값의 쌍이다
		 -순서는 유지되지 않는다
		 -키에 대한 중복은 허용하지 않는다. 
		 */
		HashMap map = new HashMap();
		map.put("선풍기", "1000만원");
		map.put("자동차", "100만원");
		map.put("에어컨", "300만원");
		
		System.out.println(map);
		System.out.println(map.get("선풍기"));
		//map.get(key)
		
		System.out.println(map.containsKey("에어컨"));
		//해당하는 키가 있는가.
		
		System.out.println(map.containsValue("300만원"));
		//해당하는 값이 있는가
		
		System.out.println(map.remove("에어컨"));
		System.out.println(map.containsKey("에어컨"));
		System.out.println(map);
		
		System.out.println(map.keySet());
		//set자료형으로 반환함 (순서가 없음)
		
		Set s = map.keySet();
		Iterator it = s.iterator();
		//Iteator it = map.keySet().iterator(); <-위에 두줄을 한줄로 정리
		
		while(it.hasNext()) {
			String key = (String)it.next();
			System.out.println(key+" : "+map.get(key));
			
		}
	}

}
