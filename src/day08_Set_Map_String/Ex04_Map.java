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
		 -HashTable ...���
		 HashMap
		 -Ű�� ���� ���̴�
		 -������ �������� �ʴ´�
		 -Ű�� ���� �ߺ��� ������� �ʴ´�. 
		 */
		HashMap map = new HashMap();
		map.put("��ǳ��", "1000����");
		map.put("�ڵ���", "100����");
		map.put("������", "300����");
		
		System.out.println(map);
		System.out.println(map.get("��ǳ��"));
		//map.get(key)
		
		System.out.println(map.containsKey("������"));
		//�ش��ϴ� Ű�� �ִ°�.
		
		System.out.println(map.containsValue("300����"));
		//�ش��ϴ� ���� �ִ°�
		
		System.out.println(map.remove("������"));
		System.out.println(map.containsKey("������"));
		System.out.println(map);
		
		System.out.println(map.keySet());
		//set�ڷ������� ��ȯ�� (������ ����)
		
		Set s = map.keySet();
		Iterator it = s.iterator();
		//Iteator it = map.keySet().iterator(); <-���� ������ ���ٷ� ����
		
		while(it.hasNext()) {
			String key = (String)it.next();
			System.out.println(key+" : "+map.get(key));
			
		}
	}

}
