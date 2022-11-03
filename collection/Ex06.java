package collection;

import java.util.ArrayList;

class Human {
	private String name;
	private int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.printf("�̸� : %s, ���� : %d��\n",name,age);
	}
	
	@Override
	public String toString() {
		return String.format("�̸� : %s, ���� : %d��",name,age);
	}
}

public class Ex06 {
	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList();
		
		list1.add(10);
		list1.add(20);
		list1.add(3.14);
		
		Human ob1 = new Human("������", 30);
		list1.add(ob1);
		
		System.out.println(list1);
		// �迭�� �޸� ����Ʈ�� ���� �ٸ� �ڷ����� �����͵� ���� �� �ִ�!!
		
		ArrayList list2 = new ArrayList();
		Human ob2 = new Human("ȫ��ȣ", 41);
		
		list2.add(ob1);
		list2.add(ob2);
		System.out.println(list2);
		for (int i = 0; i < list2.size(); i++) {
			Human element = (Human)list2.get(i);
			element.show();
		}
		// ���� ����(element)�� Object Ÿ���̸�, ��ü �޼��带 ȣ���ϱ� ���� ������ �ٿ�ĳ������ �ؾ��Ѵ�
		
		// �ڹ� 1.5���� ���� �߰��� ���׸� Ÿ�� ������ �����Ͽ� ������ �ذ�
		// Ư�� Ŭ������ ��ü�� �����ϴ� ����Ʈ
		ArrayList<Human> list3 = new ArrayList<Human>();
		list3.add(ob1);
		list3.add(ob2);
		for (int i = 0; i < list3.size(); i++) {
			list3.get(i).show();
		}
		
		// ���� for�� (index�� ������� �ʴ� for��, forEach��� ������ �Լ��̸��� �ߺ��ǹǷ�..)
		// Iterable �� Ÿ�Կ� ���ؼ� ������ �� ����(�迭 ����)
		
		for(Human element : list3) {
			element.show();
		}System.out.println();
		
		// list�� forEach�Լ��� ������ �����Ѵ�
		list3.forEach(element -> element.show());
		
		// toString�� �������̵� �Ǿ� �ִٸ� System.out.println�� ������ ���� �ִ�
		list3.forEach(System.out::println);
		
		// list3�� �� ��Ҹ� System.out ��ü ������ println �޼����� ���ڷ� �����Ѵ�
		
		
	}
}
