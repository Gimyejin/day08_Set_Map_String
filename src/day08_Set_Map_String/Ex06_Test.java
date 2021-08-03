package day08_Set_Map_String;

import java.util.ArrayList;

import org.apache.commons.lang3.time.StopWatch;

public class Ex06_Test {

	public static void main(String[] args) {
		// 서로 다른 프로젝트에서의 기능을 끌어다 쓸 수 있는 방법.
		// 기본으로 제공외에 것은 현재 프로젝트에 라이브러리에 등록해줘야함.
		/*
		 * 기능을 끌어오고 싶은 프로젝트를 export하는데 java>JAR file선택>만들 장소 저장 이제 넣어주고 싶은 곳에서
		 * [properties]들어감 java Build Path > Libraies탭 > 'Classpath'클릭> Add External
		 * JARs... 클릭해서 아까 만든 jar파일을 넣어줌 
		 */
		int i;
		ArrayList arr =new ArrayList();
		for(i =0;i<1000;i++) {
			arr.add(i);
		}StopWatch a = new StopWatch();
		System.out.println(a);
	}

}
