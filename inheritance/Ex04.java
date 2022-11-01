package inheritance;

// Ŭ������ ��Ӱ��踦 �̿��Ͽ� ���� �Ӽ��� ����Ŭ������,
// ���� �Ӽ��� ������ ���� Ŭ������ ������ش�

// �ڹ� ��ü ������ Ư¡
// 1. ĸ��ȭ : ���� �ٸ� �ڷ����� �Ӽ��� ����� �ϳ��� ��ü�� ��� ó���Ѵ�

// 2. ��� : �⺻ Ŭ������ Ư���� �����޾� ���ο� Ŭ���� �ۼ�
// - �ʵ�� �޼���� ��� �����޴´� (private ����, protected)
// - ���������ڴ� �����ϰ� ����޴´�
// - �����ڴ� ��� �����̵� ����Ŭ������ �����ڸ� ȣ���ؾ� �Ѵ�
// - �������̵� �޼���� ������������ ������ ���� �� ����
// - �������̵� �޼���� ��ȯ��, �Լ��̸�, �Ű������� Ÿ�԰� ������ ��� ��ġ�ؾ� �Ѵ�
// - final �ʵ�� ���� ������ �� ����
// - final �޼���� �������̵� �� �� ���� ( ������ ������ �� ����)

// 3. �߻�ȭ :	��üȭ�� �� ���� Ŭ����, ��ü���� ���� �Ӽ��� �̾Ƽ� �����

// 4. ������ :	�ϳ��� ��ü�� ����Ŭ������ ������ �� �ְ�, ����Ŭ�����ε� ������ �� �ִ�
// - ����Ŭ������ ��ü�� ����Ŭ������ �����ϴ� ������ up-casting�̶�� �Ѵ�
// - up-casting �� ��ü�� �ٽ� ������ ����Ŭ������ ����ȯ�ϸ� down-casting�̶�� �Ѵ�
// - ���� �ٸ� ������ ��ü�� ��� ó���Ϸ��� up-casting�� �����Ѵ�
// - �� ��ü�� ���� �޼��带 �����Ϸ��� down - cansting�� �����Ѵ�
// - up-casting �� ���¿����� �������̵� �޼���� �����ϰ� ȣ���� �� �ִ�
// - up-casting �� ��ü�� Ư�� Ŭ������ ��ü�� �´��� Ȯ���ϱ� ���� instanceof �����ڸ� ����Ѵ�
// - �ڹ��� ��� ��ü�� object Ŭ������ ����ϰ� �Ǿ� �ִ�

class Human{
	String name;
	int age;
	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void show() {
		System.out.printf("�̸� : %s ���� : %d��\n ",name,age);
	}
	
}

class Student extends Human{
	int score;
	
	Student(String name,int age,int score){
		super(name,age);
		this.score = score;
	}
	@Override
	void show() {
		System.out.printf("�̸� : %s ���� : %d�� ���� : %d\n ",name,age,score);
	}
	
}
class Doctor extends Human{
	String major;
	
	Doctor(String name,int age,String major){
		super(name,age);
		this.major =major;
	}
	// Doctor Ŭ���� ���� ��� (ġ��) �������̵��� �ƴ�
	void heal(Human other) {
		System.out.printf("%s�� %s�� ġ���մϴ�.",this.name,other.name);
	}
	@Override
	void show() {
		
		System.out.printf("�̸� : %s ���� : %d�� %s ������\n ",name,age,major);
	}
	
}

public class Ex04 {
	public static void main(String[] args) {
		Student st1 = new Student("������", 30, 99);
		Student st2 = new Student("ȫ��ȣ", 41, 92);
		Doctor d1 = new Doctor("������", 36, "�Ű�ܰ�");
		Doctor d2 = new Doctor("����", 45, "����");
		
		st1.show();
		st2.show();
		d1.show();
		d2.show();
		
		Human h1 = st1; 	//�л��� ����̴�
		Human h2 = st2; 
		Human h3 = d1; 		// �ǻ�� ����̴�
		Human h4 = d2; 
		
		System.out.println(h1.name);
		System.out.println(h2.name);
		System.out.println(h3.name);
		System.out.println(h4.name);
		
//		System.out.println(h1.score);	//score cannot be resolved or is not a field
		System.out.println(((Student)h2).score);	// ���� ����ȯ
//		System.out.println(h3.major);
		System.out.println(((Doctor)h4).major);
		
		// �������� ���� ���� �ٸ� Ÿ���� ������ �� ������, Ÿ�Կ� ���� ���������� �ʵ� ������ �޶�����
		
		h1.show();	// show() �޼���� Human Ÿ�Կ� ���ǵǾ� �־ ȣ���� �����ϴ�
		h2.show();	// �� ��ü�� �޼���� ����Ŭ������ ���� �������̵�(������)�Ǿ� �ִ�
		h3.show();	// ȣ���� ����������, ȣ���� �� ����Ǵ� ������ ����� �������� ����ȴ�
		h4.show();	// ���� ����ȯ�� ��� ���� Ŭ������ ������ ����ȴ�
		
		
		((Doctor)h4).heal(h2);	// �������̵��� �ƴ϶� ���� ����ȯ�� �ʿ��ϴ�
		
		// ���� �ڷ����� ���������͸� ��� �����ϴ� ���� : �迭
		Human[] arr = {h1,h2,h3,h4};
		
		for(int i =0; i<arr.length;i++) {
			arr[i].show();
		}
	}
}
