package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Ex04_Map2 {

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
		LinkedHashMap map = new LinkedHashMap();
		//요건 순서를 유지한다.
		map.put("선풍기", "1000만원");
		map.put("자동차", "100만원");
		map.put("에어컨", "300만원");
		
		System.out.println(map);
		
			
	
	}

}
