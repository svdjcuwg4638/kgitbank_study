package accessModifier;

class Student{
	String name;
	int score;
	
	public Student(String name,int score) {
		this.name = name;
		this.score=score;
		
	}
}

class Student2{
	private String name;
	private int score;
	Student2(String name, int score) {
		
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}	
}





public class Ex02 {
	public static void main(String[] args) {
		
		// ���� �����ڸ� �������� ���� ���
		Student st1 = new Student("������", 99);
		System.out.println(st1.name + " �� ������ " + st1.score + "�� �Դϴ�.");
		
		//���������ڸ� �����ϰ�, getter�� ����� ���
		Student2 st2 = new Student2("ȫ��ȣ", 22);
		System.out.println(st2.getName() + "�� ������" + st2.getScore() + "�� �Դϴ�.");
		// Student 2 Ŭ���������� ���� �����ϴ� �Լ�(setter) �� ���� ������
		// ���� ���Ƿ� ������ �� ���� �����̴�
		
		// �Ϲ������� Ŭ������ �ۼ��� ��, field�� private�� ����
		// �޼���� public�� ����
		// ��, ���ο����� ����� �뵵�� �޼���� private�� ������ �� �ִ�
		// �����ڴ� Ư���� ��츦 �����ϰ�� public�� �����Ѵ�
		
		
				
	}
}
