package _class;

class Human {
	// �ʵ�
	String name;
	int age;
	
	// ������
	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// �޼���
	void show() {
		System.out.printf("%s : %d��\n", name, age);
	}
}

public class Ex04 {
	public static void main(String[] args) {
		
		String[] names = { "������", "ȫ��ȣ", "��ȣ��", "��ȣ��", "�̺���" };
		int[] ages = 	 { 30, 		41, 	52, 	 42, 	 40 	};
		
		for(int i = 0; i < names.length; i++) {
			System.out.printf("%s : %d��\n", names[i], ages[i]);
		}
		System.out.println();
		
		// Ŭ������ Ȱ���� �ڵ�
		Human h1 = new Human("������", 30);
		Human h2 = new Human("ȫ��ȣ", 41);
		Human h3 = new Human("��ȣ��", 52);
		Human h4 = new Human("��ȣ��", 42);
		Human h5 = new Human("�̺���", 40);
		
		Human[] arr = { h1, h2, h3, h4, h5 };
		
		// �̸��� ���̰� �ϳ��� ��ü�� ���ֱ� ������, ���̸� �������� ��ü�� �����ϸ�
		// �̸��� �ڵ����� �ٲ�� �ִ�
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i].age > arr[j].age) {
					Human tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].show();
		}
		System.out.println();
		
		// ���� �ٸ� �ڷ����� �迭�� ��� ó���Ѵٰ� ����...
		// �迭�� 0��°�� �̸��̰�, �迭�� 1��°�� �����̴�
		Object[] a1 = { "������", 30 };
		Object[] a2 = { "ȫ��ȣ", 41 };
		Object[] a3 = { "��ȣ��", 52 };
		Object[] a4 = { "��ȣ��", 42 };
		Object[] a5 = { "�̺���", 40 };
		
		Object[][] arr2 = { a1, a2, a3, a4, a5 };
		for(int i = 0; i < arr2.length; i++) {
			System.out.printf("%s : %d\n", arr2[i][0], arr2[i][1]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
