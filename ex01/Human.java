package ex01;

// DTO or VO
// ���� ��ü�� ǥ���ϱ� ���� �ڷ���

// ���� ��ü���� ǥ��

public class Human {
	String name;	// ���� Human ��ü�� �����ϱ� ���� ���ذ����� name�� ��������
					// name�� �ٸ� Human�� name�� ���� ���� ���� �� ����
	int age;
	
	Human(String name,int age){
		this.name = name;
		this.age = age;
		
	}
	String toStr() {
		String str = String.format("�̸� : %s, ���� : %d��",  name,age);
		return str;
	}
}
