package day08_Set_Map_String;
import java.util.*;
public class Ex02_Set {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add("��");
		arr.add("��");
		arr.add("��");
		
		//set�� index�� �̿��� �� ������ iterator�� �̿��ؼ� �����͸� ������
		Iterator it = arr.iterator();
		//�ݺ��ڷ� ��ȯ�ؼ� it������ �־��ְڴ�.
		//bof | �� | �� | �� | eof
		//it��� ������ �̿��ؼ� �����͸� �����´�
		//bof�� ���� eof�� ���̶�� ���� �˷���
		
		System.out.println(it.hasNext());
		//hasNext() <-- ���� ���� �ִ��� ���� (true,false)
		//bof�ڿ� ������(��)�� �־ true����
		//(���� it�� bof�� ����Ű�� ���̶�)
		
		System.out.println(it.next());//��
		System.out.println(it.next());//��
		System.out.println(it.next());//��
		//next()�� ���� ���� �����´�
		//next()�� it�� ��ĭ�̵���.
		//bof�� ����Ű�� it�� ���� ����Ű�Ե�
		
		System.out.println(it.hasNext());//eof�ڸ�
		//System.out.println(it.next()); <--������
		
		//iterator�� �ܹ�����
		//�ܹ����̶� -> ������ �ٽ� ������ ���� ��������.
		//arr�� get�� ���� ������ map�̳� set�� �ȵ�. -> iterator�� ��ȯ
			//���ӵǰ� �����͸� �������.
	}

}
