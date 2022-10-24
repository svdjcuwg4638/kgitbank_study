package oop;

// static : ���� ��� ��Ҹ� ���鋚 ����Ѵ� (����� ��,�ٸ���������)
// Ư�� ��ü�� �������� �ʾƵ�, ������ ���εǾ� �ִ� �Ӽ��̳� ����� ���� �� �ִ�
// ��ü�� �������� �ʾƵ�, Ŭ������ ������ �����ϴ�
// ���� Ŭ������ ����ϴ� ��� ��ü�� ������ �� �ִ�

// Ŭ���� : ��ü�� �����ϱ� ���� �ڷ���, ���赵�� ���� ����
// ��ü : Ŭ������ ���� ������� ��ü, ��ü�� ���Ͽ� �Ӽ��̳� ��ɿ� ������ �� �ִ�


class Human {
	String name;
	int age;
	static int count;
	
	Human(String name,int age){
		this.name = name;
		this.age = age;
		count++;
		System.out.println(name + " ��ü�� �����߽��ϴ�!!");
	}
	void show() {
		System.out.printf("%s : %d��\n",name,age);
	}
}

public class Ex06 {
	public static void main(String[] args) {
		System.out.println("Human.count : "+Human.count);
		
		Human ob1 = new Human("������", 30);
		Human ob2 = new Human("ȫ��ȣ", 41);
		
		ob1.show();
		ob2.show();
		
		System.out.println("Human.count : "+Human.count);
		System.out.println("ob1.count : "+ob1.count);
		System.out.println("ob2.count : "+ob2.count);
		
		ob1.count++;
		System.out.println("ob2.count : "+ob2.count);	//�ι�° ��ü�� count�� �����Ǿ��ִ�
//		The static field Human.count should be accessed in a static way
//		HumanŬ������ count�ʵ�� �����ʵ��̹Ƿ�, ������ ������� �����ؾ� �մϴ�
//		�ٽ� ����, ��ü.�ʵ� ����� �ƴ϶�, Ŭ����.�ʵ�� �����ϴ� ���� �ùٸ� ����Դϴ�
		System.out.println("ob2.count : "+Human.count);
		
	}
}
