package day08_Set_Map_String;

import java.util.ArrayList;

import org.apache.commons.lang3.time.StopWatch;

public class Ex06_Test {

	public static void main(String[] args) {
		// ���� �ٸ� ������Ʈ������ ����� ����� �� �� �ִ� ���.
		// �⺻���� �����ܿ� ���� ���� ������Ʈ�� ���̺귯���� ����������.
		/*
		 * ����� ������� ���� ������Ʈ�� export�ϴµ� java>JAR file����>���� ��� ���� ���� �־��ְ� ���� ������
		 * [properties]�� java Build Path > Libraies�� > 'Classpath'Ŭ��> Add External
		 * JARs... Ŭ���ؼ� �Ʊ� ���� jar������ �־��� 
		 */
		int i;
		ArrayList arr =new ArrayList();
		for(i =0;i<1000;i++) {
			arr.add(i);
		}StopWatch a = new StopWatch();
		System.out.println(a);
	}

}
