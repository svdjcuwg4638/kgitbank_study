package collection;

import java.util.ArrayList;

public class Ex05 {
	public static void main(String[] args) {
		
		
		// �迭�� �����ϰ� ����� �� �ִ� ����Ʈ
		ArrayList list = new ArrayList();
		
		// ����Ʈ(�� �÷���)���� �ڷ����� ������� ��� �����͸� �߰��� �� �ִ�
		System.out.println("����Ʈ�� ũ�� : "+list.size());
		list.add(10);
		list.add(20);
		list.add("itbank");
		list.add(20);	//�ߺ��� ������ �߰�
		
		System.out.println("����Ʈ�� ũ�� : "+list.size());
		System.out.println(list); // toString�� �������̵� �Ǿ��־ ����ϸ� ��
		
		Object v1 = list.get(0); // arr[0]
		Object v2 = list.get(1); // arr[1]
		System.out.println(v1);
		System.out.println(v2);
	}
	
}
